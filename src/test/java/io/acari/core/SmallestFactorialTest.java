package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class SmallestFactorialTest {
  private final SmallestFactorial smallestFactorial = new SmallestFactorial();

  @Test
  public void leastFactorialOne() {
    assertEquals(24, smallestFactorial.leastFactorial(17));
  }

  @Test
  public void leastFactorialTwo() {
    assertEquals(1, smallestFactorial.leastFactorial(1));
  }

  @Test
  public void leastFactorialThree() {
    assertEquals(6, smallestFactorial.leastFactorial(5));
  }
}