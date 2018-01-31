package io.acari.binary;

public class QuickSort {

  static int _partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        _swap(array, ++i, j);
      }
    }
    _swap(array, ++i, high);

    return i;
  }

  static void _swap(int[] array, int i, int pivot) {
    int tempo = array[i];
    array[i] = array[pivot];
    array[pivot] = tempo;
  }

  public int[] sort(int array[]) {
    _quickSort(array, 0, array.length - 1);
    return array;
  }

  private void _quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pivot = _partition(array, low, high);
      _quickSort(array, low, pivot - 1);
      _quickSort(array, ++pivot, high);
    }
  }
}
