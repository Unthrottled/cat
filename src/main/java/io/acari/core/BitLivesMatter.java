package io.acari.core;

import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class BitLivesMatter {

  /**
   * You're given two integers, n and m. Find position of the rightmost pair of
   * equal bits in their binary representations
   * (it is guaranteed that such a pair exists),
   * counting from right to left.
   *
   * @param n
   * @param m
   * @return
   */
  int equalPairOfBits(int n, int m) {
    return ((BinaryOperator<Integer>) (a, b) -> {
      String one = Integer.toBinaryString(a);
      String two = Integer.toBinaryString(b);
      //FUCK YO SHIT, THIS IS STUPID
      int max = Math.max(one.length(), two.length());
      if (max != one.length())
        one = IntStream.range(0, max - one.length())
            .mapToObj(aq -> "0")
            .reduce("", (r, c) -> r + c) + one;
      if (max != two.length())
        two = IntStream.range(0, max - two.length())
            .mapToObj(aq -> "0")
            .reduce("", (r, c) -> r + c) + two;
      for (int i = max - 1, j = 0; i > -1; --i, j++) {
        if (one.charAt(i) == two.charAt(i))
          return (int) Math.pow(2, j);
      }
      return 0;
    }).apply(n, m);
  }

}
