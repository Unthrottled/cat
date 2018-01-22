package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class CommonCharacterCounterTest {
    CommonCharacterCounter commonCharacterCounter = new CommonCharacterCounter();

    @Test
    public void commonCharacterCountOne() throws Exception {
        assertEquals(3, commonCharacterCounter.commonCharacterCount("aabcc", "adcaa"));
    }

    @Test
    public void commonCharacterCountTwo() throws Exception {
        assertEquals(4, commonCharacterCounter.commonCharacterCount("zzzz", "zzzzzz"));
    }

    @Test
    public void commonCharacterCountThree() throws Exception {
        assertEquals(3, commonCharacterCounter.commonCharacterCount("abca", "xfzbac"));
    }

    @Test
    public void commonCharacterCountFour() throws Exception {
        assertEquals(0, commonCharacterCounter.commonCharacterCount("a", "b"));
    }

    @Test
    public void commonCharacterCountFive() throws Exception {
        assertEquals(1, commonCharacterCounter.commonCharacterCount("a", "aaa"));
    }

}