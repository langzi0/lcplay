package CodePad;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * @author
 * @since 10/28/15
 * This is the template for adding any new class
 */

public class RotateArray extends InvokableBase {
  // Add this class to Common/Main.java
  @Override
  public Priority getRunPriority() {
    return new Priority(240313, 2, Category.LeetCode);
  }

  @Override
  public void run() {
    //Call your test in Common/Main.java
    int [] x = new int[]{1,2,3,4,5,6,7};
    rotate(x, 3);


    eq("", 1, 1);

  }
  public void rotate(int[] nums, int k) {
    int m = 0;
    int i = 0;
    while ( i < nums.length && m < nums.length ){
      int x = nums[i];
      int cur = i;
      // int pre = (cur - k + nums.length) % nums.length;
      int pre = Math.floorMod(cur - k, nums.length);
      while(pre != i){

        nums[cur] = nums[pre];
        m++;
        cur = pre;
        pre = Math.floorMod(cur - k, nums.length);
      }
      nums[cur] = x;
      m++;
      i++;
    }
  }

  int mod(int a, int b){
    // https://stackoverflow.com/questions/4412179/best-way-to-make-javas-modulus-behave-like-it-should-with-negative-numbers/4412200#4412200
    return (a % b + b) % b;
  }

}
