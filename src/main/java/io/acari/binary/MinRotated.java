package io.acari.binary;

public class MinRotated {

    public int search(int array[]) {
        int right = array.length - 1;
        int left = 0;
        int lefto = array[left];
        int righto = array[right];
        if (array.length == 1 || lefto < righto) {
            return left;
        }  else {
            return search(array, left, right);
        }
    }

    private int search(int array[], int left, int right) {
        if (left < right) {
            int middleIndex = (int) Math.floor(((double) left + (double) right) / 2D);
            int midPrev = middleIndex - 1 < left ? left : middleIndex - 1;
            int midNext = middleIndex + 1 > right ? right : middleIndex + 1;
            int middlePrevious = array[midPrev];
            int middle = array[middleIndex];
            if (middle < middlePrevious) {
                return middleIndex;
            } else if (array[midNext] < middle) {
                return midNext;
            } else if (middle < array[left]) {
                return search(array, left, --middleIndex);
            } else {
                return search(array, ++middleIndex, right);
            }
        }

        return -1;
    }
}
