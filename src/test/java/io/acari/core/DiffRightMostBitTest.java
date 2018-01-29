package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class DiffRightMostBitTest {
  private final DiffRightMostBit diffRightMostBit = new DiffRightMostBit();

  @Test
  public void differentRightmostBitOne() {
    assertEquals(2, diffRightMostBit.differentRightmostBit(11, 13));
  }

  @Test
  public void differentRightmostBitTwo() {
    assertEquals(16, diffRightMostBit.differentRightmostBit(7,23));
  }

  @Test
  public void differentRightmostBitThree() {
    assertEquals(1, diffRightMostBit.differentRightmostBit(0,1));
  }

  @Test
  public void differentRightmostBitFour() {
    assertEquals(1, diffRightMostBit.differentRightmostBit(65, 64));
  }
}