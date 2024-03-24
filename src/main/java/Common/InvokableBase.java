package Common;

import io.netty.util.internal.StringUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

//
public abstract class InvokableBase implements Invokeable {
  @Override  public void run(){
        String s = String.format("Util.assertEq to assert, InvokableBase: GetClassName: %s  Priority is: %S\n ", this.getClass().getName(), getRunPriority().getDaySeq());
        System.out.println(s);
      }
  @Override  public Priority getRunPriority(){return null;}
  public void eq(String msg, Integer[] expected, Integer[] actual) {

    System.out.println(msg + " Expected: " + StringUtil.join(",",
            Arrays.stream(expected).map(Object::toString).collect(Collectors.toList()))
            + " Actual: " + StringUtil.join(",",
            Arrays.stream(actual).map(Object::toString).collect(Collectors.toList())));

    if (!expected.equals(actual))
    {
      System.out.println("AssertFailed: " + msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());
    }
  }

    public void eq(String msg, Integer expected, Integer actual) {
    System.out.println(msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());

    if (!expected.equals(actual))
    {
      System.out.println("AssertFailed: " + msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());
    }
  }

  public void eq(String msg, Object expected, Object actual) {
    System.out.println(msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());

    if (!expected.equals(actual))
    {
      System.out.println("AssertFailed: " + msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());
    }
  }
  public void neq(String msg, Object expected, Object actual) {
    System.out.println(msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());
    if (expected.equals(actual))
    {
      System.out.println("AssertFailed: " + msg + " Expected: " + expected.toString() + " Actual: " + actual.toString());
    }
  }
  public void isTrue(String msg, Boolean val) {
    System.out.println(msg + " Actual: " + val.toString());

    if (!val)
    {
      System.out.println("AssertFailed: " + msg + " Actual: " + val.toString());
    }
  }
  public void isFalse(String msg, Boolean val) {
    System.out.println(msg + " Actual: " + val.toString());
    if (val)
    {
      System.out.println("AssertFailed: " + msg + " Actual: " + val.toString());
    }
  }
}
