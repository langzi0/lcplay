package CodePad.Existing2016All;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;

import java.util.ArrayList;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed
 * parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * "((()))", "(()())", "(())()", "()(())", "()()()"

 *
 */

public class GenerateParentheses_ex extends InvokableBase {

    @Override
    public Priority getRunPriority() {
        return new Priority(/*yymdd*/240327, 0, Category.LeetCode);
    }

    @Override
    public void run() {

        int size = 5;
        var x = generateParenthesis(size);
        Util.assertEq(5, x.size());
        x.forEach(p->System.out.println(p));

        genAllInstancesXuehai(size);
        Util.assertEq(5, ret.size());
        ret.forEach(System.out::println);


    }


    public ArrayList<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        generateParenthesis(n, 0, 0, 0, sb, ret);
        return ret;
    }

    // use recursive function.
    // Pn =  (Pn-1)  or   () Pn-1

    char[] instance;
    ArrayList<String> ret = new ArrayList<String>();

    public void genAllInstancesXuehai(int n) {
        instance = new char[2 * n];
        ret = new ArrayList<String>();
        genInstances(0, 0, n);


    }

    // open store the count of opening parenthesis now
    // close store the count of closing parenthesis now
    public void genInstances(int open, int close, int size) {
        if (close == size) {
            ret.add(new String(instance));
        }
        if (open < size) {
            instance[open + close] = '(';
            genInstances(open + 1, close, size);
        }
        if (close < open) {
            instance[open + close] = ')';
            genInstances(open, close + 1, size);
        }
    }

    // open store the count of opening parenthesis
    // close store the count of closing parenthesis
    public void generateParenthesis(int n, int open, int close, int pos,
                                    StringBuilder sb, ArrayList<String> ret) {
        if (open == n && close == n) {
            ret.add(sb.toString());
        } else {
            // either add a close )
            if (pos > 0 && close < n) {
                sb.append(')');
                generateParenthesis(n, open, close + 1, pos - 1, sb, ret);
                sb.deleteCharAt(sb.length() - 1);
            }

            // or after reset add a opening (
            if (open < n) {
                sb.append('(');
                generateParenthesis(n, open + 1, close, pos + 1, sb, ret);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}