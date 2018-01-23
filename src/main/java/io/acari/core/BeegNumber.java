package io.acari.core;

public class BeegNumber {

  /**
   * Given an integer n, return the largest number that contains
   * exactly n digits.
   *
   * @param n
   * @return
   */
  int largestNumber(int n) {
    int b = 0;
    while (n > 0){
      b *= 10;
      b += 9;
      n--;
    }
    return b;
  }

}
