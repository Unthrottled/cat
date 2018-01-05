package io.acari.intro;

public class AdjacentLists {

  /**
   * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
   * @param inputArray
   * @return the maximal absolute difference between any two of its adjacent elements.
   */
  int arrayMaximalAdjacentDifference(int[] inputArray) {
    int maxDiff = 0;
    for (int i = 0; i < inputArray.length - 1; i++) {
      int diff = Math.abs(inputArray[i] - inputArray[i + 1]);
      maxDiff = maxDiff < diff ? diff : maxDiff;
    }
    return maxDiff;
  }


}
