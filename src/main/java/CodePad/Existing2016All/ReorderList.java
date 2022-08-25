package CodePad.Existing2016All;

/**
 * Given a singly linked list L: L0->L1->...->Ln-1->Ln, reorder it to:
 * L0->Ln->L1->Ln-1->L2->Ln-2->...
 *
 * You must do this in-place without altering the nodes' values.
 *
 * For example, Given {1,2,3,4}, reorder it to {1,4,2,3}.
 *
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

public class ReorderList extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode fast = head;
    ListNode late = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      late = late.next;
    }
    ListNode ret = new ListNode(0);
    ListNode cur = ret;
    ListNode leftHalf = head;
    ListNode rightHalf;
    if (fast.next != null) {
      rightHalf = reverseList(late.next);
      late.next = null;
    } else {
      rightHalf = reverseList(late);
      ListNode tmp = head;
      while (tmp.next != late) {
        tmp = tmp.next;
      }
      tmp.next = null;
    }
    leftHalf = head;
    while (leftHalf != null && rightHalf != null) {
      cur.next = leftHalf;
      leftHalf = leftHalf.next;
      cur = cur.next;
      cur.next = rightHalf;
      rightHalf = rightHalf.next;
      cur = cur.next;
    }
    if (leftHalf != null) {
      cur.next = leftHalf;
    } else if (rightHalf != null) {
      cur.next = rightHalf;
    }
    head = ret.next;
  }

  private ListNode reverseList(ListNode head) {
    ListNode cur = head;
    ListNode prev = null;
    ListNode next = null;
    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}