package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class OneOfUsTest {
  private final OneOfUs oneOfUs = new OneOfUs();

  @Test
  public void extraNumberOne() {
    assertEquals(7, oneOfUs.extraNumber(2,7,2));
  }

  @Test
  public void extraNumberTwo() {
    assertEquals(3, oneOfUs.extraNumber(3, 2, 2));
  }

  @Test
  public void extraNumberThree() {
    assertEquals(1, oneOfUs.extraNumber(5,5,1));
  }
}