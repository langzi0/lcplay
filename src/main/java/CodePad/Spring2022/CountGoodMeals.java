package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import java.util.HashMap;
import java.util.Map;

public class CountGoodMeals extends InvokableBase {
    // Add this class to Common/Main.java
    @Override
    public Priority getRunPriority() {
        return new Priority(220515, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        //Call your test in Common/Main.java
        //[2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468]
        countPairs(new int[]{0,0,2,2}); // expected only 5? 0 0, 2 2   , 0 2 , 0 2;  0 2  0 2 why its five?

    }
    /*

    A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.

You can pick any two different foods to make a good meal.

Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.

Note that items with different indices are considered different even if they have the same deliciousness value.



Example 1:

Input: deliciousness = [1,3,5,7,9]
Output: 4
Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.
Example 2:

Input: deliciousness = [1,1,1,3,3,3,7]
Output: 15
Explanation: The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.

for [0, 0, 2] exprected 2?  why not 3?

Constraints:

1 <= deliciousness.length <= 105
0 <= deliciousness[i] <= 220

     */

    public int countPairs(int[] deliciousness) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i< deliciousness.length; i++)
            for (int j = i+1; j< deliciousness.length; j++)
            {
                String key = deliciousness[i] <= deliciousness[j]?
                    String.format("(%s,%s)", deliciousness[i],deliciousness[j]) :
                    String.format("(%s,%s)", deliciousness[j],deliciousness[i]) ;


                if (map.containsKey(key) && isGoodMeal(deliciousness[i] + deliciousness[j])) {
                    map.put(key, map.get(key) + 1 );
                }
                else if (isGoodMeal(deliciousness[i] + deliciousness[j])){
                    map.put(key, 1);
                }
            }

        int cnt = 0;
        for(Integer x : map.values()){
            cnt += x;
        }

        return cnt;
    }

    Boolean isGoodMeal(int x){

        if (x == 0) return true;
        int i = 0;
        while(x != (1<<i) && x > (1<<i))
            i++;
        if (x == (1 << i)) return true;

        return false;
    }
}
