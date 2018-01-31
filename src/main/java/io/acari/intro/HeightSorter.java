package io.acari.intro;

import java.util.Arrays;

public class HeightSorter {

  public static final int IS_TREE = -1;

  /**
   * Some people are standing in a row in a park.
   * There are trees between them which cannot be moved.
   * Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
   *
   * @param a
   * @return
   */
  int[] sortByHeight(int[] a) {
    int[] copy = Arrays.copyOf(a, a.length);
    Arrays.sort(copy);
    int currentIndex = 0;
    for (int i = 0; i < copy.length; i++) {
      int value = copy[i];
      if (value > IS_TREE && currentIndex < a.length) {
        while (currentIndex < copy.length && a[currentIndex] == IS_TREE) {
          currentIndex++;
        }
        a[currentIndex++] = value;
      }
    }
    return a;
  }

}
