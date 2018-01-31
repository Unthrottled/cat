package io.acari.prac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstDup {

  /**
   * Given an array a that contains only numbers in the
   * range from 1 to a.length, find the first duplicate
   * number for which the second occurrence has the minimal index.
   * <p>
   * In other words, if there are more than 1 duplicated numbers,
   * return the number for which the second occurrence has a smaller
   * index than the second occurrence of the other number does.
   * If there are no such elements, return -1.
   * <p>
   * <p>
   * TODO: MEEEEE
   *
   * @param a
   * @return
   */
  int firstDuplicate(int[] a) {
    Set<Integer> set = new HashSet<>();
    return Arrays.stream(a).boxed().filter(i -> !set.add(i))
        .findFirst().orElse(-1);
  }
}
