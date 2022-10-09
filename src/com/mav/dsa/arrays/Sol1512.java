package com.mav.dsa.arrays;

public class Sol1512 {
    public static void main(String[] args){
        //int[] nums = {1,2,3,1,1,3};
        int[] nums = {1,2,3};
        Sol1512 sol1512 = new Sol1512();
        int pairs = sol1512.numIdenticalPairs(nums);
        System.out.println(pairs);
    }

    public int numIdenticalPairs(int[] nums) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) str.append(i+","+j).append(" ");
            }
        }
        if (str.toString().equals("")) return 0;
        else {
            String[] split = str.toString().split(" ");
            return split.length;
        }
    }


}
