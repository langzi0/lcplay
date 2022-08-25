package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of
 * the stock), design an algorithm to find the maximum profit.
 */

public class BestTimetoBuyandSellStock extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }


  public int maxProfit(int[] prices) {
    int lowest = 0;
    int maxProfit = 0;
    if (prices.length > 0) {
      lowest = prices[0];
      for (int i = 0; i < prices.length; i++) {
        if (lowest > prices[i]) {
          lowest = prices[i];
        }
        maxProfit = Math.max(maxProfit, prices[i] - lowest);
      }
    }
    return maxProfit;
  }
}