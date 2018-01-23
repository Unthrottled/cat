package io.acari.algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BreakingRecords {

    public IntStream find(IntStream scores) {
        int low = 0;
        int high = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        List<Integer> collect = scores.boxed().collect(Collectors.toList());
        for (Integer s : collect) {
            if (max < s) {
                if (max != Integer.MIN_VALUE) high++;
                max = s;
            }

            if (min > s) {
                if (min != Integer.MAX_VALUE) low++;
                min = s;
            }

        }


        return IntStream.of(high, low);
    }
}
