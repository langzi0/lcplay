package CodePad.Existing2016All;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
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

public class ReverseLinkedListII_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null) {
      return head;
    }
    int start = 1, end = 0;
    ListNode s = head;
    ListNode p = null;
    while (start++ < m && s != null) {
      p = s;
      s = s.next;
    }
    ListNode cur = null;
    ListNode next = null;
    ListNode prev = null;
    end = m;
    cur = s;
    while (end++ <= n && cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    s.next = cur;
    if (p != null) {
      p.next = prev;
      return head;
    } else {
      return prev;
    }
  }
}