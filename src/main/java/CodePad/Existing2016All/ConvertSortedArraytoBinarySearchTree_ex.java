package CodePad.Existing2016All;

/**
 * Convert Sorted Array to Binary Search TreeOct 2 '12 Given an array where elements are sorted in
 * ascending order, convert it to a height balanced BST.
 *
 * Definition for binary tree public class TreeNode { int val; TreeNode left; TreeNode right;
 * TreeNode(int x) { val = x; } }
 */

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import sharedDataStructure.TreeNode;

public class ConvertSortedArraytoBinarySearchTree_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public TreeNode sortedArrayToBST(int[] num) {
    return sortedArrayToBST(num, 0, num.length - 1);
  }

  public TreeNode sortedArrayToBST(int[] num, int start, int end) {
    if (start <= end) {
      int mid = (start + end) / 2;
      TreeNode left = sortedArrayToBST(num, start, mid - 1);
      TreeNode right = sortedArrayToBST(num, mid + 1, end);
      TreeNode node = new TreeNode(num[mid]);
      node.left = left;
      node.right = right;
      return node;
    }
    return null;
  }
}