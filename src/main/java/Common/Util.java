package Common;

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

  public static void assertEq(String msg, Object expected, Object actual)
  {
    // For string, the equals will implement the character wise comparison.
    if (!Objects.equals(expected, actual))
    {
      System.out.println(msg+ "Assert failed! Expected:" + expected + " Actual:" + actual.toString());
    }
    else {
      System.out.println(msg+ " Work as Expected. Expected:" + expected + " Actual:" + actual.toString());
    }
  }
  public static void assertEq(Object expected, Object actual)
  {
    assertEq("Equals:", expected, actual);
  }
}
