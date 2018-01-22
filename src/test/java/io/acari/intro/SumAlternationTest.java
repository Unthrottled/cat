package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class SumAlternationTest {
    private SumAlternation sumAlternation = new SumAlternation();

    @Test
    public void alternatingSumsOne() throws Exception {
        assertArrayEquals(new int[]{180, 105}, sumAlternation.alternatingSums(new int[]{50, 60, 60, 45, 70}));
    }

    @Test
    public void alternatingSumsTwo() throws Exception {
        assertArrayEquals(new int[]{100, 50}, sumAlternation.alternatingSums(new int[]{100, 50}));
    }

    @Test
    public void alternatingSumsThree() throws Exception {
        assertArrayEquals(new int[]{80, 0}, sumAlternation.alternatingSums(new int[]{80}));
    }

}