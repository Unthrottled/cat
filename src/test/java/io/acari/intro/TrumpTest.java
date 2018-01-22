package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class TrumpTest {
    private Trump trump = new Trump();

    @Test
    public void addBorderOne() throws Exception {
        assertArrayEquals(new String[]{"*****",
                        "*abc*",
                        "*ded*",
                        "*****"},
                trump.addBorder(new String[]{"abc",
                        "ded"}));
    }

    @Test
    public void addBorderTwo() throws Exception {
        assertArrayEquals(new String[]{"***",
                        "*a*",
                        "***"},
                trump.addBorder(new String[]{"a"}));
    }

}