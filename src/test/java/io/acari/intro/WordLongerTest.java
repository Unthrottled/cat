package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class WordLongerTest {
  private final WordLonger wordLonger = new WordLonger();

  @Test
  public void longestWordOne() throws Exception {
    assertEquals("steady", wordLonger.longestWord("Ready, steady, go!"));
  }

  @Test
  public void longestWordTwo() throws Exception {
    assertEquals("steady", wordLonger.longestWord("Ready[[[, steady, go!"));
  }

  @Test
  public void longestWordThree() throws Exception {
    assertEquals("ABCd", wordLonger.longestWord("ABCd"));
  }

}