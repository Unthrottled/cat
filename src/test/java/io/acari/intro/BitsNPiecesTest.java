package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class BitsNPiecesTest {
  private final BitsNPieces bitsNPieces = new BitsNPieces();

  @Test
  public void messageFromBinaryCodeOne() throws Exception {
    assertEquals("Hello!",
        bitsNPieces.messageFromBinaryCode("010010000110010101101100011011000110111100100001"));
  }

  @Test
  public void messageFromBinaryCodeTwo() throws Exception {
    assertEquals("May the Force be with you",
        bitsNPieces.messageFromBinaryCode("01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101"));
  }

}