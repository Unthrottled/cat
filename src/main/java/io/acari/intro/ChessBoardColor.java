package io.acari.intro;

public class ChessBoardColor {

  /**
   * Given two cells on the standard chess board, determine whether they have the same color or not.
   *
   * @param cell1
   * @param cell2
   * @return
   */
  boolean chessBoardCellColor(String cell1, String cell2) {
    return new Cell(cell1).equals(new Cell(cell2));
  }

  static class Cell {
    private Color color;

    public Cell(String cell) {
      int row = cell.charAt(0) - 64;
      boolean evenRow = row % 2 == 0;
      int col = cell.charAt(1) - 48;
      boolean evenCol = col % 2 == 0;
      color = (evenRow && !evenCol) || (!evenRow && evenCol) ? Color.RED : Color.BLACK;
    }

    public boolean equals(Cell cell) {
      return color.equals(cell.color);
    }

    public enum Color {
      RED, BLACK
    }

  }
}
