package CodePad.dec2023;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import java.util.HashMap;
import java.util.Map;

/*
* 146. LRU Cache
Solved
Medium
Topics
Companies
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.



Example 1:

Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRU lRUCache = new LRUCache(2);
lRU.put(1, 1); // cache is {1=1}
lRU.put(2, 2); // cache is {1=1, 2=2}
lRU.get(1);    // return 1
lRU.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRU.get(2);    // returns -1 (not found)
lRU.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRU.get(1);    // return -1 (not found)
lRU.get(3);    // return 3
lRU.get(4);    // return 4
* */

public class LRU extends InvokableBase {

    @Override
    public Priority getRunPriority() {
      return new Priority(/*yymdd*/231125, 0, Category.LeetCode);
    }


    void case1(){
      LRU lRU = new LRU(2);
      lRU.put(1, 1); // cache is {1=1}
      lRU.put(2, 2); // cache is {1=1, 2=2}
      lRU.get(1);    // return 1
      lRU.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
      lRU.get(2);    // returns -1 (not found)
      lRU.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
      lRU.get(1);    // return -1 (not found)
      lRU.get(3);    // return 3
      lRU.get(4);    // return 4
    }
  void case2(){
    LRU lru = new LRU(1);
    lru.put(2, 1); // cache is {1=1}
    lru.get(1);    // return 1
  }
  void case3(){
    LRU lru = new LRU(2);
    lru.put(1, 0); // cache is {1=1}
    lru.put(2, 2); // cache is {1=1}
    lru.get(1);    // return 1
    lru.put(3, 3); // cache is {1=1}
    lru.get(2);    // return 1
    lru.put(4, 4); // cache is {1=1}
    lru.get(1);    // return 1
    lru.get(3);    // return 1
    lru.get(4);    // return 1
  }
  void case4(){
    LRU lru = new LRU(2);

    lru.put(2,1);
    lru.put(2,2);
    lru.get(2);
    lru.put(1,1);
    lru.put(4,1);
    lru.get(2);
  }

  @Override
    public void run() {
    //case1();
    case4();
    }
  public LRU() {

  }
  public LRU(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {
    if (map.containsKey(key)){
      Record x = map.get(key);

      takeout(head, x);
      insert(head,x);
      return map.get(key).value;
    }
    return -1;
  }

  void takeout(Record head, Record l) {
    l.prev.next = l.next;
    if (l.next != null)
      l.next.prev = l.prev;
    l.prev = null;
    l.next = null;
  }

  void insert(Record head, Record l){
      l.next = head.next;
      l.prev = head;
      if (head.next != null)
        head.next.prev = l;
      head.next = l;
  }

  public void put(int key, int value) {
    if(map.containsKey(key)){
      Record x = map.get(key);
      takeout(head, x);
      insert(head,x);
    } else {
      Record x = new Record(key, value, null, null);
      if (size == 0){
        insert(head, x);
        map.put(key, x);
        size ++;
      } else if (size == capacity) {
        Record cur = head;
        while(cur.next != null) cur = cur.next;
        takeout(head, cur);
        map.remove(cur.key);
        insert(head, x);
        map.put(key, x);
      } else {
        insert(head, x);
        map.put(key, x);
        size ++;
      }
    }
  }

  class Record {
    int value;
    int key;
    Record next;
    Record prev;
    Record(int k, int v, Record n, Record p){
      key = k;
      value = v;
      next = n;
      prev = p;
    }
  }

  Record head = new Record(-1, -1, null, null);

  Map<Integer, Record> map = new HashMap<>();
  int size = 0;
  int capacity = 0;

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */