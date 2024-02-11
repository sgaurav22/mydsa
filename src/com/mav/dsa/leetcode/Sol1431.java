package com.mav.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Sol1431 {
  public static void main(String[] args) {
    Sol1431 sol1431 = new Sol1431();
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    List<Boolean> booleans = sol1431.kidsWithCandies(candies, extraCandies);
    System.out.println(booleans);
  }

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> booleans = new ArrayList<>();
    int max = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > max) max = candies[i];
    }

    for (int a : candies) {
      if (a + extraCandies >= max) booleans.add(true);
      else booleans.add(false);
    }
    return booleans;
  }
}
