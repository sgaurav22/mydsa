package com.mav.dsa.leetcode;

public class Sol1672 {
  public static void main(String[] args) {
    //
    int[][] arr = {{1, 2, 3}, {3, 2, 0}};
    Sol1672 sol1672 = new Sol1672();
    int maximumWealth = sol1672.maximumWealth(arr);
    System.out.println(maximumWealth);
  }

  public int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    for (int[] acnt : accounts) {
      int sum = 0;
      for (int a : acnt) {
        sum += a;
      }
      if (sum > maxWealth) maxWealth = sum;
    }
    return maxWealth;
  }
}
