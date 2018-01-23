package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class StringBoutiqueTest {
    private final StringBoutique stringBoutique = new StringBoutique();

    @Test
    public void isBeautifulStringOne() throws Exception {
        assertTrue(stringBoutique.isBeautifulString("bbbaacdafe"));
    }

    @Test
    public void isBeautifulStringTwo() throws Exception {
        assertFalse(stringBoutique.isBeautifulString("aabbb"));
    }

    @Test
    public void isBeautifulStringThree() throws Exception {
        assertFalse(stringBoutique.isBeautifulString("bbc"));
    }

    @Test
    public void isBeautifulStringFour() throws Exception {
        assertFalse(stringBoutique.isBeautifulString("bbbaa"));
    }

    @Test
    public void isBeautifulStringFive() throws Exception {
        assertFalse(stringBoutique.isBeautifulString("abcdefghijklmnopqrstuvwxyzz"));
    }

}