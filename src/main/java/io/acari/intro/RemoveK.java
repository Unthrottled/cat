package io.acari.intro;

public class RemoveK {

  /**
   * Given array of integers, remove each kth element from it.
   *
   * @param inputArray
   * @param k
   * @return
   */
  int[] extractEachKth(int[] inputArray, int k) {
    int removed = inputArray.length / k;
    int[] returnArray = new int[inputArray.length - removed];
    int index = 0;
    for (int i = 1; i <= inputArray.length; i++) {
      if (i % k != 0) {
        returnArray[index++] = inputArray[i - 1];
      }

    }

    return returnArray;
  }

}
