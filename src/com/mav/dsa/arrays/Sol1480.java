package com.mav.dsa.arrays;

import java.util.Arrays;

public class Sol1480 {
  public static void main(String[] args) {
    int[] str = {1, 2, 3, 4};
    Sol1480 sol1480 = new Sol1480();
    int[] sum = sol1480.runningSum(str);
    System.out.println(Arrays.toString(sum));
  }

  public int[] runningSum(int[] nums) {
    int length = nums.length;
    int[] runningSum = new int[length];
    int sum = 0;
    for (int a = 0; a < length; a++) {

      if (a - 1 < 0) runningSum[a] = nums[a];
      else runningSum[a] = nums[a] + sum;

      sum = runningSum[a];
    }
    return runningSum;
  }
}
