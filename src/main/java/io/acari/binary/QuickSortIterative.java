package io.acari.binary;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static io.acari.binary.QuickSort._partition;
import static io.acari.binary.QuickSort._swap;

public class QuickSortIterative {

    public int[] sort(int array[]){
        _quickSort(array);
        return array;
    }

    private void _quickSort(int[] array) {
        Deque<Integer> partitionStack = new LinkedList<>();
        partitionStack.push(0);
        int e = array.length - 1;
        partitionStack.push(e);
        while (!partitionStack.isEmpty()){
            int stackHigh = partitionStack.pop();
            int stackLow = partitionStack.pop();
            int partiton = _partition(array, stackLow, stackHigh);
            if(partiton - 1 > stackLow){
                partitionStack.push(stackLow);
                partitionStack.push(partiton -1);
            }

            if(partiton + 1 < stackHigh){
                partitionStack.push(partiton + 1);
                partitionStack.push(stackHigh);
            }

        }
    }

}
