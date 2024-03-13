package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer, convert it to a roman numeral.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class IntegertoRoman_ex extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymdd*/240212, 1, Category.LeetCode);
    }

    @Override
    public void run() {
        eq("", "MCMXCIX", intToRoman(1999));
        eq("", "MCMXCIX", intToRomanXuehai(1999));
    }
    //1-9, 10,20-90, 100-900, 1000-3000
    // can not be more than 10;  You can use
    HashMap<Integer, String> map = new HashMap<Integer, String>(Map.of(
            1, "I",
            9, "IX",
            10, "X",
            20, "XX",
            90, "XC",
            100, "C",
            200, "CC",
            900, "CM",
            1000, "M",
            2000, "MM"));

    public String intToRomanXuehai(int num) {
        String result = "";
        int sig = 1;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            if (digit != 0) {
                result = map.get(digit * sig) + result;
            }
            sig *= 10;
        }

        return result;
    }
    //3456 => convert each digit to its correponding number

    // 1   {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
// 10  {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
// 100  {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
// 1000 {"M", "MM", "MMM", "", "", "", "", "", ""}};
    public String intToRoman(int num) {
        String a[][] = {{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, {"M", "MM", "MMM", "", "", "", "", "", ""}};
        String result = "";
        int key = 0;
        while (num != 0) {
            int d = num - num / 10 * 10;
            if (d != 0) {
                result = a[key][d - 1] + result;
            }
            num /= 10;
            key++;
        }
        return result;
    }
}