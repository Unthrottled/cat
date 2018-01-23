package io.acari.dp;

import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSequence {

    public int find(List<Integer> guy) {
        if (guy.size() > 1) {
            int[] lis = new int[guy.size()];
            Arrays.fill(lis, 1);
            for (int i = 1; i < lis.length; i++) {
                for (int j = 0; j < i; j++) {
                    int left = guy.get(j);
                    int right = guy.get(i);
                    if (left < right) {
                        lis[i] = Math.max(lis[j] + 1, lis[i]);
                    }
                }
            }
            return Arrays.stream(lis).max().orElse(0);
        }
        return 0;
    }
}
