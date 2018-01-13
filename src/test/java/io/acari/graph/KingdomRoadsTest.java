package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class KingdomRoadsTest {
  private final KingdomRoads kingdomRoads = new KingdomRoads();

  @Test
  public void newRoadSystemOne() throws Exception {
    assertTrue(kingdomRoads.newRoadSystem(new boolean[][]
        {{false, true, false, false},
            {false, false, true, false},
            {true, false, false, true},
            {false, false, true, false}}
    ));
  }

  @Test
  public void newRoadSystemTwo() throws Exception {
    assertTrue(kingdomRoads.newRoadSystem(new boolean[][]
        {{false, true, false, false, false, false, false},
            {true, false, false, false, false, false, false},
            {false, false, false, true, false, false, false},
            {false, false, true, false, false, false, false},
            {false, false, false, false, false, false, true},
            {false, false, false, false, true, false, false},
            {false, false, false, false, false, true, false}}
    ));
  }

  @Test
  public void newRoadSystemThree() throws Exception {
    assertFalse(kingdomRoads.newRoadSystem(new boolean[][]
        {{false, true, false},
            {false, false, false},
            {true, false, false}}
    ));
  }

}