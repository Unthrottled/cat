package io.acari.intro;

public class ImGoingToNeedASweeper {

  /**
   * In the popular Minesweeper game you have a board with some mines and
   * those cells that don't contain a mine have a number in it that indicates the
   * total number of mines in the neighboring cells.
   * <p>
   * Starting off with some arrangement of mines we want to create a Minesweeper game setup.
   *
   * @param matrix
   * @return
   */
  int[][] minesweeper(boolean[][] matrix) {
    int col = matrix[0].length;
    int row = matrix.length;
    int[][] sweeper = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sweeper[i][j] = countMines(matrix, i, j);
      }
    }

    return sweeper;
  }

  private int countMines(boolean[][] matrix, int row, int col) {
    int left = col - 1;
    int right = col + 1;
    int top = row - 1;
    int bottom = row + 1;
    boolean topInBounds = top > -1;
    boolean leftInBounds = left > -1;
    boolean bottomInBounds = bottom < matrix.length;
    boolean rightInBounds = right < matrix[0].length;
    int topLeft = leftInBounds && topInBounds ? matrix[top][left] ? 1 : 0 : 0;
    int above = topInBounds ? matrix[top][col] ? 1 : 0 : 0;
    int topRight = rightInBounds && topInBounds ? matrix[top][right] ? 1 : 0 : 0;
    int bottomLeft = leftInBounds && bottomInBounds ? matrix[bottom][left] ? 1 : 0 : 0;
    int below = bottomInBounds ? matrix[bottom][col] ? 1 : 0 : 0;
    int bottomRight = rightInBounds && bottomInBounds ? matrix[bottom][right] ? 1 : 0 : 0;
    int toTheRight = rightInBounds ? matrix[row][right] ? 1 : 0 : 0;
    int toTheLeft = leftInBounds ? matrix[row][left] ? 1 : 0 : 0;
    return topLeft +
        above +
        topRight +
        bottomLeft +
        below +
        bottomRight +
        toTheRight +
        toTheLeft;
  }
}
