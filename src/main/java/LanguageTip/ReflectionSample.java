package LanguageTip;

import java.lang.reflect.Method;
import java.sql.Connection;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Created by @author  @since 9/20/15.
 */
public class ReflectionSample extends InvokableBase {

  public static void main(String args[]) {
    try {

      Class c = Class.forName("java.lang.String");
      System.out.println("class name is" + c.getName());

      Method m[] = c.getDeclaredMethods();

      String obj = (String) c.getDeclaredConstructor().newInstance();
      Class x = obj.getClass();
      System.out.println("class name's new object name is" + x.getName());


      for (int i = 0; i < m.length; i++) {
        System.out.println(String.format("m[%d]= %s", i, m[i].toString()));
        if (m[i].getName().contains("Length")){
          m[i].invoke(null);
        }


      }


    } catch (Throwable e) {
      System.err.println(e);
      throw new RuntimeException(e.getMessage());
    }
  }


  @Override
  public Priority getRunPriority() {
    return new Priority(220827, 0, Category.LeetCode);
  }

  @Override
  public void run() {
    ReflectionSample.main(null);
  }
}