package io.acari.dp;

public class BinomialCoefficient {

    public long find(int n, int r) {
        final long[][] lookup = new long[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
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
