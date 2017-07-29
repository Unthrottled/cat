package io.acari.dp;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CuttedSegments {

    public int find(int rodLength, Integer[] cuts) {
        Set<Integer> lengths = Arrays.stream(cuts).collect(Collectors.toSet());
        int[][] lookup = new int[rodLength + 1][cuts.length + 1];
        for (int currentRodLength = 0; currentRodLength <= rodLength; currentRodLength++) {
            for (int currentCutLength = 0; currentCutLength <= cuts.length; currentCutLength++) {
                if (currentRodLength == 0 || currentCutLength == 0) {
                    lookup[currentRodLength][currentCutLength] = 0;
                } else {
                    int cutValue = cuts[currentCutLength - 1];
                    int diffy = currentRodLength - cutValue;
                    if (diffy > -1 && isContains(lengths, diffy)) {
                        lookup[currentRodLength][currentCutLength] = Math.max(lookup[diffy][currentCutLength] + 1,
                                lookup[currentRodLength][currentCutLength - 1]);
                    } else {
                        lookup[currentRodLength][currentCutLength] = lookup[currentRodLength][currentCutLength - 1];
                    }
                }
            }
        }

        return lookup[rodLength][cuts.length];
    }

    private boolean isContains(Set<Integer> lengths, int diffy) {
        return lengths.stream().anyMatch(a -> diffy % a == 0);
    }
}
