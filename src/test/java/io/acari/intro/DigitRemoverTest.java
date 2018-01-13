package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DigitRemoverTest {
  private final DigitRemover digitRemover = new DigitRemover();

  @Test
  public void deleteDigitOne() throws Exception {
    assertEquals(52, digitRemover.deleteDigit(152));
  }

  @Test
  public void deleteDigitTwo() throws Exception {
    assertEquals(101, digitRemover.deleteDigit(1001));
  }

  @Test
  public void deleteDigitThree() throws Exception {
    assertEquals(1, digitRemover.deleteDigit(10));
  }

  @Test
  public void deleteDigitFour() throws Exception {
    assertEquals(22229, digitRemover.deleteDigit(222219));
  }

  @Test
  public void deleteDigitFive() throws Exception {
    assertEquals(111110, digitRemover.deleteDigit(1110110));
  }

  @Test
  public void deleteDigitSix() throws Exception {
    assertEquals(2202, digitRemover.deleteDigit(21202));
  }

}