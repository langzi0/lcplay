package CodePad.Existing2016All;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its
 * complexity.
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; next = null; } }
 */
public class MergekSortedLists extends InvokableBase {

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

    PriorityQueue<ListNode> heap = new PriorityQueue<>(
        lists.size(),(a,b) -> a.val - b.val);

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