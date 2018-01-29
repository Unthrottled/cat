package io.acari.core;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestFactorial {

  /**
   * Given an integer n, find the minimal k such that
   * <p>
   * k = m! (where m! = 1 * 2 * ... * m) for some integer m;
   * k >= n.
   * <p>
   * In other words, find the smallest factorial which is not less than n.
   *
   * @param n
   * @return
   */
  int leastFactorial(int n) {
    int[] lookup = new int[n + 1];
    Arrays.fill(lookup, -1);
    return IntStream.rangeClosed(0, n)
        .map(i -> findFact(i, lookup))
        .filter(i -> i >= n)
        .findFirst().orElse(-1);
  }

  private int findFact(int i, int[] lookup) {
    if (lookup[i] != -1)
      return lookup[i];
    else if (i == 0) {
      return lookup[0] = 1;
    } else {
      return lookup[i] = lookup[i - 1] * i;
    }
  }
}
