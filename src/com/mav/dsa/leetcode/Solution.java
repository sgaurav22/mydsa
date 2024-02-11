/*
package com.dsa.leetcode.binarysearch;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Objects.*;

class Solution {
    */
/*public int solution(int[] P, int[] S) {
        int minCars = 0;
        int maxPerson = 0;
        int maxSeat = 0;
        int i = P.length;

        for(int person: P) {
            // get max person
            maxPerson += person;
        }
        System.out.println("Max Person"+maxPerson);

        //order the seat as per highest avaiable
        Arrays.sort(S);

        while(maxSeat < maxPerson) {
            maxSeat += S[i];
            i--;
            minCars++;
        }

        return minCars;
    }*//*


    public int solution(String S) {
        // Implement your solution here
        String regex = "H-H";
        String regex1 = "-H";
        String[]  str = S.replaceAll(regex);
        System.out.println(str);
        return 0;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        */
/*int[] P = {4,4,2,4};
        int[] S = {5,5,2,5};
        System.out.println(solution.solution(P, S));*//*


        String S = "-H-H-H-H-H";
        System.out.println(solution.solution(S));

    }
}
*/
