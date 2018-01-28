package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class FreeRangeTest {
  private final FreeRange freeRange = new FreeRange();

  @Test
  public void rangeBitCountOne() {
    assertEquals(11, freeRange.rangeBitCount(2, 7));
  }

  @Test
  public void rangeBitCountTwo() {
    assertEquals(1, freeRange.rangeBitCount(0, 1));
  }

  @Test
  public void rangeBitCountThree() {
    assertEquals(17, freeRange.rangeBitCount(1, 10));
  }

  @Test
  public void rangeBitCountFour() {
    assertEquals(3, freeRange.rangeBitCount(8, 9));
  }
}