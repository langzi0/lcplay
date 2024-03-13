package CodePad.Existing2016All;

import java.util.*;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import scala.collection.mutable.HashMap;

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

public class ThreeSum_ex extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymdd*/240303, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        var x = threeSum1(new int[]{-1, 0, 1, 2, -1, -4});
        x.size();

    }

    class Triple {
        Integer i1;
        Integer i2;
        Integer i3;

        public Triple(int i1, int i2, int i3) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
        }

        public Triple(Integer[] vs) {
            sort(vs, 0, 1);
            sort(vs, 1, 2);
            sort(vs, 0, 1);
            i1 = vs[0];
            i2 = vs[1];
            i3 = vs[2];
        }

        private void sort(Integer[] vs, int i, int j) {
            if (vs[i] > vs[j]) {
                int m = vs[i];
                vs[i] = vs[j];
                vs[j] = m;
            }
        }


        @Override
        public boolean equals(Object o) {
            // Do final confirmation it is the same hashed object.
            // ensure hashmap find int hashCode(), then boolean equalsTo(Object other)
            // int hashCode() { freturn Objects.hash(x, y)}.
            if (o == this)
                return true;
            if (!(o instanceof Triple))
                return false;
            Triple q = (Triple) o;
            return q.i1 == this.i1 && q.i2 == this.i2 && q.i3 == this.i3;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i1, i2, i3);
        }
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        HashSet<Triple> map = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int s = i + 1;
            int e = nums.length - 1;
            while (s < e) {
                if (nums[s] + nums[e] + nums[i] == 0) {
                    map.add(new Triple(nums[i], nums[s], nums[e]));
                    s++;e--;
                } else if (nums[s] + nums[e] + nums[i] <= 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }


        var list = new ArrayList<List<Integer>>();
        for (Triple p : map) {
            list.add(List.of(p.i1, p.i2, p.i3));
        }

        return list;
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
                    if (k != i + 1 && num[k] == num[k - 1]) {
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