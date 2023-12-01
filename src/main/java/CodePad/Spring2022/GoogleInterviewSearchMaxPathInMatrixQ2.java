package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import org.apache.commons.lang3.tuple.Pair;
import java.util.ArrayList;
import java.util.List;

/*
n a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.

Return the maximum amount of gold you can collect under the conditions:

Every time you are located in a cell you will collect all the gold in that cell.
From your position, you can walk one step to the left, right, up, or down.
You can't visit the same cell more than once.
Never visit a cell with 0 gold.
You can start and stop collecting gold from any position in the grid that has some gold.


Example 1:

Input: grid = {{0,6,0},{5,8,7},{0,9,0}}
Output: 24
Explanation:
[[0,6,0},
 [5,8,7},
 [0,9,0}}
Path to get the maximum gold, 9 -> 8 -> 7.
Example 2:

Input: grid = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}}
Output: 28
Explanation:
{{1,0,7},
 {2,0,6},
 {3,4,5},
 {0,3,0},
 {9,0,20}}
Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.


Constraints:

m == grid.length
n == grid[i}.length
1 <= m, n <= 15
0 <= grid[i][j] <= 100
There are at most 25 cells containing gold.
*/


public class GoogleInterviewSearchMaxPathInMatrixQ2 extends InvokableBase {
    @Override
    public Priority getRunPriority() {
        return new Priority(221002, 1, Category.LeetCode);
    }

    @Override
    public void run() {
        Util.assertEq("", 24, new GoogleInterviewSearchMaxPathInMatrixQ2().getMaximumGold(new int[][]{{0, 6, 0}, {5, 8, 7}, {0, 9, 0}}));
        Util.assertEq("", 28, new GoogleInterviewSearchMaxPathInMatrixQ2().getMaximumGold(new int[][]{{1,0,7},{2,0,6},{3,4,5},{0,3,0},
                {9,0,20}}));

        Util.assertEq("", 0, new GoogleInterviewSearchMaxPathInMatrixQ2().getMaximumGold(new int[][]{{0,0,0},{0,0,0}}));
    }

    public GoogleInterviewSearchMaxPathInMatrixQ2() {
    }

    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {

                Pair<Integer, Integer> pair = Pair.of(i, j);

                int found = findMax(grid, pair, new ArrayList<Pair<Integer, Integer>>(), 0);
                if (found > max)
                    max = found;
            }
        return max;
    }

    private int findMax(int[][] grid, Pair pair, List<Pair<Integer, Integer>> path, int sum) {
        int i = (int) pair.getLeft();
        int j = (int) pair.getRight();
        int m = grid.length;
        int n = grid[0].length;
        if (grid[i][j] <= 0 || pathContains(path, pair))
            return sum;
        path.add(pair);
        sum += grid[i][j];
        int max = sum;
        for (var t : getNBs(Pair.of(i, j), m, n)){
            int val = findMax(grid, t, clonePath(path), sum);
            if (val > max) max = val;
        }
        return max;
    }

    List<Pair<Integer, Integer>> clonePath(List<Pair<Integer, Integer>> path) {
        List<Pair<Integer, Integer>> clone = new ArrayList<>();
        for (var p : path) {
            clone.add(Pair.of(p.getLeft(), p.getRight()));
        }
        return clone;
    }

    private boolean pathContains(List<Pair<Integer, Integer>> path, Pair pair) {
        for (var p : path) {
            if (p.getLeft() == pair.getLeft() && p.getRight() == pair.getRight())
                return true;
        }
        return false;
    }

    List<Pair<Integer, Integer>> getNBs(Pair<Integer, Integer> pair, int m, int n) {
        List<Pair<Integer, Integer>> neighBours = new ArrayList<>();
        if (pair.getLeft() > 0) neighBours.add(Pair.of(pair.getLeft() - 1, pair.getRight()));
        if (pair.getRight() > 0) neighBours.add(Pair.of(pair.getLeft(), pair.getRight() - 1));
        if (pair.getLeft() < m - 1) neighBours.add(Pair.of(pair.getLeft() + 1, pair.getRight()));
        if (pair.getRight() < n - 1) neighBours.add(Pair.of(pair.getLeft(), pair.getRight() + 1));
        return neighBours;
    }

}
