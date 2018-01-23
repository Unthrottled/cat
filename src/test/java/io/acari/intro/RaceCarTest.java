package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class RaceCarTest {
    private final RaceCar raceCar = new RaceCar();

    @Test
    public void buildPalindromeOne() throws Exception {
        assertEquals("abcdcba", raceCar.buildPalindrome("abcdc"));
    }

    @Test
    public void buildPalindromeTwo() throws Exception {
        assertEquals("abababa", raceCar.buildPalindrome("ababab"));
    }

    @Test
    public void buildPalindromeTwo_Half() throws Exception {
        assertEquals("ababcbaba", raceCar.buildPalindrome("ababcbab"));
    }

    @Test
    public void buildPalindromeThree() throws Exception {
        assertEquals("abba", raceCar.buildPalindrome("abba"));
    }

    @Test
    public void buildPalindromeFour() throws Exception {
        assertEquals("abaaba", raceCar.buildPalindrome("abaa"));
    }

    @Test
    public void buildPalindromeFive() throws Exception {
        assertEquals("abacaba", raceCar.buildPalindrome("abaca"));
    }

    @Test
    public void buildPalindromeSix() throws Exception {
        assertEquals("abcacba", raceCar.buildPalindrome("abca"));
    }

    @Test
    public void buildPalindromeSeven() throws Exception {
        assertEquals("abcddcba", raceCar.buildPalindrome("abcdd"));
    }
}