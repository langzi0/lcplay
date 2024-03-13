package CodePad.Existing2016All;

import java.util.ArrayList;
import java.util.Arrays;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ? b ? c) The solution set
 * must not contain duplicate triplets.
 * <p>
 * For example, given array S = {-1 0 1 2 -1 -4},
 * <p>
 * A solution set is: (-1, 0, 1) (-1, -1, 2)
 */

public class ThreeSum extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymmdd*/240304, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        //1. let the third one to be hashSet.  any two adds up o(n**2) to find a match o(1)
        // 2. Sort it since it is o(n*logn) any way,

        var x = threeSum(new int[]{-1, 0, 1, 2, -1, -4,1});
        eq("",2, x.size());

    }



    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        int a, b, c, k, l;
        for (int i = 0; i <= num.length - 3; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            a = num[i];
            k = i + 1;
            l = num.length - 1;
            while (k < l) {
                b = num[k];
                c = num[l];
                if (a + b + c == 0) {
                    //
                    if (k != i + 1 && num[k] == num[k - 1]) {
                        //
                        k++;
                        continue;
                    }
                    if (l != num.length - 1 && num[l] == num[l + 1]) {
                        l--;
                        continue;
                    }
                    ArrayList<Integer> item = new ArrayList<Integer>();
                    item.add(a);
                    item.add(b);
                    item.add(c);
                    result.add(item);
                    l--;
                    k++;
                } else if (a + b + c > 0) {
                    l--;
                } else {
                    k++;
                }
            }
        }
        return result;
    }
}