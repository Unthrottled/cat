package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class SquareDiffTest {
    private final SquareDiff squareDiff = new SquareDiff();

    @Test
    public void differentSquares() throws Exception {
        assertEquals(1, squareDiff.differentSquares(
                new int[][]{{9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9}}
        ));
    }

    @Test
    public void differentSquaresTwo() throws Exception {
        assertEquals(6, squareDiff.differentSquares(
                new int[][]{{1, 2, 1},
                        {2, 2, 2},
                        {2, 2, 2},
                        {1, 2, 3},
                        {2, 2, 1}}));
    }

}