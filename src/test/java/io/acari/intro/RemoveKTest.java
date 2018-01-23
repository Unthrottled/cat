package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class RemoveKTest {
    private RemoveK removeK = new RemoveK();


    @Test
    public void extractEachKthOne() throws Exception {
        assertArrayEquals(
                new int[]{1, 2, 4, 5, 7, 8, 10},
                removeK.extractEachKth(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3)
        );
    }

    @Test
    public void extractEachKthTwo() throws Exception {
        assertArrayEquals(
                new int[]{},
                removeK.extractEachKth(new int[]{1, 1, 1, 1, 1}, 1)
        );
    }

    @Test
    public void extractEachKthThree() throws Exception {
        assertArrayEquals(
                new int[]{1, 1, 1, 1},
                removeK.extractEachKth(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 2)
        );
    }

}