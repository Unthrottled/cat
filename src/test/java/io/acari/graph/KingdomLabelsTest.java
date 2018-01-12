package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class KingdomLabelsTest {
  private final KingdomLabels kingdomLabels = new KingdomLabels();

  @Test
  public void namingRoadsOne() throws Exception {
    assertTrue(kingdomLabels.namingRoads(new int[][]
        {{0, 1, 0},
            {4, 1, 2},
            {4, 3, 4},
            {2, 3, 1},
            {2, 0, 3}}
    ));
  }

  @Test
  public void namingRoadsTwo() throws Exception {
    assertFalse(kingdomLabels.namingRoads(new int[][]
        {{2, 3, 1},
            {3, 0, 0},
            {2, 0, 2}}
    ));
  }

  @Test
  public void namingRoadsThree() throws Exception {
    assertFalse(kingdomLabels.namingRoads(new int[][]
        {{1, 3, 1},
            {3, 0, 0}}
    ));
  }

  @Test
  public void namingRoadsFour() throws Exception {
    assertTrue(kingdomLabels.namingRoads(new int[][]
        {{1, 4, 2},
            {6, 3, 3},
            {2, 3, 1},
            {0, 1, 0}}
    ));
  }

}