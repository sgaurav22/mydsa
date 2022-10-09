package com.mav.dsa.arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Sol2114 {
    public static void main(String[] args){
      //
        String[] strs = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        Sol2114 sol2114 = new Sol2114();
        int maxWord = sol2114.mostWordsFound(strs);
        System.out.println(maxWord);
    }

    public int mostWordsFound(String[] sentences) {
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (String str : sentences) {
            String[] split = str.split(" ");
            map.put(str, split.length);
        }

        Collection<Integer> values = map.values();
        for (Integer val : values) {
            if (val > max) max = val;
        }
        return max;
    }
}
