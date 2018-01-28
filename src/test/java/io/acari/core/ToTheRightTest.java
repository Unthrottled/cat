package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class ToTheRightTest {
  private final ToTheRight toTheRight = new ToTheRight();

  @Test
  public void secondRightmostZeroBitOne() {
    assertEquals(8, toTheRight.secondRightmostZeroBit(37));
  }

  @Test
  public void secondRightmostZeroBitTwo() {
    assertEquals(2, toTheRight.secondRightmostZeroBit(1073741824));
  }

  @Test
  public void secondRightmostZeroBitThree() {
    assertEquals(2, toTheRight.secondRightmostZeroBit(83748));
  }
}