package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;

/**
 * Code
 * Testcase
 * Testcase
 * Test Result
 * 52. N-Queens II
 * Solved
 * Hard
 * Topics
 * Companies
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * <p>
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: n = 4
 * Output: 2
 * Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: 1
 */

public class TotalNQueens_ex extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymdd*/240328, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        Util.assertEq(2, totalNQueens(4));


    }

    public int totalNQueens(int n) {
        int[] row = new int[n];
        return find(0, row, n);
    }
    // row[0 : n-1]  range 0  : n-1

    private int find(int i, int[] row, int n) {
        if (i == n) return 1;
        int cnt = 0;
        // Try to see we can assign val to row[i]
        for (int val = 0; val < n; val++) {

            boolean found = false;
            for (int j = 0; j < i; j++)
                // val cannot be used before and can not same diagnoal
                if (row[j] == val || i - j == val - row[j] || -i + j == val - row[j]) {
                    found = true;
                    break;
                }
            if (!found) {
                row[i] = val;
                cnt += find(i + 1, row, n);
            }
        }

        return cnt;
    }

}