package io.acari.binary;

public class IterativeRightBoundaryBinarySearch {

    public int search(int array[], int value) {
        int left = 0;
        if (array[left] > value) {
            return -1;
        }

        int right = array.length - 1;
        if (array[right] < value) {
            return getInverse(right);
        }

        right++;
        while (right - left > 1) {
            int middle = (int) Math.floor(((double) left + (double) right) / 2D);
            int middleValue = array[middle];
            if (middleValue <= value) {
                left = middle;
            } else {
                right = middle;
            }
        }

        return array[left] == value ? left : getInverse(right);
    }

    private int getInverse(int right) {
        return -(++right);
    }
}