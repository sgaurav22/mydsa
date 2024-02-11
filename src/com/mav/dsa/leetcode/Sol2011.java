package com.mav.dsa.leetcode;

public class Sol2011 {
  public static void main(String[] args) {
    Sol2011 sol2011 = new Sol2011();
    String[] str = {"--X", "X++", "X++"};
    int result = sol2011.finalValueAfterOperations(str);
    System.out.println(result);
  }

  public int finalValueAfterOperations(String[] operations) {

    int total = 0;
    for (String ops : operations) {
      int x = 0;
      switch (ops) {
        case "++X":
          ++x;
          total += x;
          break;
        case "X++":
          x++;
          total += x;
          break;
        case "--X":
          --x;
          total += x;
          break;
        case "X--":
          x--;
          total += x;
          break;
      }
    }
    return total;
  }
}
