package io.acari.intro;

public class Judge {

  /**
   * Two arrays are called similar if one can be obtained from another
   * by swapping at most one pair of elements in one of the arrays.
   * <p>
   * Given two arrays a and b, check whether they are similar.
   *
   * @param a
   * @param b
   * @return
   */
  boolean areSimilar(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      int aValue = a[i];
      int bValue = b[i];
      if (aValue != bValue) {
        int nextIndex = findIndex(b, i, aValue);
        do {
          if (nextIndex < 0) {
            return false;
          }
          swap(b, i, nextIndex);
          if (areEqual(a, b, i)) {
            return true;
          }
          int tempIndex = findIndex(b, nextIndex, aValue);
          swap(b, i, nextIndex);
          nextIndex = tempIndex;
        } while (nextIndex > -1);
        return false;
      }
    }

    return true;
  }

  private boolean areEqual(int[] a, int[] b, int startingIndex) {
    for (int i = startingIndex; i < a.length; i++) {
      int aValue = a[i];
      int bValue = b[i];
      if (aValue != bValue) {
        return false;
      }
    }

    return true;
  }

  private void swap(int[] b, int i, int j) {
    int temp = b[i];
    b[i] = b[j];
    b[j] = temp;
  }

  private int findIndex(int[] a, int i, int val) {
    for (int j = i; j < a.length; j++) {
      if (val == a[j]) {
        return j;
      }
    }
    return -1;
  }
}
