package io.acari.core;

public class DigitSummation {

  /**
   * You are given a two-digit integer n. Return the sum of its digits.
   *
   * @param n
   * @return
   */
  int addTwoDigits(int n) {
    return (n / 10) + (n % 10);
  }
}
