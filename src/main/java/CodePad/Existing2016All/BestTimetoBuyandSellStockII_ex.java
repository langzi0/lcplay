package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times). However, you may not engage in
 * multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */

public class BestTimetoBuyandSellStockII_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }


  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      int d = prices[i] - prices[i - 1];
      if (d > 0) {
        profit += d;
      }
    }
    return profit;
  }
}