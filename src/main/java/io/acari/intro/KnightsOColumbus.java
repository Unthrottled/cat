package io.acari.intro;

public class KnightsOColumbus {


  /**
   * Given a position of a knight on the standard chessboard,
   * find the number of different moves the knight can perform.
   * <p>
   * The knight can move to a square that is two squares
   * horizontally and one square vertically, or two squares vertically
   * and one square horizontally away from it.
   * <p>
   * The complete move
   * therefore looks like the letter L.
   * Check out the image below to see all
   * valid moves for a knight piece that
   * is placed on one of the central squares.
   * <p>
   * <img src="https://codefightsuserpics.s3.amazonaws.com/tasks/chessKnight/img/knight.jpg?_tm=1486560102464" alt="">
   *
   * @param cell
   * @return
   */
  int chessKnight(String cell) {
    Cell c = new Cell(cell);
    return findValidInRange(c);
  }

  private int findValidInRange(Cell c) {
    int sum = 0;
    int n = 0;
    for (int x = -2; x <= 2; x++) {
      for (int y = -2; y <= 2; y++) {
        if (x != 0 && y != 0 && Math.abs(x) != Math.abs(y) &&
            new Cell(c.row + x, c.col + y).isValid())
          sum++;
      }
    }
    return sum;
  }

  private class Cell {
    private final int row;
    private final int col;

    Cell(String cell) {
      cell = cell.toUpperCase();
      row = cell.charAt(0) - 65;
      col = cell.charAt(1) - 49;
    }

    Cell(int row, int col) {
      this.row = row;
      this.col = col;
    }

    boolean isValid() {
      return row > -1 && row < 8 &&
          col > -1 && col < 8;
    }
  }

}
