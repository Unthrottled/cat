package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class BishopNPrawnTest {
  private final BishopNPrawn bishopNPrawn = new BishopNPrawn();

  @Test
  public void bishopAndPawnOne() throws Exception {
    assertTrue(bishopNPrawn.bishopAndPawn("a1", "c3"));
  }

  @Test
  public void bishopAndPawnTwo() throws Exception {
    assertFalse(bishopNPrawn.bishopAndPawn("h1", "h3"));
  }

  @Test
  public void bishopAndPawnThree() throws Exception {
    assertTrue(bishopNPrawn.bishopAndPawn("a5", "c3"));
  }

  @Test
  public void bishopAndPawnFour() throws Exception {
    assertFalse(bishopNPrawn.bishopAndPawn("g1", "f3"));
  }

  @Test
  public void bishopAndPawnFive() throws Exception {
    assertTrue(bishopNPrawn.bishopAndPawn("e7", "d6"));
  }

  @Test
  public void bishopAndPawnSix() throws Exception {
    assertTrue(bishopNPrawn.bishopAndPawn("e7", "a3"));
  }

}