package com.mav.dsa.search.linear;

public class LinearSearch {

  public static void main(String[] args) {
    //
    int[] arr = {5, 7, 9, 12, 15, 19, 24, 29};
    int target = 29;
    int search = linearSearch(arr, target);
    System.out.println(search);
  }

  public static int linearSearch(int[] arr, int target) {
    int val = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (target == arr[i]) return i;
    }
    return val;
  }
}
