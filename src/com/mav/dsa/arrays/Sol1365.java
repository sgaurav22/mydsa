package com.mav.dsa.arrays;

import java.time.LocalTime;
import java.util.Arrays;

public class Sol1365 {
    public static void main(String[] args){
        Sol1365 sol1365 = new Sol1365();
        int[] arr = {8,1,2,2,3};
        //int[] current = sol1365.smallerNumbersThanCurrent(arr);
        int[] current = sol1365.smallerNumbersThanCurrentOptimized(arr);
        System.out.println(Arrays.toString(current));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            for(int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && i != j) {
                    counter++;
                }
            }
            arr[i] = counter;
        }
        return arr;
    }

    public int[] smallerNumbersThanCurrentOptimized(int[] nums) {
        int[] freq=new int[101];
        // how many times a number got repeated.
        for(int n:nums) {
            freq[n] = freq[n]+1;
        }

        // updating the freq to capture the element
        for(int i=1;i<101;i++) {
            freq[i] = freq[i]+freq[i-1];
        }

        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0)
                result[i]=0;
            else
                result[i]=freq[nums[i]-1];
        }
        return result;
    }
}
