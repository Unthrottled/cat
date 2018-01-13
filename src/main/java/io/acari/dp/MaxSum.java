package io.acari.dp;

import java.util.Arrays;

public class MaxSum {

  public int find(Integer[] integers) {
    Integer[] lookup = Arrays.copyOf(integers, integers.length);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < integers.length; i++) {
      int subMax = 0;
      for (int j = i - 1; j > -1; j--) {
        int one = integers[i];
        int two = integers[j];
        if (one > two) {
          if (lookup[j] > subMax) {
            subMax = lookup[j];
          }
        }
      }

      lookup[i] = Math.max(lookup[i], lookup[i] + subMax);

      if (lookup[i] > max) {
        max = lookup[i];
      }

    }

    return max;
  }
}
