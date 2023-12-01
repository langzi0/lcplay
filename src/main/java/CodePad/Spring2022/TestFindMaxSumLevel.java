package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;
import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

        1
   7        0
 7  -8
Example 1:


Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation:
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
Example 2:

Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2
*/


public class TestFindMaxSumLevel extends InvokableBase {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    @Override
    public Priority getRunPriority() {
        return new Priority(221007, 1, Category.LeetCode);
    }


    @Override
    public void run() {


    }

    private void go(Integer ... listInts){

    }

    private List<TreeNode> getNextLevel(List<TreeNode> curLevel) {
        List<TreeNode> nextLevel = new ArrayList<>();
        for (TreeNode n : curLevel) {
            if (n.left != null) nextLevel.add(n.left);
            if (n.right != null) nextLevel.add(n.right);
        }
        return nextLevel;
    }

    private int getSumLevel(List<TreeNode> list) {
        int sum = 0;
        for (var n : list) sum += n.val;
        return sum;
    }


    public int maxLevelSum(TreeNode root) {
        int sum = root.val;


        int sumSofar = root.val;
        int levelSoFar = 1;

        int level = 1;
        List<TreeNode> curLevel = new ArrayList<>(List.of(root));
        curLevel = getNextLevel(curLevel);

        while (curLevel.size() > 0) {
            int vals = getSumLevel(curLevel);
            level++;
            sum += vals;
            if (vals > 0) {
                sumSofar = sum;
                levelSoFar = level;
            }
            curLevel = getNextLevel(curLevel);
        }

        return levelSoFar;


    }

}
