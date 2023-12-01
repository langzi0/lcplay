package Lang;

import java.util.ArrayList;

public class test {


    private int findMin(int[] arry) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min)
                min = arry[i];
        }
        return min;
    }

    private int findMin1(int[] arry) {
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < min)
                min = arry[i];
        }
        return min;
    }

    private boolean isArrayIncreasingFor(ArrayList<Integer> list) {
        if (list.size() <= 1)
            return true;

        boolean flag = false;
        for (int i = 1; i < list.size() && !flag ; i++) { //using for loop and add a flag to quit for
            if (list.get(i-1) > list.get(i))
                return false;
        }
        return true;
    }

    private boolean isArrayIncreasingWhile(ArrayList<Integer> list) {
        if (list.size() <= 1)  return true;

        boolean flag = false;
        int i = 1;
        while (i < list.size() && !flag ) { //using while loop
            if (list.get(i-1) > list.get(i))
                flag = true;
            i++;
        }
        if (flag) {
            // dosomething
        }
        return !flag;
    }


    private Integer isArrayIncreasing_DoSomething(int[][] a) {
        // find how many rows that has increasing order
        Integer countOfInc = 0;
        for (int r = 0; r< a.length; r++)
        {
            boolean isIncreasing = true;
            for (int c = 1; c< a[0].length && isIncreasing; c++){
                if (a[r][c-1] >= a[r][c])
                    isIncreasing = false;
            }
            if (isIncreasing)
                countOfInc ++;
        }
        return countOfInc;
    }

}
