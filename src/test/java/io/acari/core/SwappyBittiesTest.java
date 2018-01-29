package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class SwappyBittiesTest {
  private final SwappyBitties swappyBitties = new SwappyBitties();

  @Test
  public void swapAdjacentBitsOne() {
    assertEquals(14, swappyBitties.swapAdjacentBits(13));
  }

  @Test
  public void swapAdjacentBitsTwo() {
    assertEquals(133, swappyBitties.swapAdjacentBits(74));
  }

  @Test
  public void swapAdjacentBitsThree() {
    assertEquals(1073741823, swappyBitties.swapAdjacentBits(1073741823));
  }

  @Test
  public void swapAdjacentBitsFour() {
    assertEquals(0, swappyBitties.swapAdjacentBits(0));
  }
}