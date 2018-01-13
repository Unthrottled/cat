package io.acari.dp;

import java.util.Arrays;

public class BitonicSequence {

  public int find(Integer[] integers) {
    int length = integers.length;
    int[] increasing = new int[length];
    int[] decreasing = new int[length];
    Arrays.fill(increasing, 1);
    Arrays.fill(decreasing, 1);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < i; j++) {
        if (integers[i] > integers[j]) {
          increasing[i] = Math.max(increasing[j] + 1, increasing[i]);
        }
      }
    }

    for (int j = length - 1; j > -1; j--) {
      for (int k = j + 1; k < length; k++) {
        if (integers[j] > integers[k]) {
          decreasing[j] = Math.max(decreasing[k] + 1, decreasing[j]);
        }
      }
    }

    int max = 0;
    for (int i = 0; i < length; i++) {
      int thing = increasing[i] + decreasing[i] - 1;
      max = max < thing ? thing : max;
    }

    return max;
  }
}
