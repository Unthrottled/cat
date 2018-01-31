package io.acari.core;

import java.util.function.IntFunction;

public class SwappyBitties {

  /**
   * You're given an arbitrary 32-bit integer n.
   * Take its binary representation, split bits into it
   * in pairs (bit number 0 and 1, bit number 2 and 3, etc.)
   * and swap bits in each pair. Then return the
   * result as a decimal number.
   *
   * @param n
   * @return
   */
  int swapAdjacentBits(int n) {
    return ((IntFunction<Integer>) i -> {
      String o = Integer.toBinaryString(i);
      StringBuilder sb = new StringBuilder();
      if (o.length() % 2 != 0)
        o = '0' + o;
      for (int j = 1; j < o.length(); j += 2) {
        sb.append(o.charAt(j)).append(o.charAt(j - 1));
      }

      return Integer.parseInt(sb.toString(), 2);
    }).apply(n);
  }

}
