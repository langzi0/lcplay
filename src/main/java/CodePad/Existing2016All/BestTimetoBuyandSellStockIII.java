package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 *
 * Note: You may not engage in multiple transactions at the same time (ie, you must sell the stock
 * before you buy again).
 */

public class BestTimetoBuyandSellStockIII extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public int maxProfit(int[] prices) {
    if (prices.length < 2) {
      return 0;
    }
    int max = 0;
    for (int i = 0; i < prices.length; i++) {
      max = Math.max(max, maxProfitSingle(prices, 0, i)
                          + maxProfitSingle(prices, i, prices.length - 1));
    }
    return max;
  }

  public int maxProfitSingle(int[] prices, int start, int end) {
    int lowest = 0;
    int maxProfit = 0;
    if (end - start + 1 > 0) {
      lowest = prices[start];
      for (int i = start; i <= end; i++) {
        if (lowest > prices[i]) {
          lowest = prices[i];
        }
        maxProfit = Math.max(maxProfit, prices[i] - lowest);
      }
    }
    return maxProfit;
  }
}