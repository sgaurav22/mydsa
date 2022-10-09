package com.mav.dsa.arrays;

import java.util.Arrays;

public class Arrays1D {
    public static void main(String[] args){
      //
        int[] arr = {1,2,1,3};
        int[] concatenation = getConcatenation(arr);
        System.out.println(Arrays.toString(concatenation));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length*2];
        for(int a = 0; a < ans.length; a++) {
            if(a < length)
                ans[a] = nums[a];
            else
                ans[a] = nums[a - length];
        }

        return ans;
    }
}
