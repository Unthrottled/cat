package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class TimeValidationTest {
    private final TimeValidation timeValidation = new TimeValidation();

    @Test
    public void validTimeOne() throws Exception {
        assertTrue(timeValidation.validTime("13:58"));
    }

    @Test
    public void validTimeTwo() throws Exception {
        assertFalse(timeValidation.validTime("25:52"));
    }

    @Test
    public void validTimeThree() throws Exception {
        assertFalse(timeValidation.validTime("02:76"));
    }

    @Test
    public void validTimeFour() throws Exception {
        assertFalse(timeValidation.validTime("24:00"));
    }

}