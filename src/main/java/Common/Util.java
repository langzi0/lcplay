package Common;

import java.util.List;
import java.util.Objects;

/**
 * @author
 * @since 11/2/15
 */
public class Util {

    public static void ref(Object o) {
        show(o, false);
    }

    public static void show(Object o) {
        show(o, true);
    }

    public static void show(Object o, boolean output) {
        if (output) {
            System.out.println(o);
        }
        Suit.valueOf("SPADE");
    }

    public static <T> void showList(List<T> list) {
        System.out.println(list.size());
        for (var l : list)
            System.out.println(l);
    }

    public static void showRed(String msg) {
        System.out.println(ANSI_RED + msg + ANSI_RESET);
    }

    public static void showGreen(String msg) {
        System.out.println(ANSI_GREEN + msg + ANSI_RESET);
    }

    public static void assertEq(String msg, Object expected, Object actual) {
        // For string, the equals will implement the character wise comparison.
        if (!Objects.equals(expected, actual)) {
            showRed(msg + "Assert Failed!! Expected:" + getNullOrString(expected)
                    + " Actual:" + getNullOrString(actual));
        } else {
            showGreen(msg + " Work as Expected. Expected:" + getNullOrString(expected)
                    + " Actual:" + getNullOrString(actual));
        }
    }

    public static String getNullOrString(Object obj) {
        return obj == null ? "Null" : obj.toString();
    }

    public static void assertEq(Object expected, Object actual) {
        assertEq("Equals:", expected, actual);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
