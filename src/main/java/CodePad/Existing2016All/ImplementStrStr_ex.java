package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;

/**
 * Implement strStr().
 *
 * Returns a pointer to the first occurrence of needle in haystack, or null if needle is not part of
 * haystack.
 */

public class ImplementStrStr_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/240323, 2, Category.LeetCode);
  }

  @Override
  public void run() {
    Util.assertEq(null, strStr("hello", "no"));
    Util.assertEq(3, strStr("hello", "lo"));
    Util.assertEq(0, strStr("hello", "he"));
    Util.assertEq(null, strStr("hello", "no"));
  }

  public Integer strStr(String haystack, String needle) {
    int i =  haystack.indexOf(needle);
    if (i == -1)
      return null;
    return i;
  }
}