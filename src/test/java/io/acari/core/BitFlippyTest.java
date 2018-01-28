package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitFlippyTest {
    private final BitFlippy bitFlippy = new BitFlippy();

    @Test
    public void killKthBitOne() {
        assertEquals(33, bitFlippy.killKthBit(37, 3));
    }

    @Test
    public void killKthBitTwo() {
        assertEquals(37, bitFlippy.killKthBit(37, 4));
    }

    @Test
    public void killKthBitThree() {
        assertEquals(37, bitFlippy.killKthBit(37, 2));
    }
}