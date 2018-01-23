package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveSumTest {
    private final MaxConsecutiveSum maxConsecutiveSum = new MaxConsecutiveSum();

    @Test
    public void arrayMaxConsecutiveSumOne() throws Exception {
        assertEquals(8,
                maxConsecutiveSum.arrayMaxConsecutiveSum(new int[]{2, 3, 5, 1, 6},
                        2));
    }

    @Test
    public void arrayMaxConsecutiveSumTwo() throws Exception {
        assertEquals(14,
                maxConsecutiveSum.arrayMaxConsecutiveSum(new int[]{2, 4, 10, 1},
                        2));
    }

    @Test
    public void arrayMaxConsecutiveSumThree() throws Exception {
        assertEquals(9,
                maxConsecutiveSum.arrayMaxConsecutiveSum(new int[]{1, 3, 2, 4},
                        3));
    }

    @Test
    public void arrayMaxConsecutiveSumFour() throws Exception {
        assertEquals(3,
                maxConsecutiveSum.arrayMaxConsecutiveSum(new int[]{3, 2, 1, 1},
                        1));
    }

}