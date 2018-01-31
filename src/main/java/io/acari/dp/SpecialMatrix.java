package io.acari.dp;

public class SpecialMatrix {

  public long find(Long[][] matrix) {
    int rowHeight = matrix.length - 1;
    if (rowHeight > -1) {
      int columnHeight = matrix[rowHeight].length - 1;
      matrix[rowHeight][columnHeight] = 1L;
      for (int i = rowHeight; i > -1; i--) {
        for (int j = columnHeight; j > -1; j--) {
          matrix[i][j] = matrix[i][j] == null ? 0L : matrix[i][j];
          if (matrix[i][j] != -1) {
            long right = j + 1 > columnHeight ? 0L : matrix[i][j + 1];
            long bottom = i + 1 > rowHeight ? 0L : matrix[i + 1][j];
            matrix[i][j] = (matrix[i][j] + getAnInt(right) + getAnInt(bottom)) % 1000000007L;
          }
        }
      }

      return matrix[0][0] == null ? 0L : matrix[0][0];
    }

    return 0L;
  }

  private long getAnInt(Long aLong) {
    return aLong < 0 ? 0 : aLong;
  }
}
