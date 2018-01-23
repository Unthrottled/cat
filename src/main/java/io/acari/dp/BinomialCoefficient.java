package io.acari.dp;

public class BinomialCoefficient {

    public long find(int n, int r) {
        final long[][] lookup = new long[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            //This is so that we do not unessessaraly calculate values greater than
            //N or R when building our lookup table
            int upperBounds = Math.min(i, r);
            for (int j = 0; j <= upperBounds; j++) {
                if (j == 0 || (i == j)) {
                    lookup[i][j] = 1;
                } else {
                    lookup[i][j] = (lookup[i - 1][j - 1] + lookup[i - 1][j]) % 1000000007L;
                }
            }
        }
        return lookup[n][r];
    }
}
