package io.acari.binary;

import java.util.Arrays;

public class MergeSort {
  public int[] sort(int array[]) {
    _sort(Arrays.copyOf(array, array.length), 0, array.length - 1, array);
    return array;
  }

  private void _sort(int[] array, int low, int high, int[] copy) {
    if (low < high) {
      int middle = (int) Math.floor(((double) high + (double) low) / 2D);
      _sort(copy, low, middle, array);
      _sort(copy, middle + 1, high, array);

      int left = low;
      int right = middle + 1;
      for (int i = low; i <= high; i++) {
        int leftValue = array[left];
        int rightValue = array[right];
        if ((leftValue < rightValue && left <= middle) || right == middle) {
          copy[i] = leftValue;
          left = left + 1 <= middle ? left + 1 : middle + 1;
        } else {
          copy[i] = rightValue;
          right = right + 1 > high ? middle : right + 1;
        }
      }
    }
  }
}
