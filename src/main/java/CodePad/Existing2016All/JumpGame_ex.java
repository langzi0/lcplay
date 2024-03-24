package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the
 * array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * For example: A = [2,3,1,1,4], return true.
 *
 * A = [3,2,1,0,4], return false.
 */

public class JumpGame_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/20240323, 1, Category.LeetCode);
  }

  @Override
  public void run() {
    Util.assertEq("can jum", true, canJump(new int[]{2, 3, 1, 1, 4}));
    Util.assertEq("can jum", false, canJump(new int[]{3, 2, 1, 0, 4}));
    Util.assertEq("can jum", true, canJump(new int[]{2,3,1,1,4}));
    Util.assertEq("can jum", true, canJump(new int[]{1,2,3}));


  }

  public boolean canJump(int[] A) {
// from first, each step you can cover to max index;
    int idx = 0;
    int max = A[idx];
    idx++;
    while (idx < A.length && max < A.length - 1 && idx <=max) {
      if (A[idx] + idx > max)
        max = A[idx] + idx;
      idx++;

    }
    return max >= A.length - 1;
  }
}