package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class DegreesOfDigitsTest {
  private final DegreesOfDigits degreesOfDigits = new DegreesOfDigits();

  @Test
  public void digitDegreeOne() throws Exception {
    assertEquals(0, degreesOfDigits.digitDegree(5));
  }

  @Test
  public void digitDegreeTwo() throws Exception {
    assertEquals(1, degreesOfDigits.digitDegree(100));
  }

  @Test
  public void digitDegreeThree() throws Exception {
    assertEquals(2, degreesOfDigits.digitDegree(91));
  }

  @Test
  public void digitDegreeFour() throws Exception {
    assertEquals(2, degreesOfDigits.digitDegree(99));
  }

}