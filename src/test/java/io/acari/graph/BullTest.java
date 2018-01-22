package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BullTest {
    private final Bull bull = new Bull();

    @Test
    public void isBull() {
        assertTrue(bull.isBull(new boolean[][]
                {{false, true, false, false, false},
                        {true, false, true, true, false},
                        {false, true, false, true, false},
                        {false, true, true, false, true},
                        {false, false, false, true, false}}
        ));
    }

    @Test
    public void isBullTwo() {
        assertTrue(bull.isBull(new boolean[][]
                {{false, true, true, true, false},
                        {true, false, true, false, false},
                        {true, true, false, false, false},
                        {true, false, false, false, true},
                        {false, false, false, true, false}}
        ));
    }

    @Test
    public void isBullThree() {
        assertFalse(bull.isBull(new boolean[][]
                {{false, true, true, false, false},
                        {true, false, true, true, true},
                        {true, true, false, false, false},
                        {false, true, false, false, true},
                        {false, true, false, true, false}}
        ));
    }

    @Test
    public void isBullFour() {
        assertFalse(bull.isBull(new boolean[][]
                {{false, true, true, false, false},
                        {true, true, false, true, false},
                        {true, false, false, false, false},
                        {false, true, false, false, true},
                        {false, false, false, true, false}}
        ));
    }

    @Test
    public void isBullFive() {
        assertTrue(bull.isBull(new boolean[][]
                {{false, false, true, false, false},
                        {false, false, true, false, false},
                        {true, true, false, true, true},
                        {false, false, true, false, true},
                        {false, false, true, true, false}}
        ));
    }
}