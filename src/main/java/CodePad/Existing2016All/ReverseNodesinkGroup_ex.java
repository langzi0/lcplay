package CodePad.Existing2016All;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified
 * list.
 *
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it
 * is.
 *
 * You may not alter the values in the nodes, only nodes itself may be changed.
 *
 * Only constant memory is allowed.
 *
 * For example, Given this linked list: 1->2->3->4->5
 *
 * For k = 2, you should return: 2->1->4->3->5
 *
 * For k = 3, you should return: 3->2->1->4->5
 *
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; next = null; } }
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

public class ReverseNodesinkGroup_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null) {
      return null;
    }
    int t = 0;
    ListNode nextHead = head;
    while (nextHead != null && t < k - 1) {
      nextHead = nextHead.next;
      t++;
    }
    if (nextHead == null || t < k - 1) {
      return head;
    } else {
      ListNode nextPart = reverseKGroup(nextHead.next, k);
      return reverseList(head, k, nextPart);
    }
  }

  private ListNode reverseList(ListNode head, int k, ListNode nextPart) {
    ListNode cur = head, prev = null, next = null;
    for (int i = 0; i < k; i++) {
      next = cur.next;
      if (i != 0) {
        cur.next = prev;
      } else {
        cur.next = nextPart;
      }
      prev = cur;
      cur = next;
    }
    return prev;
  }
}