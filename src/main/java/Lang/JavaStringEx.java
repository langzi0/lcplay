package Lang;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by @author  @since 8/10/15.
 *
 *
 */

public class JavaStringEx extends InvokableBase {


  @Override
  public Priority getRunPriority() {
    return new Priority(240201/*151104*/, 01, Category.notClassified);
  }


  @Override
  public void run() {

    "abc".charAt(1);
    "abc".length();
    "abc".substring(0, 3);  // from 0 to 3(exclusive)
    String[] strs = new String[]{"abc", "ab"};
    if (strs.length == 1)
      ;
    testlongestCommonPrefix();

  }


  void testlongestCommonPrefix() {

    //Call your test in Common/Main.java
    Util.assertEq(longestCommonPrefix(new String[]{"ab", "abc"}), "ab");
    Util.assertEq("a", longestCommonPrefix(new String[]{"ab", "abc", "ac"}));


  }

  /*
  Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

   */
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    for (int j = 0; j < strs[0].length(); j++) {
      for (int k = 1; k < strs.length; k++) {
        if (strs[k].length() <= j || strs[k].charAt(j) != strs[0].charAt(j)) {
          return strs[0].substring(0, j);
        }
      }
    }
    return strs[0].substring(0, strs[0].length());
  }

  public String longestCommonPrefix1(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    // no need to use min,
    int min = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
      if (strs[i].length() < min) min = strs[i].length();
    }

    for (int j = 0; j < min; j++) {
      for (int k = 1; k < strs.length; k++) {
        if (strs[k].charAt(j) != strs[0].charAt(j)) {
          return strs[0].substring(0, j);
        }
      }
    }
    return strs[0].substring(0, min);
  }
}
