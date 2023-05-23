package com.mav.dsa.search.linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

  LinearSearch linearSearch;
  int[] arr;

  @BeforeEach
  public void setup() {
    /*linearSearch = new LinearSearch();*/
    arr = new int[] {5, 8, 9, 6, 11, 15, 17, 19};
  }

  @Test
  public void testLinearSearch() {
    int actual = LinearSearch.linearSearch(arr, 15);
    assertEquals(5, actual);
  }
}
