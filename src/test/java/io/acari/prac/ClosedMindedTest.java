package io.acari.prac;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class ClosedMindedTest {
    private final ClosedMinded closedMinded = new ClosedMinded();

    @Test
    public void containsCloseNumsOne() {
        assertTrue(
                closedMinded.containsCloseNums(new int[]
                                {0, 1, 2, 3, 5, 2}
                        , 3)
        );
    }

    @Test
    public void containsCloseNumsTwo() {
        assertFalse(
                closedMinded.containsCloseNums(new int[]
                                {0, 1, 2, 3, 5, 2}
                        , 2)
        );
    }

    @Test
    public void containsCloseNumsThree() {
        assertFalse(
                closedMinded.containsCloseNums(new int[]
                                {}
                        , 0)
        );
    }
}