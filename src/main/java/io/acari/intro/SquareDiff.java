package io.acari.intro;

import java.util.HashSet;
import java.util.Set;

public class SquareDiff {

  /**
   * Given a rectangular matrix containing
   * only digits, calculate the number of
   * different 2 × 2 squares in it.
   *
   * @param matrix
   * @return
   */
  int differentSquares(int[][] matrix) {
    Set<String> sequences = new HashSet<>();
    for (int i = 1; i < matrix.length; i++) {
      int i1 = matrix[i].length - 1;
      for (int j = 0; j < i1; j++) {
        sequences.add("" + matrix[i - 1][j] +
            matrix[i - 1][j + 1] +
            matrix[i][j] +
            matrix[i][j + 1]
        );
      }

    }
    return sequences.size();
  }

}
