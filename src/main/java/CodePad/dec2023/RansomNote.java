package CodePad.dec2023;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import javax.validation.constraints.AssertTrue;
import java.util.HashMap;
import java.util.Map;

/*
 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
* */

public class RansomNote extends InvokableBase {

    @Override
    public Priority getRunPriority() {
      return new Priority(/*yymdd*/240118, 0, Category.LeetCode);
    }




  @Override
    public void run() {
      String ransomNote = "aa", magazine = "aab";
      Util.assertEq("", true, canConstruct(ransomNote, magazine));
      Util.assertEq("", false, canConstruct("azt", "azz"));
      Util.assertEq("", false, canConstruct("azt", "azz"));
      Util.assertEq("", false, canConstruct("azt", "azz"));



  }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : magazine.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : ransomNote.toCharArray()){
            if (map.containsKey(ch) && map.get(ch) > 1){
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;


    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */