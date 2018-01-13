package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class SpookyGhostsTest {
  SpookyGhosts spookyGhosts = new SpookyGhosts();

  @Test
  public void matrixElementsSumOne() throws Exception {
    assertEquals(9, spookyGhosts.matrixElementsSum(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}));
  }

  @Test
  public void matrixElementsSumTwo() throws Exception {
    assertEquals(9, spookyGhosts.matrixElementsSum(new int[][]{{1, 1, 1, 0},
        {0, 5, 0, 1},
        {2, 1, 3, 10}}));
  }

  @Test
  public void matrixElementsSumThree() throws Exception {
    assertEquals(18, spookyGhosts.matrixElementsSum(new int[][]{{1, 1, 1},
        {2, 2, 2},
        {3, 3, 3}}));
  }

  @Test
  public void matrixElementsSumFour() throws Exception {
    assertEquals(0, spookyGhosts.matrixElementsSum(new int[][]{{0}}));
  }

}