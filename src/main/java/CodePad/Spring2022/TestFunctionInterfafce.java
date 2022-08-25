package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * @author
 * @since 10/28/15
 * This is the template for adding any new class
 */

public class TestFunctionInterfafce extends InvokableBase {
  // Add this class to Common/Main.java
  @Override
  public Priority getRunPriority() {
    return new Priority(220620, 0, Category.LeetCode);
  }

  @Override
  public void run() {
    //Call your test in Common/Main.java
    FunctionInterfaceFoo functionInterfaceFoo = parameter -> parameter + " from lambda";
    String result = add("Message ", functionInterfaceFoo);
    String result1 = add("Message ", functionInterfaceFoo);
  }
  public String add(String string, FunctionInterfaceFoo functionInterfaceFoo) {
    return functionInterfaceFoo.method(string);
  }
}


