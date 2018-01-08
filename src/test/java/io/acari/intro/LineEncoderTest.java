package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class LineEncoderTest {
  private final LineEncoder lineEncoder = new LineEncoder();

  @Test
  public void lineEncodingOne() throws Exception {
    assertEquals("2a3bc", lineEncoder.lineEncoding("aabbbc"));
  }

  @Test
  public void lineEncodingTwo() throws Exception {
    assertEquals("2a3bc", lineEncoder.lineEncoding("aabbbc"));
  }

  @Test
  public void lineEncodingThree() throws Exception {
    assertEquals("a2bca2b", lineEncoder.lineEncoding("abbcabb"));
  }

  @Test
  public void lineEncodingFour() throws Exception {
    assertEquals("abcd", lineEncoder.lineEncoding("abcd"));
  }

}