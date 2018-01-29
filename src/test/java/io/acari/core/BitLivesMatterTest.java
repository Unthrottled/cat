package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class BitLivesMatterTest {
  private final BitLivesMatter bitLivesMatter = new BitLivesMatter();

  @Test
  public void equalPairOfBitsOne() {
    assertEquals(2, bitLivesMatter.equalPairOfBits(10, 11));
  }

  @Test
  public void equalPairOfBitsTwo() {
    assertEquals(1, bitLivesMatter.equalPairOfBits(0,0));
  }

  @Test
  public void equalPairOfBitsThree() {
    assertEquals(8, bitLivesMatter.equalPairOfBits(28,27));
  }

  @Test
  public void equalPairOfBitsFour() {
    assertEquals(32, bitLivesMatter.equalPairOfBits(895,928));
  }
}