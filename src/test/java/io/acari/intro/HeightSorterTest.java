package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class HeightSorterTest {
  private HeightSorter heightSorter = new HeightSorter();

  @Test
  public void sortByHeightOne() throws Exception {
    assertArrayEquals(new int[]{-1, 150, 160, 170, -1, -1, 180, 190}, heightSorter.sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
  }

  @Test
  public void sortByHeightTwo() throws Exception {
    assertArrayEquals(new int[]{-1, 150, 160, 170, -1, -1, 180, 190}, heightSorter.sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
  }

  @Test
  public void sortByHeightThree() throws Exception {
    assertArrayEquals(new int[]{2, 2, 4, 9, 11, 16}, heightSorter.sortByHeight(new int[]{4, 2, 9, 11, 2, 16}));
  }

}