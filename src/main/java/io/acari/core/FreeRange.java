package io.acari.core;

import java.util.stream.IntStream;

public class FreeRange {
  /**
   * You are given two numbers a and b where 0 ≤ a ≤ b.
   * Imagine you construct an array of all the integers
   * from a to b inclusive. You need to count the number of
   * 1s in the binary representations of all the numbers
   * in the array.
   *
   * @param a
   * @param b
   * @return
   */
  int rangeBitCount(int a, int b) {
    return IntStream.rangeClosed(a,b)
        .map(Integer::bitCount)
        .sum();
  }

}
