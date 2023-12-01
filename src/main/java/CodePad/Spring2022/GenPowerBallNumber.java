package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import org.apache.commons.lang3.tuple.Pair;
import org.joda.time.DateTime;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

/*
Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).
The subsequence must be strictly increasing.
A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ...,
nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

Example 1:

Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
Example 2:

Input: nums = [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.


Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109
*/


public class GenPowerBallNumber extends InvokableBase {
    @Override
    public Priority getRunPriority() {
        return new Priority(221103, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        String name1 = new String("xyz");
        String name2 = new String("xyz");
        String name3 = name2;

        Boolean b1 = name1.equals(name2);
        Boolean b2 = name1 == name2;
        Boolean b3 = name2 == name3;


        Util.assertEq(name3, name2);
        runrun(20);

        Util.assertEq("", new GenPowerBallNumber().findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}), 3);
    }

    void runrun(int times) {
        System.out.printf("**************************************\n");

        try {
            get50tickets(times);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("**************************************\n");
    }

    Random random = new Random(DateTime.now().getMillis());

    Integer getValue(int size) {
        Integer x = (int) Math.ceil(random.nextDouble() * size);
        if (x == 0)
            x = 1;
        return x;
    }


    private Integer getValue(Double[] integratedWhite, Random random) {
        Double z = random.nextDouble();
        int times = (int) (z * 100);
        for (int i = 0; i < times; i++)
            z = random.nextDouble();
        for (int i = 0; i < integratedWhite.length; i++)
            if (z < integratedWhite[i])
                return i + 1;
        return integratedWhite.length;
    }


    // return [0,p1),(p1,p2), .. (pn-1, pn)
    Double[] getIntegratedDistribution(Double[] weights) {
        Double sum = 0.0;
        Double[] dis = new Double[weights.length];

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            dis[i] = sum;
        }
        return dis;
    }

    Double[] getInvertedIntegratedDistribution(Double[] w2) {

        List<Double> weights = Arrays.asList(w2).stream().map(p -> (1 - p) / (w2.length - 1)).collect(Collectors.toList());
        Double sum = 0.0;
        Double[] dis = new Double[weights.size()];
        for (int i = 0; i < weights.size(); i++) {
            sum += weights.get(i);
            dis[i] = sum;
        }
        return dis;
    }

    Double[] normalizeWeights(Integer[] freq) {
        Integer sumofAll = Arrays.stream(freq).reduce(0, (a, b) -> a + b);
        Double[] ret = new Double[freq.length];
        for (int i = 0; i < freq.length; i++) {
            ret[i] = ((double) freq[i]) / sumofAll;
        }
        return ret;
    }

    private Integer[] getAvergeInt(int size) {
        Integer[] ret = new Integer[size];
        for (int i = 0; i < size; i++) ret[i] = 1;
        return ret;

    }

    // times of group 10 number will be choosen
    public void get50tickets(int times) throws IOException {
        // https://docs.google.com/spreadsheets/d/1o4fqnecGahkvdeQ2QpRBpGDaICl2cdC2TCT8lMfo5RM/edit#gid=0
        Pair<Integer[], Integer[]> wb_pb = countFreq();
        // This is from 2015 to now.
//        Double[] weight_white = normalizeWeights(new int[]{54, 57, 65, 46, 54, 63, 54, 59, 49, 64, 54, 57, 45, 59, 59, 61, 59, 59, 57, 66, 73, 60, 70, 46, 52, 44, 65, 64, 52, 55, 51, 77, 62, 44, 47, 70, 65, 53, 69, 61, 60, 57, 50, 59, 57, 47, 57, 53, 47, 55, 49, 59, 64, 55, 55, 61, 58, 52, 68, 52, 78, 69, 73, 63, 54, 52, 57, 57, 71});
//        Double[] weight_red = normalizeWeights(new int[]{28, 28, 32, 36, 31, 33, 26, 31, 31, 33, 31, 24, 34, 30, 25, 26, 29,
//                42, 32, 27, 34, 28, 22, 45, 31, 33});
//        Double[] weight_white = normalizeWeights(getAvergeInt(69));
//        Double[] weight_red = normalizeWeights(getAvergeInt(26));

        // used latest 1.5 ys
        Double[] weight_white = normalizeWeights(wb_pb.getLeft());
        Double[] weight_red = normalizeWeights(wb_pb.getRight());
        int i;
        System.out.println("whiteball freq for 1yr3month, ball life 2-3 years");
        for (i = 0; i < 69; i++)
            System.out.print((i + 1) + ":" + wb_pb.getLeft()[i] + " ");
        System.out.println("");
        System.out.println("powerball freq for 1yr3month, ball life 2-3 years");
        for (i = 0; i < 26; i++)
            System.out.print((i + 1) + ":" + wb_pb.getRight()[i] + " ");
        System.out.println("");

        Double[] integratedWeightsWhite = getIntegratedDistribution(weight_white);
        Double[] integratedWeightsRed = getIntegratedDistribution(weight_red);
        Double[] integratedInvertedWeightsWhite = getInvertedIntegratedDistribution(weight_white);
        Double[] integratedInvertedWeightsRed = getInvertedIntegratedDistribution(weight_red);
        Double[] integratedWhite;
        Double[] integratedRed;


        List<Pair<Long, String>> families = new ArrayList<>();
        families.add(Pair.of(107122902040913L, "bian"));
        FileOutputStream fs = new FileOutputStream("/Users/xbian/familylottery" + DateTime.now().toString() + ".txt");
        String output = String.format("Current time is: " + DateTime.now().toString() + "\n");
        System.out.printf(output);
        fs.write(output.getBytes(StandardCharsets.UTF_8));

        List<List<Integer>> ret = new ArrayList<List<Integer>>(50);
        for (var family : families) {
            output = String.format("Family: " + family.getRight() + " with the given number: " + family.getLeft() + "\n");
            System.out.printf(output);
            fs.write(output.getBytes(StandardCharsets.UTF_8));
            DateTime dt = DateTime.now();
            if (family.getRight().equals("bian")) {
                dt = DateTime.now();
//                 dt = DateTime.parse("2022-11-07T20:00:00.000-07:00");
            }
            Random random =
//                    new Random(Long.MAX_VALUE - family.getLeft() + dt.getMillis());
                new Random(dt.getMillis());

            int numofFreq = 10;  // numofFreq out 10 will use freq strategy
            for (i = 0; i < 10 * times; i++) {
                if (i == 0)
                    outputString("Strategy to use frequent; maybe font weight\n", fs);
                else if (i == numofFreq * times)
                    outputString("Strategy to use rare \n", fs);
                if (i < numofFreq * times) {
                    integratedWhite = integratedWeightsWhite;
                    integratedRed = integratedWeightsRed;
                } else {
                    integratedWhite = integratedInvertedWeightsWhite;
                    integratedRed = integratedInvertedWeightsRed;
                }
                List<Integer> list = new ArrayList<>();
                // 5 white
                for (int j = 0; j < 6; j++) {
                    if (j < 5) {
                        Integer option = getValue(integratedWhite, random);
                        while (list.contains(option))
                            option = getValue(integratedWhite, random);
                        list.add(option);
                    } else {
                        Collections.sort(list);
                        list.add(getValue(integratedRed, random));
                    }
                }
                ret.add(list);
                output = String.format("WB: %2d %2d %2d %2d %2d  PB: %2d\n", list.get(0), list.get(1), list.get(2),
                    list.get(3), list.get(4), list.get(5));
                outputString(output, fs);
            }
        }
        Evaluate(ret);
        fs.close();

    }

    private void Evaluate(List<List<Integer>> ret) {
        List<Integer> list = Arrays.asList(10, 13, 41, 47, 57, 10);
        int hit = 0;
        for (var l : ret) {
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++)
                    if (l.get(i) == list.get(j)) hit++;
            if (l.get(5) == list.get(5)) hit++;
        }
        System.out.println(String.format("output against Arrays.asList(10,13,41,47,57,10) size=%d has avg hits per " +
                "10 bets= %5.2f",
            ret.size(), hit / (ret.size() / 10.0)));


    }


    void outputString(String output, FileOutputStream fs) throws IOException {
        System.out.printf(output);
        fs.write(output.getBytes(StandardCharsets.UTF_8));
    }

    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int s = 0, t = 0;
        int saves = s;
        int savet = t;

        while (s < n) {
            t = s + 1;
            while (t < n && nums[t - 1] < nums[t])
                t++;
            if (t - s > savet - saves + 1) {
                saves = s;
                savet = t - 1;
            }
            s = t;
        }
        return savet - saves + 1;
    }

    Pair<Integer[], Integer[]> countFreq() {
        Integer[] wb = new Integer[69];
        int x;
        for (x = 0; x < wb.length; x++) wb[x] = 0;
        Integer[] pb = new Integer[26];
        for (x = 0; x < pb.length; x++) pb[x] = 0;

        for (int i = 0; i < PASTWINNING.length; i++) {
            for (int j = 0; j < 5; j++)
                wb[PASTWINNING[i][j] - 1]++;
            pb[PASTWINNING[i][5] - 1]++;
        }
        return Pair.of(wb, pb);
    }

    // Past 1.25 years.   2-3 years life for ball.
    Integer[][] PASTWINNING = {
//            {10, 33, 41, 47, 56, 10}, // Nov 8 drawing
        {69, 53, 45, 56, 28, 20}, //Nov 5
        {22, 11, 60, 2, 35, 23},
        {19, 13, 39, 59, 36, 13},
        {40, 19, 57, 31, 46, 23},
        {46, 37, 19, 56, 36, 24},
        {23, 45, 54, 35, 18, 16},
        {55, 25, 60, 19, 48, 18},
        {27, 42, 15, 8, 6, 10},
        {46, 30, 36, 19, 60, 25},
        {32, 62, 40, 58, 37, 15},
        {59, 30, 42, 14, 41, 6},
        {17, 3, 22, 11, 6, 11},
        {53, 60, 68, 43, 13, 5},
        {26, 37, 33, 62, 30, 6},
        {55, 63, 2, 16, 22, 22},
        {69, 22, 21, 65, 8, 26},
        {10, 67, 33, 24, 6, 11},
        {31, 33, 13, 20, 59, 20},
        {3, 21, 29, 24, 9, 14},
        {33, 34, 6, 54, 45, 7},
        {7, 15, 67, 46, 36, 7},
        {5, 25, 36, 61, 51, 1},
        {20, 10, 22, 52, 9, 25},
        {66, 14, 34, 6, 16, 25},
        {56, 68, 38, 42, 69, 4},
        {3, 33, 16, 30, 36, 20},
        {4, 7, 55, 32, 64, 25},
        {18, 27, 65, 49, 69, 9},
        {24, 19, 7, 8, 28, 1},
        {69, 61, 43, 13, 36, 18},
        {2, 65, 60, 18, 56, 14},
        {37, 35, 6, 24, 44, 22},
        {12, 55, 67, 27, 34, 9},
        {16, 11, 9, 66, 5, 7},
        {41, 23, 55, 50, 28, 24},
        {20, 50, 47, 63, 24, 5},
        {43, 35, 24, 62, 19, 2},
        {68, 59, 61, 44, 29, 19},
        {58, 45, 51, 57, 32, 12},
        {15, 8, 46, 56, 68, 3},
        {9, 66, 21, 57, 56, 11},
        {31, 65, 36, 15, 21, 16},
        {17, 4, 58, 68, 57, 12},
        {25, 55, 1, 44, 57, 26},
        {25, 37, 38, 39, 65, 5},
        {59, 39, 41, 54, 62, 12},
        {20, 10, 65, 23, 49, 22},
        {36, 14, 50, 58, 34, 5},
        {23, 57, 32, 18, 3, 21},
        {22, 23, 47, 63, 36, 2},
        {52, 37, 34, 4, 26, 9},
        {42, 22, 52, 46, 14, 24},
        {36, 32, 69, 49, 62, 13},
        {16, 15, 56, 31, 24, 4},
        {59, 10, 9, 37, 62, 26},
        {63, 40, 8, 49, 58, 14},
        {13, 30, 37, 18, 11, 16},
        {12, 20, 32, 27, 6, 4},
        {10, 56, 6, 31, 48, 12},
        {3, 44, 69, 61, 63, 13},
        {40, 45, 10, 19, 58, 25},
        {28, 19, 42, 41, 51, 7},
        {2, 44, 42, 51, 27, 25},
        {26, 53, 69, 20, 18, 5},
        {39, 43, 62, 22, 64, 7},
        {10, 2, 44, 35, 46, 4},
        {60, 52, 14, 16, 36, 16},
        {41, 56, 63, 11, 57, 2},
        {51, 69, 28, 68, 27, 22},
        {66, 50, 61, 39, 2, 15},
        {42, 19, 28, 39, 57, 17},
        {42, 37, 33, 1, 39, 26},
        {15, 52, 25, 58, 14, 11},
        {64, 41, 40, 58, 65, 17},
        {7, 22, 15, 36, 64, 13},
        {6, 52, 40, 45, 41, 9},
        {61, 5, 7, 69, 63, 18},
        {18, 56, 30, 35, 52, 5},
        {5, 28, 6, 67, 4, 10},
        {55, 63, 69, 39, 37, 23},
        {18, 39, 44, 33, 27, 8},
        {21, 37, 44, 63, 14, 1},
        {62, 68, 61, 11, 36, 4},
        {18, 61, 12, 39, 20, 10},
        {49, 10, 56, 39, 47, 8},
        {55, 30, 56, 20, 45, 14},
        {8, 33, 59, 55, 62, 18},
        {62, 32, 15, 65, 21, 26},
        {63, 68, 41, 16, 14, 26},
        {5, 34, 24, 31, 7, 4},
        {62, 31, 66, 6, 16, 18},
        {6, 45, 47, 42, 64, 18},
        {2, 39, 69, 32, 46, 6},
        {58, 59, 47, 28, 6, 18},
        {37, 3, 31, 21, 7, 11},
        {62, 11, 18, 58, 39, 3},
        {2, 50, 10, 59, 61, 6},
        {37, 38, 31, 32, 48, 24},
        {26, 15, 65, 63, 1, 16},
        {9, 52, 18, 8, 48, 6},
        {58, 35, 28, 34, 3, 17},
        {21, 28, 32, 49, 44, 6},
        {19, 39, 37, 61, 20, 8},
        {34, 13, 22, 67, 51, 10},
        {59, 67, 10, 55, 43, 2},
        {37, 23, 52, 63, 8, 13},
        {63, 61, 48, 19, 37, 12},
        {21, 7, 39, 47, 55, 19},
        {48, 32, 36, 64, 15, 19},
        {64, 35, 17, 6, 21, 18},
        {37, 45, 36, 69, 2, 3},
        {10, 3, 15, 42, 33, 11},
        {40, 22, 48, 30, 42, 16},
        {49, 55, 16, 27, 25, 17},
        {10, 8, 41, 21, 62, 7},
        {63, 17, 51, 2, 33, 26},
        {65, 5, 15, 38, 47, 10},
        {39, 61, 27, 16, 5, 24},
        {33, 62, 18, 63, 29, 15},
        {61, 10, 69, 51, 15, 14},
        {54, 2, 15, 65, 38, 11},
        {69, 38, 49, 4, 11, 16},
        {11, 53, 47, 30, 29, 16},
        {67, 14, 8, 33, 36, 17},
        {11, 43, 61, 15, 55, 10},
        {46, 65, 24, 35, 9, 22},
        {3, 59, 37, 51, 18, 13},
        {21, 22, 30, 12, 33, 24},
        {17, 21, 14, 27, 18, 9},
        {21, 20, 65, 36, 60, 13},
        {25, 6, 14, 33, 46, 17},
        {2, 33, 13, 32, 48, 22},
        {39, 48, 12, 50, 6, 7},
        {39, 6, 9, 33, 2, 11},
        {62, 45, 36, 64, 38, 19},
        {29, 45, 58, 55, 27, 2},
        {16, 68, 48, 7, 19, 15},
        {13, 66, 2, 23, 34, 2},
        {61, 24, 51, 6, 2, 1},
        {19, 20, 59, 40, 42, 15},
        {10, 37, 59, 53, 30, 4},
        {25, 53, 44, 3, 64, 10},
        {33, 50, 7, 3, 69, 24},
        {3, 21, 59, 50, 38, 6},
        {56, 45, 10, 40, 67, 2},
        {12, 57, 38, 15, 63, 24},
        {28, 26, 18, 38, 47, 17},
        {32, 55, 66, 64, 8, 10},
        {65, 16, 63, 10, 32, 17},
        {7, 67, 20, 29, 38, 22},
        {48, 59, 40, 69, 43, 19},
        {48, 3, 60, 16, 52, 1},
        {53, 31, 51, 34, 5, 23},
        {45, 15, 35, 26, 8, 9},
        {46, 25, 43, 48, 19, 14},
        {47, 46, 62, 57, 21, 8},
        {64, 8, 48, 30, 57, 9},
        {50, 1, 57, 24, 2, 26},
        {44, 9, 25, 34, 45, 8},
        {56, 23, 28, 5, 43, 19},
        {3, 26, 51, 35, 6, 17},
        {29, 58, 44, 10, 27, 24},
        {30, 10, 57, 63, 51, 20},
        {7, 41, 29, 43, 36, 5},
        {53, 30, 63, 48, 32, 12},
        {30, 48, 31, 41, 42, 3},
        {47, 23, 59, 29, 60, 15},
        {20, 11, 33, 39, 65, 24},
        {62, 12, 30, 17, 45, 5},
        {17, 64, 52, 1, 58, 1},
        {66, 12, 22, 54, 69, 15},
        {42, 38, 47, 52, 28, 1},
        {32, 17, 2, 7, 11, 11},
        {44, 21, 22, 39, 60, 12},
        {37, 23, 62, 22, 63, 19},
        {47, 63, 20, 40, 55, 5},
        {58, 51, 37, 54, 60, 19},
        {45, 39, 5, 57, 36, 11},
        {46, 4, 62, 1, 18, 25},
        {37, 63, 61, 50, 40, 21},
        {40, 38, 31, 20, 49, 21},
        {22, 9, 41, 61, 47, 21},
        {33, 11, 54, 22, 20, 24},
        {54, 32, 35, 40, 52, 1},
        {10, 20, 29, 48, 51, 17},
        // 01/02/23-

        {17, 24, 48, 62, 68, 23},
        {15, 26, 31, 38, 61, 3},
        {4, 17, 35, 49, 61, 8},
        {19, 25, 34, 57, 68, 4},
        {6, 28, 39, 43, 54, 12},
        {2, 38, 44, 50, 62, 19},
        {5, 11, 33, 35, 63, 14},
        {36, 39, 52, 57, 69, 1},
        {2, 12, 45, 61, 64, 26},
        {3, 20, 36, 42, 64, 4},
        {2, 3, 16, 23, 68, 7},
        {21, 32, 42, 46, 50, 4},
        {16, 21, 29, 53, 66, 2},
        {2, 31, 45, 46, 49, 20},
        {15, 45, 64, 67, 68, 18},
        {2, 4, 54, 61, 62, 14},
        {21, 33, 35, 62, 64, 24},
        {24, 38, 39, 48, 56, 4},
        {12, 21, 44, 50, 58, 26},
        {9, 38, 48, 52, 68, 25},
        {17, 23, 32, 38, 63, 23},
        {18, 34, 37, 45, 51, 14},
        {1, 26, 28, 55, 58, 25},
        {3, 15, 20, 23, 46, 11},
        {21, 24, 33, 55, 69, 3},
        {15, 20, 33, 36, 43, 12},
        {31, 39, 47, 51, 53, 6},
        {21, 26, 30, 45, 47, 23},
        {3, 38, 55, 61, 66, 1},
        {16, 53, 54, 57, 65, 8},
        {2, 15, 30, 35, 49, 6},
        {19, 21, 55, 66, 68, 3},
        {17, 36, 47, 63, 68, 25},
        {4, 11, 21, 38, 64, 11},
        {23, 25, 35, 63, 64, 25},
        {1, 33, 34, 56, 59, 18},
        {9, 36, 41, 44, 59, 4},
        {9, 10, 36, 46, 52, 14},
        {11, 22, 24, 51, 60, 18},
        {3, 5, 9, 42, 52, 11},
        {16, 30, 31, 54, 68, 1},
        {11, 19, 21, 29, 52, 17},
        {4, 9, 24, 46, 66, 7},
        {19, 26, 36, 43, 58, 14},
        {15, 17, 18, 47, 57, 19},
        {27, 28, 37, 50, 57, 5},
        {1, 27, 32, 47, 67, 14},
        {14, 20, 30, 54, 69, 11},
        {16, 18, 33, 37, 50, 8},
        {3, 10, 24, 46, 63, 4},
        {11, 20, 33, 43, 58, 24},
        {26, 27, 43, 61, 69, 4},
        {2, 13, 29, 58, 69, 4},
        {10, 16, 18, 40, 66, 16},
        {2, 9, 28, 36, 53, 4},
        {16, 28, 49, 51, 55, 23},
        {11, 24, 58, 66, 67, 26},
        {11, 19, 39, 44, 65, 7},
        {3, 17, 26, 38, 54, 15},
        {8, 21, 31, 32, 37, 23},
        {31, 32, 54, 60, 63, 12},
        {17, 26, 37, 61, 65, 2},
        {10, 23, 30, 54, 65, 11},
        {52, 58, 59, 64, 66, 9},
        {5, 11, 22, 23, 69, 7},
        {2, 8, 15, 19, 58, 10},
        {31, 43, 58, 59, 66, 9},
        {1, 4, 12, 36, 49, 5},
        {2, 18, 23, 27, 47, 15},
        {9, 17, 20, 38, 40, 18},
        {12, 31, 47, 58, 60, 23},
        {5, 14, 19, 46, 64, 22},
        {6, 15, 22, 42, 47, 26},
        {4, 14, 33, 39, 61, 3},
        {24, 26, 39, 47, 57, 23},
        {4, 8, 46, 47, 48, 5},
        {18, 43, 48, 60, 69, 14},
        {35, 36, 44, 45, 67, 14},
        {12, 32, 56, 67, 68, 26},
        {7, 9, 12, 31, 62, 22}


    };
}