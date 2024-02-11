package com.mav.dsa.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sol4 {
  public static void main(String[] args) {
    int[] num1 = {1, 2, 3, 3};
    int[] num2 = {-1, 0, 1};
    Sol4 sol4 = new Sol4();
    sol4.findMedianSortedArrays(num1, num2);
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int a : nums1) {
      int counter = 1;
      if (map.containsKey(a)) {
        Integer count = map.get(a);
        count += 1;
        map.put(a, count);
      } else map.put(a, counter);
    }

    for (int a : nums2) {
      int counter = 1;
      if (map.containsKey(a)) {
        Integer count = map.get(a);
        count += 1;
        map.put(a, count);
      } else map.put(a, counter);
    }

    Set<Integer> integers = map.keySet();
    Iterator<Integer> iterator = integers.iterator();
    int[] result = new int[integers.size()];
    for (int i = 0; i < integers.size() && iterator.hasNext(); i++) {
      result[i] = iterator.next();
    }
    int median = -1;
    double resval = 0.0d;
    if (result.length % 2 != 0) {
      double ceil = Math.ceil(result.length / 2);
      int res = result[Double.valueOf(ceil).intValue()];
      resval = Double.valueOf(res + "");

    } else {
      double lower = Math.ceil(result.length / 2);
      double upper = Math.floor(result.length / 2);
      int res =
          (result[Double.valueOf(lower).intValue()] + result[Double.valueOf(upper).intValue()]) / 2;
      resval = Double.valueOf(res + "");
    }

    return resval;
  }
}
