package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class AllLongestStringsTest {
  AllLongestStrings allLongestStrings = new AllLongestStrings();

  @Test
  public void allLongestStringsOne() throws Exception {
    assertArrayEquals(new String[]{"aba",
        "vcd",
        "aba"}, allLongestStrings.allLongestStrings(new String[]{"aba",
        "aa",
        "ad",
        "vcd",
        "aba"}
    ));
  }

  @Test
  public void allLongestStringsThree() throws Exception {
    assertArrayEquals(new String[]{"aba"}, allLongestStrings.allLongestStrings(new String[]{
        "aba"}
    ));
  }

  @Test
  public void allLongestStringsTwo() throws Exception {
    assertArrayEquals(new String[]{
        "zzzzzz",
        "abcdef",
        "aaaaaa"}, allLongestStrings.allLongestStrings(new String[]{"a",
        "abc",
        "cbd",
        "zzzzzz",
        "a",
        "abcdef",
        "asasa",
        "aaaaaa"}
    ));
  }

}