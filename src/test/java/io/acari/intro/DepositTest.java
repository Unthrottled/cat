package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DepositTest {
    @Test
    public void depositProfit() throws Exception {
        assertEquals(3, new Deposit().depositProfit(100, 20, 170));
    }

}