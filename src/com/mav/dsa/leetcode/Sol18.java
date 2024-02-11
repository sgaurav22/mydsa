package com.mav.dsa.leetcode;

import java.util.*;

public class Sol18 {

  public static void main(String[] args) {

    //int[] arr = {1, 0, -1, 0, -2, 2};
    int[] arr = {-497,-481,-481,-472,-471,-465,-422,-420,-413,-405,-388,-381,-366,-361,-359,-348,-334,-334,-318,-310,-305,-280,-273,-272,-262,-254,-248,-223,-208,-202,-196,-192,-189,-167,-165,-165,-156,-143,-136,-122,-120,-120,-108,-77,-50,-44,-34,-26,-17,-5,13,46,46,53,54,56,66,71,72,75,89,115,130,139,149,151,154,196,209,219,230,240,245,246,253,267,277,289,299,302,303,304,342,349,360,361,361,375,392,400,407,408,408,426,427,429,443,451,481};
    int target = -5617;
    //int target = 0;
    Sol18 sol18 = new Sol18();
    System.out.println(sol18.fourSum(arr, target));
  }

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Set<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        for (int k = 0; k < nums.length; k++) {
          for (int l = 0; l < nums.length; l++) {
            int a = nums[i];
            int b = nums[j];
            int c = nums[k];
            int d = nums[l];
            if (a + b + c + d == target
                && (i != j && i != k && i != l && j != k && j != l && k != l)) {
              List<Integer> integers = new ArrayList<>();
              integers.add(a);
              integers.add(b);
              integers.add(c);
              integers.add(d);
              Collections.sort(integers);
              set.add(integers);
            }
          }
        }
      }
    }
    List<List<Integer>> list = new ArrayList<>(set);

    return list;
  }

  public List<List<Integer>> twoSum(int[] nums, int target) {
    Set<List<Integer>> set = new HashSet();
    int left, right;

    // Get the sum of two elements
    for(int i = 0; i < nums.length; i++) {
      left = nums[i];
      right = nums[nums.length-1];
      int sum = left + right;

      // if sum == target then add the left and right element to hashset
      if (sum == target) {
        List<Integer> integers = new ArrayList<>();
        integers.add(left);
        integers.add(right);
        set.add(integers);

      }

    }


    return null;
  }
}
