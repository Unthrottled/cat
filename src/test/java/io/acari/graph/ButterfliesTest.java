package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class ButterfliesTest {
  private final Butterflies butterflies = new Butterflies();

  @Test
  public void isButterflyOne() {
    assertTrue(butterflies.isButterfly(new boolean[][]
        {{false, true, true, false, false},
            {true, false, true, false, false},
            {true, true, false, true, true},
            {false, false, true, false, true},
            {false, false, true, true, false}}
    ));
  }

  @Test
  public void isButterflyTwo() {
    assertTrue(butterflies.isButterfly(new boolean[][]
        {{false, true, true, true, true},
            {true, false, true, false, false},
            {true, true, false, false, false},
            {true, false, false, false, true},
            {true, false, false, true, false}}
    ));
  }

  @Test
  public void isButterflyThree() {
    assertFalse(butterflies.isButterfly(new boolean[][]
        {{false, false, false, false, false},
            {false, false, true, true, false},
            {false, true, false, false, true},
            {false, true, false, false, true},
            {false, false, true, true, false}}
    ));
  }

  @Test
  public void isButterflyFour() {
    assertFalse(butterflies.isButterfly(new boolean[][]
        {{false, true, true, true, true},
            {true, false, true, true, true},
            {true, true, false, true, true},
            {true, true, true, false, true},
            {true, true, true, true, false}}

    ));
  }
}