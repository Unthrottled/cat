package io.acari;

public class RecursiveBinarySearch {

    public int search(int array[], int leftIndex, int rightIndex, int value){
        if(leftIndex < rightIndex){
            int smallest = array[leftIndex];
            if (smallest == value){
                return leftIndex;
            } else if (array[rightIndex] == value){
                return rightIndex;
            }

            int middle = (int) Math.floor(((double) leftIndex + (double) rightIndex) / 2D);
            int middleGuy = array[middle];
            if(middleGuy == value){
                return middle;
            } else if (middleGuy > value){
                return search(array, leftIndex, --middle, value);
            } else {
                return search(array, ++middle, rightIndex, value);
            }

        }

        return 0 - ++leftIndex;
    }
}
