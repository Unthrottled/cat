package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class KnightsOColumbusTest {
  private final KnightsOColumbus knightsOColumbus = new KnightsOColumbus();

  @Test
  public void chessKnightOne() throws Exception {
    assertEquals(2, knightsOColumbus.chessKnight("a1"));
  }

  @Test
  public void chessKnightTwo() throws Exception {
    assertEquals(6, knightsOColumbus.chessKnight("c2"));
  }

  @Test
  public void chessKnightThree() throws Exception {
    assertEquals(8, knightsOColumbus.chessKnight("d4"));
  }

  @Test
  public void chessKnightFour() throws Exception {
    assertEquals(6, knightsOColumbus.chessKnight("g6"));
  }

}