package CodePad;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author
 * @since 10/28/15
 * This is the template for adding any new class
 */

public class KDistantId extends InvokableBase {
  // Add this class to Common/Main.java
  @Override
  public Priority getRunPriority() {
    return new Priority(240201, 2, Category.LeetCode);
  }

  /*
  Find K distinct ids with highest values from a stream of data.
     input: <id1, 50>, <id2, 30>, <id3, 20>, <id2, 40>
     K = 3
   */
  @Override
  public void run() {
    //Call your test in Common/Main.java
    eq("", 1, 1);
  }

  List<String> getKIds(List<Entry> list, int k){
    PriorityQueue<Entry> heap = new PriorityQueue<>(k + 1, (a, b)-> a.value - b.value);
    for(Entry e: list){
      heap.add(e);
      if (heap.size() > k) {
        heap.poll();
      }
    }
    return heap.stream().map(e -> e.id).collect(Collectors.toList());
  }
  class Entry {
    String id;
    Integer value;
  }

  // Do not use Map to get yourself into trouble to get first n elements.
  List<String> findKLarge(Entry[] stream, int k){
    // mini heap a-b, max b-a
    PriorityQueue<Entry> heap = new PriorityQueue<>(k+1, (a, b)-> a.value - b.value);
    for (int i=0; i< stream.length; i++){
      heap.add(stream[i]);
      if (heap.size() > k)
        heap.remove();
    }
    return heap.stream().map(e-> e.id).collect(Collectors.toList());
  }

}
