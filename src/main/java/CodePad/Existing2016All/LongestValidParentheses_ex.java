package CodePad.Existing2016All;

import java.util.Stack;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid
 * (well-formed) parentheses substring.
 *
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 *
 * Another example is ")()())", where the longest valid parentheses substring is "()()", which has
 * length = 4.
 */

public class LongestValidParentheses_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public int longestValidParentheses(String s) {
    int maxLen = 0, last = -1;
    Stack<Integer> lefts = new Stack<Integer>();
    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) == '(') {
        lefts.push(i);
      } else {
        if (lefts.isEmpty()) {
          // no matching left
          last = i;
        } else {
          // find a matching pair
          lefts.pop();
          if (lefts.isEmpty()) {
            maxLen = Math.max(maxLen, i - last);
          } else {
            maxLen = Math.max(maxLen, i - lefts.peek());
          }
        }
      }
    }
    return maxLen;
  }
}