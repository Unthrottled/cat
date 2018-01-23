package io.acari.binary;

public class MinRotatedIterative {

    public int search(int array[]) {
        int left = 0;
        int right = array.length - 1;
        if (array.length < 2 || array[left] < array[right]) {
            return left;
        }

        while (left < right) {
            int middleIndex = (int) Math.floor(((double) left + (double) right) / 2D);
            int middlePrevious = middleIndex - 1 < left ? left : middleIndex - 1;
            int middleNext = middleIndex + 1 > right ? right : middleIndex + 1;
            if (array[middleIndex] < array[middlePrevious]) {
                return middleIndex;
            } else if (array[middleNext] < array[middleIndex]) {
                return middleNext;
            } else if (array[middleIndex] < array[left]) {
                right = --middleIndex;
            } else {
                left = ++middleIndex;
            }
        }
        return -1;
    }
}
