package io.acari.binary;

public class RecursiveLeftBoundaryBinarySearch {

  public int search(int array[], int value) {
    int left = 0;
    if (array[left] > value) {
      return -1;
    }

    int right = array.length - 1;
    if (array[right] < value) {
      return getInverse(right);
    }

    return searcho(array, --left, right, value);
  }

  private int searcho(int[] array, int left, int right, int value) {
    if (right - left > 1) {
      int middleIndex = (int) Math.floor(((double) left + (double) right) / 2D);
      int middleValue = array[middleIndex];
      if (middleValue < value) {
        return searcho(array, middleIndex, right, value);
      } else {
        return searcho(array, left, middleIndex, value);
      }
    }

    return array[right] == value ? right : getInverse(right);
  }

  private int getInverse(int right) {
    return -(++right);
  }
}
