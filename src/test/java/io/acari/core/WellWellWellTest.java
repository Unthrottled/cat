package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class WellWellWellTest {
  private final WellWellWell wellWellWell = new WellWellWell();

  @Test
  public void magicalWellOne() {
    assertEquals(8, wellWellWell.magicalWell(1, 2, 2));
  }

  @Test
  public void magicalWellTwo() {
    assertEquals(1, wellWellWell.magicalWell(1, 1, 1));
  }

  @Test
  public void magicalWellThree() {
    assertEquals(128, wellWellWell.magicalWell(6, 5, 3));
  }
}