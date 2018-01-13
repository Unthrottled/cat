package io.acari.binary;

public class MaxRotatedIterative {

  public int search(int array[]) {
    int left = 0;
    if (array.length < 2) {
      return left;
    } else if (array.length == 2) {
      return array[left] > array[++left] ? --left : left;
    }

    int right = array.length - 1;
    while (right - left > 1) {
      int middle = (int) Math.floor(((double) left + (double) right) / 2D);
      int middleValue = array[middle];
      int middleLeft = middle - 1 < left ? left : middle - 1;
      int middleRight = middle + 1 > right ? right : middle + 1;
      int middleLeftValue = array[middleLeft];
      int middleRightValue = array[middleRight];
      if (middleValue > middleLeftValue && middleValue >= middleRightValue) {
        return middle;
      } else if (middleValue < middleLeftValue) {
        right = --middle;
      } else {
        left = ++middle;
      }
    }

    return array[left] >= array[right] && array[left] >= array[left - 1 < 0 ? 0 : left - 1] ? left :
        array[right] >= array[left] && array[right + 1 >= array.length ? right : right + 1] <= array[right] ? right : -1;
  }
}
