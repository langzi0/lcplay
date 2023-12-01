package Lang;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

/**
 * Created by @author  @since 8/10/15.
 */
public class JavaLang extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(220903, 01, Category.notClassified);
    }

    public void run() {

        run_lamdaAsFunction();
        run_lamdaEventHandling();
        method_parameter_modification();
        run_lamdaAsStream();
        run_futureList();
        run_interface_anonymous_class();
        test_integer_max_min();

    }


    private int findMin(int[] arry) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min)
                min = arry[i];
        }
        return min;
    }

    private int findMin1(int[] arry) {
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < min)
                min = arry[i];
        }
        return min;
    }

    private boolean isArrayIncreasingFor(ArrayList<Integer> list) {
        if (list.size() <= 1)
            return true;

        boolean flag = false;
        for (int i = 1; i < list.size() && !flag ; i++) { //using for loop and add a flag to quit for
            if (list.get(i-1) > list.get(i))
                return false;
        }
        return true;
    }

    private boolean isArrayIncreasingWhile(ArrayList<Integer> list) {
        if (list.size() <= 1)  return true;

        boolean flag = false;
        int i = 1;
        while (i < list.size() && !flag ) { //using while loop
            if (list.get(i-1) > list.get(i))
                flag = true;
            i++;
        }
        if (flag) {
            // dosomething
        }
        return !flag;
    }


    private Integer isArrayIncreasing_DoSomething(int[][] a) {
        // find how many rows that has increasing order
        Integer countOfInc = 0;
        for (int r = 0; r< a.length; r++)
        {
            boolean isIncreasing = true;
            for (int c = 1; c< a[0].length && isIncreasing; c++){
                if (a[r][c-1] >= a[r][c])
                    isIncreasing = false;
            }
            if (isIncreasing)
                countOfInc ++;
        }
        return countOfInc;
    }


    private void run_futureList() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> getSum = executor.submit(() -> {
            //Future 's exception will not checked, what to do then?
            Thread.sleep(10000);
            return 0;
        });
        Callable task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        };

        Future<Integer> getSum1 = executor.submit(task);

        try {
            getSum1.get();
        } catch (ExecutionException | InterruptedException ex) {
            ex.getCause().printStackTrace();
        }


        while (!getSum.isDone()) {
            try {
                Integer integer = getSum.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            out.println("waiting! ");
            //This exception is checked.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //close the pool
        executor.shutdown();


    }

    private void test_integer_max_min() {
        out.println("test_integer_max_min:" + Integer.MAX_VALUE);
        // 4byte 32bit: 2 << 30 is -2147483648    2 <<29 = 1073741824  Integer.MAX_VALUE 2147483647 = 2^31 -1 = 2147483647
        out.println("test_integer_max_min:" + (2 << 30) + " 2<< 29=" + (2 << 29) + " " + (Integer.MAX_VALUE - (2 << 30)));

    }


    // Anonymous class
    class ProgrammerInterview {

        // java.lang is special namespace
        // System is a class, out is a static variable that is lower case.
        // public static final PrintStream out
        public void read() {
            out.println("Programmer Interview!");
        }
    }

    class Website {
        /*  This creates an anonymous inner class: new inner class return */

        ProgrammerInterview pInstanceOfInnerclass = new ProgrammerInterview() {
            public void read() {
                out.println("anonymous ProgrammerInterview");
            }
        };
        ProgrammerInterview pInstanceOfProgrammerInterview = new ProgrammerInterview();
    }

// 22222222222222222222222222222222222222222222222222222222222222222222

    // Anonymous interface
    interface Handler<E> {

        // Foo() is the name of the inner class converted to
        void handle(E e);
    }

    // new Anoymouse class object Sytax:
    // new operator;
    // the name of an interface to implement(Handler or a class to extend
    // () : for interface no constructor parameter, but for class to extend, you can put paraemeters
    // body, same as a class declaration body, but extends the interface/class name.
    // ; // end of instances which is should be assigned to a variable.

    private void run_interface_anonymous_class() {

        // This is to create an interface referring to
        // anonymous inner class without a name.
        // An anonymous class is defined and instantiated in a single succinct expression using the new operator.

        // this content inside{} is anonymous innerclass's instance and handed to Handler interface.

        //  http://www.programmerinterview.com/index.php/java-questions/java-anonymous-class-example/
        // new Foo(){ void someMethod()}

        // { void someMethod()} is the inner anonymous class.

        Handler<Integer> handler = x -> {
            String i = "0";

            out.print(i);
        };

// pass in the variable into the anonymous class.
//    int myVariable = 1;
//
//    handler = new Handler<Integer>() {
//      private int anonVar;
//      public void handle(Integer e) {
//        // How would one access myVariable here?
//        // It's now here:
//        System.out.println("Initialized with value: " + e.toString());
//      }
//      private Handler init(int var){
//        anonVar = var;
//        return this;
//      }
//    }.init(myVariable)  );
        Util.ref(handler);
    }


//

    class MyClass {
        public int val;
    }

    void checkVar(Integer xi, int[] ar/* will change value in caller */,
                  MyClass myObject/* will change value in caller */) {
        // All the raw type wrapped
        // Integer type is immutable,  which is like String, so xi will only pass a value into the method
        xi = 1;

        // this will be passed back as the address of ar is passed, still changing the old address pointed content.
        ar[0] = xi;
        myObject.val = xi;
    }

    void method_parameter_modification() {

        // all primitive  boxer are immutable.
        Integer xi = 1;

        // iArray.length is the final int
        int[] iArray = new int[]{100};

        MyClass myObject = new MyClass();

        checkVar(xi, iArray, myObject);

        Util.assertEq("Integer xi  not modified", 1, xi);
        Util.assertEq("int array elements  modified", 1, iArray[0]);
        Util.assertEq("myObject's val is modified", 1, myObject.val);

    }

    void run_lamdaAsFunction() {
        //Before Java 8:
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                out.println("Before Java8, too much code for too little to do");
            }
        });

        try {
            // //wait for this thread to die.
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
        out.println("Before or after? Before Java8, too much code for too little to do");

        //Java 8 way:
        new Thread(
            () -> out.println("In Java8, Lambda expression rocks !!")
        ).start();

        // Read more:http:
        //javarevisited.blogspot.com/2014/02/10-example-of-lambda-expressions-in-java8.html#ixzz3mKi4BiYI
    }

    void run_lamdaEventHandling() {

        //Prior Java 8 :
        List features0 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features0) {
            out.println((String) feature);
        }

        //In Java 8:
        List features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features1.forEach(n -> out.println(n));

