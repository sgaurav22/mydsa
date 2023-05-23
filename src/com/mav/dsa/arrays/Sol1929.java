package com.mav.dsa.arrays;

import java.util.Arrays;

public class Sol1929 {

  public static void main(String[] args) {
    Sol1929 sol1929 = new Sol1929();
    int[] str = {1, 2, 1};
    int[] result = sol1929.getConcatenation(str);
    System.out.println(Arrays.toString(result));
  }

  public int[] getConcatenation(int[] nums) {
    int length = nums.length;
    int[] ans = new int[length * 2];
    for (int a = 0; a < ans.length; a++) {
      if (a < length) ans[a] = nums[a];
      else ans[a] = nums[a - length];
    }

    return ans;
  }
}
