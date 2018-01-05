package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class AdjacentListsTest {
  private AdjacentLists adjacentLists = new AdjacentLists();

  @Test
  public void arrayMaximalAdjacentDifferenceOne() throws Exception {
    assertEquals(3, adjacentLists.arrayMaximalAdjacentDifference(new int[]{2, 4, 1, 0}));
  }

  @Test
  public void arrayMaximalAdjacentDifferenceTwo() throws Exception {
    assertEquals(0, adjacentLists.arrayMaximalAdjacentDifference(new int[]{1,1,1,1}));
  }

  @Test
  public void arrayMaximalAdjacentDifferenceThree() throws Exception {
    assertEquals(7, adjacentLists.arrayMaximalAdjacentDifference(new int[]{-1, 4, 10, 3, -2}));
  }

}