package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

 Basically, the deletion can be divided into two stages:

 Search for a node to remove.
 If the node is found, delete the node.

 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *
 *
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,7], key = 0
 * Output: [5,3,6,2,4,null,7]
 * Explanation: The tree does not contain a node with value = 0.
 * Example 3:
 *
 * Input: root = [], key = 0
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 104].
 * -105 <= Node.val <= 105
 * Each node has a unique value.
 * root is a valid binary search tree.
 * -105 <= key <= 105
 *
 */

public class DeleteBSTNode extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public ListNode mergeKLists(ArrayList<ListNode> lists) {
    if (lists == null || lists.isEmpty()) {
      return null;
    }

    Comparator<ListNode> comp = new Comparator<ListNode>() {
      public int compare(ListNode o1, ListNode o2) {
        if (o1.val < o2.val) {
          return -1;
        }
        if (o1.val > o2.val) {
          return 1;
        }
        return 0;
      }
    };
    PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(
        lists.size(), comp);
    for (ListNode node : lists) {
      if (node != null) {
        heap.add(node);
      }
    }
    ListNode head = null, cur = null;
    while (!heap.isEmpty()) {
      if (head == null) {
        head = heap.poll();
        cur = head;
      } else {
        cur.next = heap.poll();
        cur = cur.next;
      }
      if (cur.next != null) {
        heap.add(cur.next);
      }
    }
    return head;
  }
}