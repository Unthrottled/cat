package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class DigitSummationTest {
  private final DigitSummation digitSummation = new DigitSummation();

  @Test
  public void addTwoDigitsOne() {
    assertEquals(11, digitSummation.addTwoDigits(29));
  }

  @Test
  public void addTwoDigitsTwo() {
    assertEquals(12, digitSummation.addTwoDigits(48));
  }

  @Test
  public void addTwoDigitsThree() {
    assertEquals(1, digitSummation.addTwoDigits(10));
  }
}