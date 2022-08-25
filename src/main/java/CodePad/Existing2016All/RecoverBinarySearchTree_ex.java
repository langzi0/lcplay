package CodePad.Existing2016All;

import java.util.ArrayList;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import sharedDataStructure.TreeNode;

/**
 * Recover Binary Search TreeSep 1 '12 Two elements of a binary search tree (BST) are swapped by
 * mistake.
 *
 * Recover the tree without changing its structure.
 *
 * Note: A solution using O(n) space is pretty straight forward. Could you devise a constant space
 * solution?
 *
 * Definition for binary tree public class TreeNode { int val; TreeNode left; TreeNode right;
 * TreeNode(int x) { val = x; } }
 */

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left; TreeNode right;
 * TreeNode(int x) { val = x; } }
 */
public class RecoverBinarySearchTree_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public void recoverTree(TreeNode root) {
    if (root == null) {
      return;
    }
    ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
    findWrongNode(root, nodes);
    TreeNode a = null, b = null;
    int i = 0;
    for (i = 0; i < nodes.size() - 1; i++) {
      if (nodes.get(i).val > nodes.get(i + 1).val) {
        a = nodes.get(i);
        break;
      }
    }
    for (int j = i + 1; j < nodes.size() - 1; j++) {
      if (nodes.get(j).val > nodes.get(j + 1).val) {
        b = nodes.get(j + 1);
        break;
      }
    }
    if (b == null) {
      b = nodes.get(i + 1);
    }

    int t = a.val;
    a.val = b.val;
    b.val = t;
  }

  private void findWrongNode(TreeNode root, ArrayList<TreeNode> nodes) {
    if (root == null) {
      return;
    }
    findWrongNode(root.left, nodes);
    nodes.add(root);
    findWrongNode(root.right, nodes);
  }
}