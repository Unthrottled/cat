package io.acari.dp;

public class NCR {

    public long find(int n, int k) {
        final long[][] lookup = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || (i == j)) {
                    lookup[i][j] = 1;
                } else {
                    lookup[i][j] = (lookup[i - 1][j - 1] + lookup[i - 1][j]) % 1000000007L;
                }
            }
        }

        return lookup[n][k];
    }
}
