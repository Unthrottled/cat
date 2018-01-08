package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class LongestPrefixTest {
  private final LongestPrefix longestPrefix = new LongestPrefix();

  @Test
  public void longestDigitsPrefixOne() throws Exception {
    assertEquals("123", longestPrefix.longestDigitsPrefix("123aa1" ));
  }

  @Test
  public void longestDigitsPrefixTwo() throws Exception {
    assertEquals("0123456789", longestPrefix.longestDigitsPrefix("0123456789" ));
  }

  @Test
  public void longestDigitsPrefixThree() throws Exception {
    assertEquals("", longestPrefix.longestDigitsPrefix("  3) always check for whitespaces" ));
  }

  @Test
  public void longestDigitsPrefixFour() throws Exception {
    assertEquals("12", longestPrefix.longestDigitsPrefix("12abc34" ));
  }

  @Test
  public void longestDigitsPrefixFive() throws Exception {
    assertEquals("", longestPrefix.longestDigitsPrefix("the output is 42" ));
  }

  @Test
  public void longestDigitsPrefixSix() throws Exception {
    assertEquals("", longestPrefix.longestDigitsPrefix("" ));
  }
}