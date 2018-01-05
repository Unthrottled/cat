package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class ChessBoardColorTest {
  private ChessBoardColor chessBoardColor = new ChessBoardColor();

  @Test
  public void chessBoardCellColorOne() throws Exception {
    assertTrue(chessBoardColor.chessBoardCellColor("A1","C3"));
  }

  @Test
  public void chessBoardCellColorTwo() throws Exception {
    assertFalse(chessBoardColor.chessBoardCellColor("A1","H3"));
  }

  @Test
  public void chessBoardCellColorThree() throws Exception {
    assertFalse(chessBoardColor.chessBoardCellColor("A1","A2"));
  }

  @Test
  public void chessBoardCellColorFour() throws Exception {
    assertTrue(chessBoardColor.chessBoardCellColor("A1","B2"));
  }

  @Test
  public void chessBoardCellColorFive() throws Exception {
    assertFalse(chessBoardColor.chessBoardCellColor("B3","H8"));
  }

  @Test
  public void chessBoardCellColorSix() throws Exception {
    assertFalse(chessBoardColor.chessBoardCellColor("C3","B5"));
  }

}