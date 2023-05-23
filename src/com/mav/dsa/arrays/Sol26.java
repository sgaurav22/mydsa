package com.mav.dsa.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//26. Remove Duplicates from Sorted Array
public class Sol26 {

    public static void main(String[] args){
      int[] nums = {0,0,1,1,1,2,2,3,3,4};
      //int[] nums = {1,1,2};
      Sol26 sol26 = new Sol26();
      int length = sol26.removeDuplicates(nums);
      System.out.println("Unique Element length : "+length);
      for (int a : nums) {
          System.out.println(a);
      }
    }

    // Solution using two pointers
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    // Long solution
    /*public int removeDuplicates(int[] nums) {
        int k = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Integer counter = 1;
        // Count the duplicate using map
        for (int val : nums) {
            if (!map.containsKey(val)) {
                map.put(val, counter);
            } else {
                Integer count = map.get(val);
                map.put(val, count+1);
            }
        }

        // Get the unique list from map and get the size of it.
        Set<Integer> keySet = map.keySet();
        if (!map.isEmpty()) {
            k = keySet.size();
        }

        Iterator<Integer> iterator = keySet.iterator();
        int[] num = new int[k];
        for(int i = 0; i < k; i++) {
            if (iterator.hasNext()) {
                num[i] = iterator.next();
            } //else num[i] = -1;
        }
        nums = num;
      return k;
    }*/
}
