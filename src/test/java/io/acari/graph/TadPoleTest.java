package io.acari.graph;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
@Ignore
public class TadPoleTest {
    private final TadPole tadPole = new TadPole();

    @Test
    public void isTadpoleOne() {
        assertTrue(tadPole.isTadpole(new boolean[][]
                {{false, true, true, false, false},
                        {true, false, false, true, false},
                        {true, false, false, true, false},
                        {false, true, true, false, true},
                        {false, false, false, true, false}}
        ));
    }

    @Test
    public void isTadpoleTwo() {
        assertTrue(tadPole.isTadpole(new boolean[][]
                {{false, true, false, false},
                        {true, false, true, true},
                        {false, true, false, true},
                        {false, true, true, false}}
        ));
    }

    @Test
    public void isTadpoleThree() {
        assertFalse(tadPole.isTadpole(new boolean[][]
                {{false, true, true, false, false},
                        {true, false, false, true, false},
                        {true, false, false, true, false},
                        {false, true, true, false, true},
                        {false, false, false, true, true}}
        ));
    }

    @Test
    public void isTadpoleFour() {
        assertFalse(tadPole.isTadpole(new boolean[][]
                {{false, false, true, false, false, false},
                        {false, false, true, false, true, false},
                        {true, true, false, false, false, true},
                        {false, false, false, false, true, true},
                        {false, true, false, true, false, false},
                        {false, false, true, true, false, false}}
        ));
    }
}