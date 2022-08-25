package CodePad.Existing2016All;

import java.util.ArrayList;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import sharedDataStructure.TreeNode;

/**
 * Symmetric TreeSep 24 '12 Given a binary tree, check whether it is a mirror of itself (ie,
 * symmetric around its center).
 *
 * For example, this binary tree is symmetric:
 *
 * 1 / \ 2   2 / \ / \ 3  4 4  3 But the following is not: 1 / \ 2   2 \   \ 3    3 Note: Bonus
 * points if you could solve it both recursively and iteratively.
 *
 * Definition for binary tree public class TreeNode { int val; TreeNode left; TreeNode right;
 * TreeNode(int x) { val = x; } }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SymmetricTree extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public boolean isSymmetric(TreeNode root) {
    ArrayList<String> inOrder = new ArrayList<String>();
    inOrder(root, inOrder);
    int start = 0, end = inOrder.size() - 1;
    while (start < end) {
      if (inOrder.get(start).equals(inOrder.get(end))) {
        start++;
        end--;
      } else {
        return false;
      }
    }
    return true;
  }

  public void inOrder(TreeNode root, ArrayList<String> inOrder) {
    if (root == null) {
      inOrder.add("#");
      return;
    }
    inOrder(root.left, inOrder);
    inOrder.add(root.val + "");
    inOrder(root.right, inOrder);
  }
}