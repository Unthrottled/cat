package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class KingRoadEfficiencyTest {
    private final KingRoadEfficiency roadsForTheKing = new KingRoadEfficiency();

    @Test
    public void efficientRoadNetworkOne() throws Exception {
        assertTrue(
                roadsForTheKing.efficientRoadNetwork(6, new int[][]
                        {{3, 0},
                                {0, 4},
                                {5, 0},
                                {2, 1},
                                {1, 4},
                                {2, 3},
                                {5, 2}}
                )
        );
    }

    @Test
    public void efficientRoadNetworkTwo() throws Exception {
        assertFalse(
                roadsForTheKing.efficientRoadNetwork(6,
                        new int[][]
                                {{0, 4},
                                        {5, 0},
                                        {2, 1},
                                        {1, 4},
                                        {2, 3},
                                        {5, 2}}
                )
        );
    }

    @Test
    public void efficientRoadNetworkFour() throws Exception {
        assertFalse(
                roadsForTheKing.efficientRoadNetwork(12, new int[][]
                        {{8, 9},
                                {0, 11},
                                {5, 3},
                                {11, 6},
                                {5, 7},
                                {7, 6},
                                {6, 4},
                                {10, 8},
                                {11, 2},
                                {1, 9},
                                {7, 3},
                                {7, 8},
                                {11, 8},
                                {1, 11},
                                {4, 9},
                                {6, 2},
                                {4, 3},
                                {3, 2},
                                {0, 7},
                                {10, 4},
                                {10, 0}}
                )
        );
    }

    @Test
    public void efficientRoadNetworkThree() throws Exception {
        assertTrue(
                roadsForTheKing.efficientRoadNetwork(16, new int[][]
                        {{7, 12},
                                {3, 15},
                                {0, 7},
                                {14, 1},
                                {15, 6},
                                {8, 7},
                                {3, 4},
                                {1, 3},
                                {15, 2},
                                {2, 11},
                                {1, 8},
                                {12, 0},
                                {7, 4},
                                {9, 5},
                                {11, 10},
                                {7, 5},
                                {6, 11},
                                {5, 15},
                                {1, 12},
                                {4, 15},
                                {6, 4},
                                {11, 7},
                                {4, 8},
                                {10, 15},
                                {1, 7},
                                {3, 13},
                                {15, 7},
                                {13, 4},
                                {13, 6},
                                {12, 10},
                                {1, 13},
                                {6, 14},
                                {4, 0},
                                {11, 1},
                                {13, 15},
                                {10, 2},
                                {6, 9},
                                {0, 13},
                                {8, 6},
                                {14, 9},
                                {13, 5},
                                {14, 7},
                                {13, 9},
                                {6, 7},
                                {9, 10},
                                {8, 2},
                                {12, 8},
                                {9, 3},
                                {11, 15},
                                {12, 13},
                                {2, 0},
                                {9, 0},
                                {3, 8},
                                {15, 14},
                                {1, 9},
                                {1, 2},
                                {3, 12}}
                )
        );
    }
}