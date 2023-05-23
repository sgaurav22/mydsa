package com.mav.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sol1 {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    // int[] nums = {3,3};
    // int target = 6;
    int target = 9;
    Sol1 sol1 = new Sol1();
    int[] twoSum = sol1.twoSum(nums, target);
    int[] twoSumOptimized = sol1.twoSumOptimized(nums, target);
    System.out.println(Arrays.toString(twoSum));
    System.out.println(Arrays.toString(twoSumOptimized));
  }

  public int[] twoSum(int[] nums, int target) {
    return twoSumSorted(nums, target);
  }

  public int[] twoSumSorted(int[] nums, int target) {
    // Arrays.sort(nums);
    int[] res = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          res[0] = i;
          res[1] = j;
        }
      }
    }
    return res;
  }

  public int[] twoSumOptimized(int[] nums, int target) {
    Map<Integer, Integer> mapping = new HashMap<>(); // num to index

    for (int i = 0; i < nums.length; i++) {
      if (mapping.containsKey(target - nums[i]))
        return new int[] {i, mapping.get(target - nums[i])};

      mapping.put(nums[i], i);
    }
    return new int[2];
  }
}
