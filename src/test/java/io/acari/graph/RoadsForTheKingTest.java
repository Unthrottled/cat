package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class RoadsForTheKingTest {
  private final RoadsForTheKing roadsForTheKing = new RoadsForTheKing();

  @Test
  public void roadsBuildingOne() throws Exception {
    assertArrayEquals(new int[][]
            {{0, 3},
                {1, 3},
                {2, 3}},
        roadsForTheKing.roadsBuilding(4, new int[][]
            {{0, 1},
                {1, 2},
                {2, 0}}
        )
    );
  }

  @Test
  public void roadsBuildingTwo() throws Exception {
    assertArrayEquals(new int[][]{}
        ,
        roadsForTheKing.roadsBuilding(1,
            new int[][]{}
        )
    );
  }

  @Test
  public void roadsBuildingFour() throws Exception {
    assertArrayEquals(new int[][]
            {{0, 7},
                {0, 8},
                {0, 9},
                {0, 11},
                {1, 5},
                {1, 6},
                {1, 10},
                {1, 12},
                {2, 5},
                {2, 7},
                {2, 8},
                {2, 9},
                {2, 15},
                {2, 16},
                {3, 8},
                {3, 9},
                {3, 12},
                {3, 13},
                {3, 15},
                {4, 5},
                {4, 7},
                {4, 10},
                {4, 12},
                {4, 13},
                {4, 16},
                {5, 10},
                {5, 14},
                {5, 16},
                {6, 7},
                {7, 13},
                {8, 9},
                {9, 12},
                {10, 11},
                {10, 15},
                {11, 15},
                {12, 15},
                {13, 14}}
        ,
        roadsForTheKing.roadsBuilding(17, new int[][]
            {{5, 12},
                {3, 5},
                {10, 9},
                {3, 10},
                {6, 14},
                {6, 13},
                {7, 1},
                {14, 8},
                {9, 6},
                {14, 4},
                {6, 12},
                {3, 11},
                {11, 4},
                {0, 6},
                {13, 16},
                {12, 8},
                {7, 8},
                {16, 14},
                {0, 1},
                {14, 12},
                {11, 7},
                {4, 1},
                {13, 11},
                {14, 2},
                {9, 7},
                {0, 3},
                {3, 16},
                {8, 5},
                {4, 2},
                {1, 2},
                {11, 5},
                {14, 9},
                {6, 2},
                {10, 0},
                {16, 10},
                {15, 4},
                {15, 5},
                {6, 16},
                {1, 13},
                {15, 6},
                {12, 0},
                {1, 8},
                {16, 1},
                {16, 8},
                {5, 6},
                {3, 2},
                {0, 5},
                {10, 12},
                {15, 14},
                {8, 11},
                {13, 15},
                {7, 16},
                {16, 9},
                {15, 16},
                {10, 6},
                {8, 10},
                {7, 5},
                {8, 15},
                {11, 1},
                {6, 3},
                {0, 13},
                {11, 12},
                {2, 13},
                {13, 5},
                {14, 1},
                {9, 4},
                {11, 16},
                {11, 2},
                {5, 9},
                {1, 9},
                {12, 2},
                {6, 11},
                {2, 10},
                {0, 2},
                {10, 14},
                {3, 4},
                {4, 6},
                {13, 9},
                {15, 9},
                {7, 12},
                {11, 14},
                {0, 14},
                {3, 14},
                {16, 0},
                {14, 7},
                {12, 13},
                {6, 8},
                {10, 13},
                {1, 3},
                {8, 13},
                {4, 8},
                {3, 7},
                {4, 0},
                {10, 7},
                {1, 15},
                {12, 16},
                {0, 15},
                {15, 7},
                {11, 9}}
        )
    );
  }

  @Test
  public void roadsBuildingThree() throws Exception {
    assertArrayEquals(new int[][]
        {{1, 2},
            {1, 3},
            {1, 5},
            {1, 8},
            {2, 5},
            {3, 5},
            {3, 8}}
        ,
        roadsForTheKing.roadsBuilding(9,new int[][]
            {{5, 8},
                {6, 0},
                {0, 5},
                {4, 1},
                {0, 1},
                {7, 0},
                {6, 8},
                {7, 3},
                {2, 6},
                {0, 2},
                {0, 3},
                {8, 7},
                {5, 4},
                {8, 4},
                {8, 2},
                {7, 1},
                {4, 6},
                {5, 6},
                {4, 2},
                {4, 7},
                {2, 7},
                {3, 6},
                {8, 0},
                {1, 6},
                {3, 2},
                {3, 4},
                {4, 0},
                {6, 7},
                {5, 7}}
        )
    );
  }

}