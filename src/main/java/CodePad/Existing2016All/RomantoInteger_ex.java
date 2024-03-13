package CodePad.Existing2016All;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 */

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import scala.Int;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger_ex extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymdd*/240212, 0, Category.LeetCode);
    }

    HashMap<Character, Integer> map = new HashMap<>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    ));
    // 1, 2, 3, 4, 5, 6, 7 , 8 ,9
    // i        iv,
    // x,       xl,
    // c,       cd,
    // M
    // viii, ix, x xi, xii, xiii, xiv,  MMD
    // 19 xix,  ==
    // 199 = 100 + 90 + 9 = c xc ix

    @Override
    public void run() {
        eq("", 11, romanToInt("XI"));
        eq("", 1994, romanToInt("MCMXCIV"));
    }
    // only smaller significant value is put on the left.
    // Walk from right to left, if the  left is smaller than next right roman num, it is negative.
    // vi,vii, viii,  ix, (no viiii or iiv)
    // MCMXCIV

    public int romanToInt(String s) {
        int result = 0;
        if (s.length() != 0) {
            int prev = map.get(s.charAt(s.length() - 1));
            result += prev;
            for (int i = s.length() - 2; i >= 0; i--) {
                int d = map.get(s.charAt(i));
                if (d < prev) {
                    result -= d;
                } else if (d >= prev) {
                    result += d;
                }
                prev = d;
            }
        }
        return result;
    }

}