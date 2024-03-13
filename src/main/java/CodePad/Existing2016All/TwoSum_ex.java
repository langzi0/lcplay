package CodePad.Existing2016All;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import org.apache.commons.lang3.tuple.Pair;


/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */

/*
 */

public class TwoSum_ex extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymdd*/240215, 0, Category.LeetCode);
    }

    @Override
    public void run() {


        int[] result = twoSum(new int[]{1, 3, -2, 9, 6, -3}, 0);
        System.out.println(Integer.toString(result[0]) + " " + Integer.toString(result[1]));
        int[] result1 = twoSum1(new int[]{1, 3, -2, 9, 6, -3}, 0);
        System.out.println(result1[0] + " " + result1[1]);

    }

    // xb's solution, with o(n) time.
    // However, we need to return index, we have to sort with its value + index
    // Trick to low and high ptr.if too big, move down high ptr, else move up low ptr.
    // Also we need to get index.


    //
    public int[] twoSum1(int[] numbers, int target) {
//    Arrays.asList(nums).stream().map(p)
        List<Pair<Integer, Integer>> list = IntStream.range(0, numbers.length)
                .mapToObj(i -> Pair.of(numbers[i], i))
                .collect(Collectors.toList());

        list.sort((a, b) -> a.getLeft() - a.getRight());

        int n = numbers.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (list.get(i).getLeft() + list.get(j).getLeft() == target) {
                return new int[]{list.get(i).getRight(), list.get(j).getRight()};
            } else if (list.get(i).getLeft() + list.get(j).getLeft() < target) {
                i++;
            } else {
                j++;
            }
        }
        return null;
    }


    // hashing school of thoughts: collect each number and its indices because it could have duplicates
    //
    // Check another round of target-num[i] to see if it is in. Smart!!!
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        // This is cool, assume every number might have >=1 times and records all its index.
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(numbers[i]))
                map.put(numbers[i], new LinkedHashSet<>());
            Set<Integer> set = map.get(numbers[i]);
            set.add(i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(-numbers[i])) {
                Set<Integer> set = map.get(-numbers[i]);
                for (Integer choice : set) {
                    if (i < choice) {
                        return new int[]{i, choice};
                    }
                }
            }


        }
        return null;
    }


    public class NumPos {
        public int val;
        public int idx;

        public NumPos(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    public class Num {

        private int value;
        private int index;

        public Num(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}