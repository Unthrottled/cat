package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class SpiralsTest {
    private final Spirals spirals = new Spirals();

    @Test
    public void spiralNumbersOne() throws Exception {
        assertArrayEquals(new int[][]{{1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}}, spirals.spiralNumbers(3));
    }


    @Test
    public void spiralNumbersTwo() throws Exception {
        assertArrayEquals(new int[][]{{1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}}, spirals.spiralNumbers(5));
    }

}