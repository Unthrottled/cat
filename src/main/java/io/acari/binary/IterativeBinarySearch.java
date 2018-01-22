package io.acari.binary;

public class IterativeBinarySearch {

    public int search(int array[], int value) {
        int left = 0;
        if (array[left] == value) {
            return left;
        }

        int right = array.length - 1;
        if (array[right] == value) {
            return right;
        }

        while (left < right) {
            int middleIndex = (int) Math.floor(((double) left + (double) right) / 2D);
            int middleValue = array[middleIndex];
            if (middleValue == value) {
                return middleIndex;
            } else if (middleValue > value) {
                right = --middleIndex;
            } else {
                left = ++middleIndex;
            }
        }
        return array[left] == value ? left : -(++left);
    }
}
