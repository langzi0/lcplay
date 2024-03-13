package Common;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.stream.Collectors;

public class Main {

  static ArrayList<InvokableBase> listPrograms = new ArrayList<>();

  static public void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
    List<String> packages = Arrays.asList("CodePad", "Lang", "Question", "LanguageTip","Unsorted");
    try {
      System.out.println("runTopPriorityFromPackages...");
      runTopPriorityFromPackages(packages);
    } catch (Throwable th){
      System.out.println("Quit because:" + th.getMessage());
    }
  }

  static void runTopPriorityFromPackages(List<String> packagesStartNames) {
    ClassLoader classLoader = Main.class.getClassLoader();
    List<Class<?>> allClasses =  packagesStartNames.stream().map(Main::getClassesInPackage)
        .flatMap(list->list.stream())
        .collect(Collectors.toList());

    Integer topPriority = allClasses.stream().map(a -> {
      try {
        Class aClass = classLoader.loadClass(a.getName());
        if (aClass.getSuperclass() == InvokableBase.class) {
          InvokableBase obj = (InvokableBase) aClass.getDeclaredConstructor().newInstance();
          return obj.getRunPriority().getDaySeq();
        }
      } catch (Exception e) {
      }
      return -1;
    }).max(Integer::compareTo).orElse(0);

    allClasses.stream().forEach(a -> {
      try {
        Class aClass = classLoader.loadClass(a.getName());
        if (aClass.getSuperclass() == InvokableBase.class) {
          InvokableBase obj = (InvokableBase) aClass.getDeclaredConstructor().newInstance();
          if (obj.getRunPriority().getDaySeq() >= topPriority) {
            System.out.println("running " + a.getName() + " and priority is " + obj.getRunPriority().getDaySeq()/100);
            obj.run();
          }
        }
      }
      catch (Throwable th) {
        System.out.println("*** Caught error when finding and run the class! ");
        th.printStackTrace();
      }

    });

  }

  private static final List<Class<?>> getClassesInPackage(String packageNameStarter) {
    String path = packageNameStarter.replaceAll("\\.", File.separator);
    List<Class<?>> classes = new ArrayList<>();
    String[] classPathEntries1 = System.getProperty("java.class.path").split(
        System.getProperty("path.separator")
    );

    List<String> classPathEntries = Arrays.stream(classPathEntries1).filter(m->!m.contains(".m2")).collect(Collectors.toList());
    String name;
    for (String classpathEntry : classPathEntries) {
      if (classpathEntry.endsWith(".jar")) {
        File jar = new File(classpathEntry);
        try {
          JarInputStream is = new JarInputStream(new FileInputStream(jar));
          JarEntry entry;
          while((entry = is.getNextJarEntry()) != null) {
            name = entry.getName();
            if (name.endsWith(".class")) {
              if (name.contains(path) && name.endsWith(".class")) {
                String classPath = name.substring(0, entry.getName().length() - 6);
                classPath = classPath.replaceAll("[\\|/]", ".");
                classes.add(Class.forName(classPath));
              }
            }
          }
        } catch (Throwable ex) {
          // Silence is gold
        }
      } else {
        try {
          File base = new File(classpathEntry + File.separatorChar + path);
          // Need to find all files listed recursively
          Collection<File> files = FileUtils.listFilesAndDirs(
              base,
              new RegexFileFilter("^(.*class)"),
              DirectoryFileFilter.DIRECTORY
          );

        for (File file : files) {
            name = file.getName();
            if (name.endsWith(".class")) {
              name = file.getAbsolutePath().substring(file.getAbsolutePath().indexOf(packageNameStarter),
                  file.getAbsolutePath().indexOf(".class")).replace(File.separatorChar, '.');
              classes.add(Class.forName(name));
            }
          }
        } catch (Throwable ex) {
          System.out.print(ex.getStackTrace());
          // Silence is gold
        }
      }
    }

    return classes;
  }

  static void runTopPriority() {
    Integer topPriority = listPrograms.stream().
        mapToInt(p -> p.getRunPriority().getDaySeq()).max().orElse(0);
    listPrograms.stream().filter(p -> p.getRunPriority().getDaySeq().equals(topPriority))
        .forEach(p -> callInvaokeableRunMethod(p));

  }

  static void runCategory(Category category) {
    listPrograms.stream().filter(p -> p.getRunPriority().Cat == category)
        .forEach(InvokableBase::run);
  }

  static void runCategoryTopPriority(Category category) {
    Integer topPriority =
        listPrograms.stream().filter(p -> p.getRunPriority().Cat == category)
            .mapToInt(p -> p.getRunPriority().getDaySeq()).max()
            .orElse(0);

    listPrograms.stream().filter(p -> p.getRunPriority().Cat == category)
        .filter(p -> (p.getRunPriority().getDaySeq().equals(topPriority)))
        .forEach((p) -> {
          callInvaokeableRunMethod(p);
          p.run();
        });
  }

  static void callInvaokeableRunMethod(InvokableBase b) {
    try {
      System.out.println("_____________________________________________________________");
      System.out.println(
          "Start running class:" + b.getClass().getName() + " priority:" + b.getRunPriority()
              .getDaySeq()
          + " Category:"
          + b.getRunPriority().Cat.toString());
      b.run();
      System.out.println("Done with: " + b.getClass().getName());
    } catch (Exception e) {

      e.printStackTrace();


    } finally {
      System.out.println("_____________________________________________________________");
    }
  }
}
