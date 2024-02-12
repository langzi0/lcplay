package CodePad;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;

/**
 * @author
 * @since 10/28/15
 * This is the template for adding any new class
 */

public class CommonePrefix extends InvokableBase {
  // Add this class to Common/Main.java
  @Override
  public Priority getRunPriority() {
    return new Priority(240130, 0, Category.LeetCode);
  }

  @Override
  public void run() {
    eq("", 1, 1);
  }


}
