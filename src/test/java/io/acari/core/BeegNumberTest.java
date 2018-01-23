package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class BeegNumberTest {
  private final BeegNumber beegNumber = new BeegNumber();

  @Test
  public void largestNumberOne() {
    assertEquals(99, beegNumber.largestNumber(2));
  }

  @Test
  public void largestNumberThree() {
    assertEquals(999999, beegNumber.largestNumber(6));
  }

  @Test
  public void largestNumberTwo() {
    assertEquals(9, beegNumber.largestNumber(1));
  }
}