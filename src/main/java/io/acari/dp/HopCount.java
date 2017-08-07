package io.acari.dp;

import java.util.Arrays;

public class HopCount {

    public long find(int steps){
        long[][] lookup = new long[steps+1][4];
        Arrays.fill(lookup[0], 1);
        for (int step = 1; step <= steps ; step++) {
            for (int hop = 1; hop < 4; hop++) {
                int diffy = step - hop;
                lookup[step][hop] = ((diffy >= 0) ? lookup[diffy][3] : 0) +
                        (hop > 0 ? lookup[step][hop - 1] : 0);
            }
        }
        return lookup[steps][3];
    }
}
