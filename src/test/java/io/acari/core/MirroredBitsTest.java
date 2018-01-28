package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class MirroredBitsTest {
  private final MirroredBits mirroredBits = new MirroredBits();

  @Test
  public void mirrorBitsOne() {
    assertEquals(67, mirroredBits.mirrorBits(97));
  }

  @Test
  public void mirrorBitsTwo() {
    assertEquals(1, mirroredBits.mirrorBits(8));
  }
}