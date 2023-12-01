package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import java.util.HashMap;
import java.util.Map;

/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.



Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


Constraints:

1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
words[i] and chars consist of lowercase English letters.
*/


public class TestWordContainsInString extends InvokableBase {
    @Override
    public Priority getRunPriority() {
        return new Priority(221007, 1, Category.LeetCode);
    }


    @Override
    public void run() {
        Util.assertEq(10, new TestWordContainsInString().countCharacters(
            new String[]{ "hello","world","leetcode"},  "welldonehoneyr"
        ));

    }

    int[] getCnts(String word) {
        int[] cnts = new int[26];
        for (char ch : word.toCharArray()) {
            cnts[(int) ch - (int) 'a']++;
        }
        return cnts;
    }

    public int countCharacters(String[] words, String chars) {

        int len = 0;
        int[] avail = getCnts(chars);
        for (String word : words) {
            int[] cntWord = getCnts(word);
            boolean isContained = true;
            for (int i = 0; i < cntWord.length; i++) {
                if (avail[i] < cntWord[i]) {
                    isContained = false;
                    break;
                }
            }
            if (isContained) {
                len += word.length();
            }

        }
        return len;
    }

}
