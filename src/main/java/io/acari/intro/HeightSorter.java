package io.acari.intro;

import java.util.Arrays;

public class HeightSorter {

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
      if(value > -1 && currentIndex < a.length){
        while (currentIndex < copy.length && a[currentIndex] == -1){currentIndex++;}
        a[currentIndex++] = value;
      }
    }
    return a;
  }

}
