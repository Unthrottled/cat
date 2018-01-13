package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DigitFirstTest {
  @Test
  public void firstDigit() throws Exception {
    assertEquals('1', new DigitFirst().firstDigit("var_1__Int"));
  }

}