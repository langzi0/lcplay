package LanguageTip;

import java.lang.reflect.Method;
import java.sql.Connection;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import static java.lang.System.out;

/**
 * Created by @author  @since 9/20/15.
 */
public class ReflectionSample extends InvokableBase {

    public static void main(String args[]) {
        try {

            Class c = Class.forName("java.lang.String");
            out.println("class name is" + c.getName());

            Method m[] = c.getDeclaredMethods();

//            String obj = (String) c.getDeclaredConstructor().newInstance(new String("12345"));
// deal with constructor
            String obj = (String) c.getConstructor(String.class).newInstance("12345");
            Class x = obj.getClass();
            out.println("class name's new object name is" + x.getName());


            for (int i = 0; i < m.length; i++) {
                if (i < Math.min(m.length, 4)) {
                    out.println(String.format("m[%d]= %s", i, m[i].toString()));
                }
                if (m[i].getName().equalsIgnoreCase("Length")) {
                    Method lengthMethod = m[i];
                    // invoke this method for string object obj initialized with 12345
                    out.println("** \n Initiate object java.lang.String with constructor:" + obj + ". Now calling its "
                            + "method:" + lengthMethod.getName() +
                            ", return result:" +
                            lengthMethod.invoke(obj));
                }
            }

            try {
                Method subStringMethod = x.getMethod("substring", int.class);
                // invoke this method for string object obj initialized with 12345
                out.println("** \n Initiate object java.lang.String with constructor:" + obj + ". Now calling its "
                        + "method to the object with 1 parameter:" + subStringMethod.getName() +
                        ", return substring result:" +
                        subStringMethod.invoke(obj, 1));
            } catch (Exception e) {
                e.printStackTrace();

            }

        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public Priority getRunPriority() {
        return new Priority(220830, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        ReflectionSample.main(null);
    }
}