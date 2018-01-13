package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
  public void longestWordFour() throws Exception {
    assertEquals("AA", wordLonger.longestWord("A!! AA[]z"));
  }

  @Test
  public void longestWordThree() throws Exception {
    assertEquals("ABCd", wordLonger.longestWord("ABCd"));
  }

}