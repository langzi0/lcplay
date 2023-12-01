package LanguageTip;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import static java.lang.System.out;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by @author  @since 9/20/15.
 */
public class JavaLangReview extends InvokableBase {
    public static void main(String args[]) {


        JavaLangReview instance = new JavaLangReview();
        // .runScanFromFileOrConsole();

        instance.useDotdotdot(); // Likely useless, but possible
        instance.useDotdotdot("one", "two", "three");
        instance.useDotdotdot("solo");
        instance.useDotdotdot(new String[]{"a", "b", "c"});
    }

// ... is 0 or more flatted Integer The argument that gets the ...must be the last in the method signature.
    // varargs,  var - args
    public void useDotdotdot(String ... ints){
        //two way to use it.
        Arrays.stream(ints).count();
        for(String i: ints){        }

        for (int i = 0; i < ints.length; i++) {
            // classical for. In this case you use strings[i]
        }
    }
    public void runScanFromFileOrConsole() {
        try {
            String x;
            Scanner scanner = new Scanner(new File("/Users/xbian/1/1.txt"));
            out.println("Type in a integer\n");
            int i = 4;
            while (scanner.hasNextLine() && (--i)>=0) {
                x = scanner.nextLine();
                out.println(x);
            }

        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public Priority getRunPriority() {
        return new Priority(221025, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        main(null);
    }
}