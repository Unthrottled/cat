package io.acari;

public class CountSort {

  public int[] sort(int array[]) {
    int[] counto = new int[1000];
    for (int anArray : array) {
      counto[anArray]++;
    }
    for (int i = 1; i < counto.length; i++) {
      counto[i] += counto[i - 1];
    }

    int[] returnArray = new int[array.length];
    for (int guy : array) {
      returnArray[counto[guy] - 1] = guy;
      counto[guy]--;
    }

    return returnArray;
  }
}
