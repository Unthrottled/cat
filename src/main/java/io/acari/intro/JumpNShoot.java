package io.acari.intro;

import java.util.Arrays;

public class JumpNShoot {

  /**
   * You are given an array of integers representing coordinates
   * of obstacles situated on a straight line.
   * <p>
   * Assume that you are jumping from the point with coordinate 0 to the right.
   * You are allowed only to make jumps of the same length represented by some integer.
   * <p>
   * Find the minimal length of the jump enough to avoid all the obstacles.
   *
   * @param inputArray
   * @return
   */
  int avoidObstacles(int[] inputArray) {
    int min = 1;
    boolean minUnknown;
    do {
      int temp = ++min;
      minUnknown = Arrays.stream(inputArray)
          .map(i -> i % temp)
          .anyMatch(i -> i == 0);
    } while (minUnknown);
    return min;
  }
}
