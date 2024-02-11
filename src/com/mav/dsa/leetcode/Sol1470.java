package com.mav.dsa.leetcode;

import java.util.Arrays;

public class Sol1470 {
  public static void main(String[] args) {
    //
    int[] arr = {2, 5, 1, 3, 4, 7};
    int turnpoint = 3;
    Sol1470 sol1470 = new Sol1470();
    int[] shuffle = sol1470.shuffle2(arr, turnpoint);
    System.out.println(Arrays.toString(shuffle));
  }

  public int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
    int[] xway = new int[n];
    int[] yway = new int[n];

    for (int i = 0; i < nums.length; i++) {
      if (i < n) xway[i] = nums[i];
      else yway[i - n] = nums[i];
    }

    for (int j = 0, i = 0; i < result.length; i++) {
      if (i % 2 == 0) result[i] = xway[j];
      else {
        result[i] = yway[j++];
      }
    }

    return result;
  }

  public int[] shuffle2(int[] nums, int n) {

    int[] ans = new int[nums.length];
    int x = 0;
    int y = n;

    int k = 0;
    while (y < nums.length) {
      ans[k++] = nums[x++];
      ans[k++] = nums[y++];
    }
    return ans;
  }
}
