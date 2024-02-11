package com.mav.dsa.leetcode;

public class Sol167 {
  public static void main(String[] args) {
    new Sol167().twoSum(new int[] {2,7,11,15}, 9);
  }

  public int[] twoSum(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;

    while (start < end) {
      int head = numbers[start];
      int tail = numbers[end];
      if (head + tail == target) {
        return new int[] {start+1, end+1};
      } else if (head + tail > target) {
        end--;
        continue;
      } else {
        start++;
      }
    }
    return new int[] {-1, -1};
  }

  /*public int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = numbers.length - 1; j > i; j--) {
        if (numbers[j] > target && numbers[j/2] > target) {
          if (j % 2 == 0) j = j / 2;
          else j = j + 1 / 2;
        }
        if (numbers[i] + numbers[j] == target) {
          return new int[] {i + 1, j + 1};
        }
      }
    }

    return new int[] {-1, -1};
  }*/
}
