package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class TheKingIsBrokeTest {
    private final TheKingIsBroke theKingIsBroke = new TheKingIsBroke();

    @Test
    public void financialCrisisOne() throws Exception {
        assertArrayEquals(new boolean[][][]{{{false, true, false}, {true, false, true}, {false, true, false}},
                        {{false, true, false}, {true, false, true}, {false, true, false}},
                        {{false, true, false}, {true, false, false}, {false, false, false}},
                        {{false, true, true}, {true, false, true}, {true, true, false}}},
                theKingIsBroke.financialCrisis(new boolean[][]
                        {{false, true, true, false},
                                {true, false, true, false},
                                {true, true, false, true},
                                {false, false, true, false}}
                )
        );
    }

    @Test
    public void financialCrisisEight() throws Exception {
        assertArrayEquals(new boolean[][][]{{{false, true, false, true, false}, {true, false, true, true, true}, {false, true, false, false, false}, {true, true, false, false, true}, {false, true, false, true, false}},
                        {{false, false, false, true, false}, {false, false, true, true, true}, {false, true, false, false, false}, {true, true, false, false, true}, {false, true, false, true, false}},
                        {{false, false, false, true, false}, {false, false, false, true, false}, {false, false, false, false, false}, {true, true, false, false, true}, {false, false, false, true, false}},
                        {{false, false, false, true, false}, {false, false, true, true, false}, {false, true, false, true, true}, {true, true, true, false, true}, {false, false, true, true, false}},
                        {{false, false, false, false, false}, {false, false, true, false, false}, {false, true, false, true, true}, {false, false, true, false, false}, {false, false, true, false, false}},
                        {{false, false, false, false, true}, {false, false, true, false, true}, {false, true, false, true, true}, {false, false, true, false, false}, {true, true, true, false, false}}},
                theKingIsBroke.financialCrisis(new boolean[][]
                        {{false, false, false, false, true, false},
                                {false, false, true, false, true, false},
                                {false, true, false, true, true, true},
                                {false, false, true, false, false, false},
                                {true, true, true, false, false, true},
                                {false, false, true, false, true, false}}
                )
        );
    }

}