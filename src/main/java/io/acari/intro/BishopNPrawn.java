package io.acari.intro;

import java.util.function.Supplier;

public class BishopNPrawn {

  /**
   * Given the positions of a
   * white bishop and a black pawn on the standard
   * chess board, determine whether the bishop can
   * capture the pawn in one move.
   *
   * @param bishop
   * @param pawn
   * @return
   */
  boolean bishopAndPawn(String bishop, String pawn) {
    return new Cell(bishop).diagonallyIntersects(new Cell(pawn));
  }

  class Cell {
    private final int row;
    private final int col;


    Cell(String cell) {
      cell = cell.toUpperCase();
      row = cell.charAt(0) - 64;
      col = cell.charAt(1) - 48;
    }

    boolean diagonallyIntersects(Cell cell) {
      if (row == cell.row)
        return false;
      int diff = Math.abs(cell.col - col);
      return cell.row == row + adjustmentValue(() -> row > cell.row, diff) &&
          cell.col == col + adjustmentValue(() -> col > cell.col, diff);
    }

    private int adjustmentValue(Supplier<Boolean> supplier, int diff) {
      return (supplier.get() ? -1 : 1) * diff;
    }
  }
}
