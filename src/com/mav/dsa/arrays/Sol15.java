package com.mav.dsa.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Sol15 {
    public static void main(String[] args){
        Sol15 sol15 = new Sol15();
        //int[] nums = {-1,0,1,2,-1,-4};
        int[] nums = {0,0,0};
        //int[] nums = {0,0,0,0};
        //int[] nums = {0,1,1};
        int target = 0;
        List<List<Integer>> lists = sol15.threeSum(nums, target);
        System.out.println(lists);
    }

    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = null;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {

            map.put(nums[i], i);
        }

        return lists;

    }


}
