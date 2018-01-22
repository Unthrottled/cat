package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class WheelieTest {
    private final Wheelie wheelie = new Wheelie();

    @Test
    public void isWheelOne() {
        assertTrue(wheelie.isWheel(new boolean[][]
                {{false, true, true, true, true},
                        {true, false, true, false, true},
                        {true, true, false, true, false},
                        {true, false, true, false, true},
                        {true, true, false, true, false}}
        ));
    }

    @Test
    public void isWheelTwo() {
        assertTrue(wheelie.isWheel(new boolean[][]
                {{false, true, true, true},
                        {true, false, true, true},
                        {true, true, false, true},
                        {true, true, true, false}}
        ));
    }

    @Test
    public void isWheelThree() {
        assertFalse(wheelie.isWheel(new boolean[][]
                {{false, true, true, true, true},
                        {true, false, true, true, true},
                        {true, true, false, true, true},
                        {true, true, true, false, true},
                        {true, true, true, true, false}}
        ));
    }

    @Test
    public void isWheelFour() {
        assertFalse(wheelie.isWheel(new boolean[][]
                {{false, true, true, true, true, true},
                        {true, false, true, false, false, true},
                        {true, true, false, true, false, false},
                        {true, false, true, false, true, false},
                        {true, false, false, true, true, false},
                        {true, true, false, false, false, true}}
        ));
    }

    @Test
    public void isWheelEight() {
        assertFalse(wheelie.isWheel(new boolean[][]
                {{false, true, true, true, true, true, true},
                        {true, false, true, false, false, false, true},
                        {true, true, false, true, false, false, false},
                        {true, false, true, false, true, false, false},
                        {true, false, false, true, false, true, false},
                        {true, false, false, false, true, false, true},
                        {true, true, false, false, false, true, true}}
        ));
    }
}