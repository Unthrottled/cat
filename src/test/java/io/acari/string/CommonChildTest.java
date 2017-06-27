package io.acari.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class CommonChildTest {
    private final CommonChild steve = new CommonChild();
    @Test
    public void maxChildShouldReturnCorrectLength() throws Exception {
        assertEquals(3, steve.maxChild("abcd", "abdc"));
    }

    @Test
    public void maxChildShouldReturnCorrectLengthTwo() throws Exception {
        assertEquals(2, steve.maxChild("HARRY", "SALLY"));
    }

    @Test
    public void maxChildShouldReturnCorrectLengthB() throws Exception {
        assertEquals(4, steve.maxChild("snthcrqjvo", "aoeucrkvo"));
    }

}