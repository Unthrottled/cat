package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class MultiMaxTest {
  private final MultiMax multiMax = new MultiMax();

  @Test
  public void maxMultipleOne() {
    assertEquals(9, multiMax.maxMultiple(3, 10));
  }

  @Test
  public void maxMultipleTwo() {
    assertEquals(50, multiMax.maxMultiple(10, 50));
  }
}