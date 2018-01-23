package io.acari.prac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DoYouKnowDaSumsTest {
    private final DoYouKnowDaSums doYouKnowDaSums = new DoYouKnowDaSums();

    @Test
    public void possibleSumsOne() {
        assertEquals(9, doYouKnowDaSums.possibleSums(new int[]
                        {10, 50, 100}
                , new int[]
                        {1, 2, 1}
        ));
    }

    @Test
    public void possibleSumsTwo() {
        assertEquals(122, doYouKnowDaSums.possibleSums(new int[]
                        {10, 50, 100, 500}
                , new int[]
                        {5, 3, 2, 2}
        ));
    }

    @Test
    public void possibleSumsThree() {
        assertEquals(5, doYouKnowDaSums.possibleSums(new int[]
                        {1}
                , new int[]
                        {5}
        ));
    }
}