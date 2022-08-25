package CodePad.Existing2016All;

/**
 * Construct Binary Tree from Inorder and Postorder TraversalSep 30 '12 Given inorder and postorder
 * traversal of a tree, construct the binary tree.
 *
 * Note: You may assume that duplicates do not exist in the tree.
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

public class ConstructBinaryTreefromInorderandPostorderTraversal_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    return buildTree(inorder, 0, inorder.length - 1, postorder, 0,
                     postorder.length - 1);
  }

  public TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder,
                            int ps, int pe) {
    if (is > ie || ps > pe) {
      return null;
    }
    int rootVal = postorder[pe];
    TreeNode root = new TreeNode(rootVal);
    for (int i = is; i <= ie; i++) {
      if (inorder[i] == rootVal) {
        TreeNode left = buildTree(inorder, is, i - 1, postorder, ps, ps
                                                                     + i - is - 1);
        TreeNode right = buildTree(inorder, i + 1, ie, postorder, pe
                                                                  - ie + i, pe - 1);
        root.left = left;
        root.right = right;
      }
    }
    return root;
  }
}