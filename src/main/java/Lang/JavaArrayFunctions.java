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
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by @author  @since 8/10/15.
 */

public class JavaArrayFunctions extends InvokableBase {


  @Override
  public Priority getRunPriority() {
    return new Priority(240201/*151104*/, 01, Category.notClassified);
  }

  @Override
  public void run() {
    Util.assertEq("", 1, 1);
    Util.assertEq("", 15, missingInteger(new int[]{3,4,5,1,12,14,13}));
    Util.assertEq("", 12, missingInteger(new int[]{3,4,5}));
    Util.assertEq("", 47, missingInteger(new int[]{46,8}));
    Util.assertEq("", 10, missingInteger(new int[]{3,4,7,6,6,5,8,2,8,9,2,6}));



  }
  /*
  ou are given a 0-indexed array of integers nums.

A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.

Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.



Example 1:

Input: nums = [1,2,3,2,5]
Output: 6
Explanation: The longest sequential prefix of nums is [1,2,3] with a sum of 6. 6 is not in the array, therefore 6 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.
Example 2:

Input: nums = [3,4,5,1,12,14,13]
Output: 15
Explanation: The longest sequential prefix of nums is [3,4,5] with a sum of 12. 12, 13, and 14 belong to the array while 15 does not. Therefore 15 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.


Constraints:

1 <= nums.length <= 50
1 <= nums[i] <= 50
  * */
  public int missingInteger(int[] nums) {
    if (nums.length == 1){
      return nums[0] + 1;
    }
    Integer sum = nums[0];

    int i = 1;
    while(i< nums.length){
      if (nums[i] == nums[i - 1] + 1) {
        sum += nums[i];
        i++;
      } else {
        // This is naturally a has set finding issue.
        Set s = new HashSet<Integer>();
        for (int j = i-1; j< nums.length ; j++)
          s.add(nums[j]);

        // sort [i, N) is not good.  This is not good, we can not assume each value will only appear once.
        while (s.contains(sum)) sum ++;
        return sum;
      }
    }
    return sum;
  }
}
