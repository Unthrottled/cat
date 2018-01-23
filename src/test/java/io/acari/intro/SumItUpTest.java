package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class SumItUpTest {
    private final SumItUp sumItUp = new SumItUp();

    @Test
    public void sumUpNumbersOne() throws Exception {
        assertEquals(14,
                sumItUp.sumUpNumbers
                        ("2 apples, 12 oranges"));
    }

    @Test
    public void sumUpNumbersTwo() throws Exception {
        assertEquals(123450,
                sumItUp.sumUpNumbers
                        ("123450"));
    }

    @Test
    public void sumUpNumbersThree() throws Exception {
        assertEquals(0,
                sumItUp.sumUpNumbers
                        ("Your payment method is invalid"));
    }

    @Test
    public void sumUpNumbersFour() throws Exception {
        assertEquals(10,
                sumItUp.sumUpNumbers
                        ("1$$2 a,3;s 4"));
    }

}