// Even better use Method reference feature of Java 8
// method reference is denoted by :: (double colon) operator
// looks similar to score resolution operator of C++
        features1.forEach(out::println);

    }

    void run_lamdaAsStream() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(1, "n1"));
        fooList.add(new Foo(2, "n2"));
        fooList.remove(0);
        int x = fooList.size();
        fooList.toArray();

        fooList.stream().filter(p -> p.value != 100).map(p -> p.value).reduce(0, (a, b) -> a + b);


        Stream<Foo> stream = fooList.stream();
        //Stream<Person> parallelStream = persons.parallelStream();
        Stream<Foo> filterSterm = stream.filter(p -> p.value > 1);
        filterSterm.forEach(p -> out.println(p.name));
//        // Or map the result out to be print out.
//        filterSterm.map(p -> p.name).forEach(out::println);
        //Typical filter , map, forEach do action

        fooList.stream().filter(p -> p.value == 2)
            .map(p -> new Bar(p.value * p.value))
            .forEach(bar -> out.println("bar is" + bar.bar));
        fooList.stream().filter(p -> p.value == 2)
            .map(p -> new Bar(p.value * p.value))
            .reduce(new Bar(0), (a, b) -> new Bar(a.bar + b.bar));

    }

    class Foo {

        public Foo(int v, String n) {
            value = v;
            name = n;
        }

        int value = 0;
        String name = "me";
    }

    class Bar {

        public int bar;

        public Bar(int bar) {
            this.bar = bar;
        }
    }
}
