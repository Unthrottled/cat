package io.acari.core;

import java.util.function.IntFunction;

public class ToTheRight {

  /**
   * Presented with the integer n,
   * find the 0-based position of the
   * second rightmost zero bit in its binary
   * representation (it is guaranteed that such a bit exists),
   * counting from right to left.
   *
   * @param n
   * @return
   */
  int secondRightmostZeroBit(int n) {
    return (int) ((IntFunction) i -> {
      String shitFuck = Integer.toBinaryString(i);
      for (int j = shitFuck.length() -1, a=0, x =0; j > -1; --j, x++) {
        if(shitFuck.charAt(j) == '0' && ++a == 2)
          return 1 << x;
      }
      return 0;
    }).apply(n);
  }

}
