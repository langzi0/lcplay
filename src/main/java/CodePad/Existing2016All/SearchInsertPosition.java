package CodePad.Existing2016All;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return
 * the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples. [1,3,5,6], 5 �� 2 [1,3,5,6], 2 �� 1 [1,3,5,6], 7 �� 4 [1,3,5,6], 0 �� 0
 */

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

public class SearchInsertPosition extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public int searchInsert(int[] A, int target) {
    return search(A, target, 0, A.length - 1);
  }

  private int search(int[] A, int target, int l, int r) {
    int mid = 0;
    while (l <= r) {
      mid = (l + r) / 2;
      if (A[mid] == target) {
        return mid;
      } else if (A[mid] < target) {
        if (mid == A.length - 1) {
          return mid + 1;
        } else if (A[mid + 1] > target) {
          return mid + 1;
        } else {
          l = mid + 1;
        }
      } else if (A[mid] > target) {
        if (mid == 0) {
          return mid;
        } else if (A[mid - 1] < target) {
          return mid;
        } else {
          r = mid - 1;
        }
      }
    }
    return 0;
  }
}