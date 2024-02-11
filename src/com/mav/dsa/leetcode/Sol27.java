package com.mav.dsa.leetcode;

import java.util.Arrays;

public class Sol27 {
  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3};
    int val = 3;
    Sol27 sol27 = new Sol27();
    System.out.println(sol27.removeElement(nums, val));
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
  }

  public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
    }
    return i;
  }
}
