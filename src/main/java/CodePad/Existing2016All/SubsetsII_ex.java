package CodePad.Existing2016All;

import java.util.ArrayList;
import java.util.Arrays;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
 *
 * Note: Elements in a subset must be in non-descending order. The solution set must not contain
 * duplicate subsets. For example, If S = [1,2,2], a solution is:
 *
 * [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 */

public class SubsetsII_ex extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
    Arrays.sort(num);
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> path = new ArrayList<Integer>();
    subsets(num, 0, path, result);
    return result;
  }

  private void subsets(int[] num, int begin, ArrayList<Integer> path,
                       ArrayList<ArrayList<Integer>> result) {
    result.add(new ArrayList<Integer>(path));
    for (int i = begin; i < num.length; i++) {
      if (i > begin && num[i - 1] == num[i]) {
        continue;
      }
      path.add(num[i]);
      subsets(num, i + 1, path, result);
      path.remove(path.size() - 1);
    }
  }
}