package io.acari.intro;

public class ArrayChange {

  /**
   * You are given an array of integers.
   * On each move you are allowed to increase exactly
   * one of its element by one.
   * <p>
   * Find the minimal number of moves required to
   * obtain a strictly increasing sequence from the input.
   *
   * @param inputArray
   * @return
   */
  int arrayChange(int[] inputArray) {
    int sum = 0;
    int i1 = inputArray.length - 1;
    for (int i = 0; i < i1; i++) {
      int currentValue = inputArray[i];
      int nextValue = inputArray[i + 1];
      if (currentValue >= nextValue) {
        int abs = Math.abs(currentValue - (nextValue - 1));
        sum += abs;
        inputArray[i + 1] += abs;

      }
    }
    return sum;
  }
}
