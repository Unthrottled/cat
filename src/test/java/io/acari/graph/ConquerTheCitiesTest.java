package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class ConquerTheCitiesTest {
  private final ConquerTheCities conquerTheCities = new ConquerTheCities();

  @Test
  public void citiesConqueringOne() throws Exception {
    assertArrayEquals(new int[]
            {1, 2, 1, 1, -1, -1, -1, 2, 1, 1}
        ,
        conquerTheCities.citiesConquering(10,
            new int[][]{{1, 0},
                {1, 2},
                {8, 5},
                {9, 7},
                {5, 6},
                {5, 4},
                {4, 6},
                {6, 7}}
        )
    );
  }

  @Test
  public void citiesConqueringThree() throws Exception {
    assertArrayEquals(new int[]
            {-1, -1, -1, -1, -1, -1}
        ,
        conquerTheCities.citiesConquering(6, new int[][]
            {{0, 1},
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 0}}
        )
    );
  }

  @Test
  public void citiesConqueringFour() throws Exception {
    assertArrayEquals(new int[]
            {1, 2, 3, 4, 4, 3, 2, 1}
        ,
        conquerTheCities.citiesConquering(8, new int[][]
            {{0, 1},
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6},
                {6, 7}}
        )
    );
  }

}