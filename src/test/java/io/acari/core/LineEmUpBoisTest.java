package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class LineEmUpBoisTest {
  private final LineEmUpBois lineEmUpBois = new LineEmUpBois();

  @Test
  public void lineUpOne() {
    assertEquals(3, lineEmUpBois.lineUp("LLARL"));
  }

  @Test
  public void lineUpTwo() {
    assertEquals(1, lineEmUpBois.lineUp("RLR"));
  }

  @Test
  public void lineUpThree() {
    assertEquals(0, lineEmUpBois.lineUp(""));
  }

  @Test
  public void lineUpFour() {
    assertEquals(0, lineEmUpBois.lineUp("L"));
  }
}