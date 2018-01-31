package io.acari.dp;

public class PathInMatrix {

  public long find(Integer[][] matrix) {
    int length = matrix.length;
    long[][] lookup = new long[length + 2][length + 2];
    long max = Long.MIN_VALUE;
    for (int j = 1; j <= length; j++) {
      for (int i = 1; i <= length; i++) {
        lookup[j][i] = matrix[j - 1][i - 1];
      }

    }

    for (int i = 1; i <= length; i++) {
      for (int j = 1; j <= length; j++) {
        long summo = lookup[i][j] + Math.max(Math.max(lookup[i - 1][j], lookup[i - 1][j + 1]), lookup[i - 1][j - 1]);
        lookup[i][j] = summo;
        if (summo > max) {
          max = summo;
        }
      }
    }

    return max;
  }
}
