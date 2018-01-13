package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class ImGoingToNeedASweeperTest {

  private ImGoingToNeedASweeper sweeper = new ImGoingToNeedASweeper();

  @Test
  public void minesweeperOne() throws Exception {
    assertArrayEquals(new int[][]{{1, 2, 1},
        {2, 1, 1},
        {1, 1, 1}}, sweeper.minesweeper(new boolean[][]{{true, false, false},
        {false, true, false},
        {false, false, false}}));
  }

  @Test
  public void minesweeperTwo() throws Exception {
    assertArrayEquals(new int[][]{{0, 0, 0},
        {0, 0, 0}}, sweeper.minesweeper(new boolean[][]{{false, false, false},
        {false, false, false}}));
  }

  @Test
  public void minesweeperThree() throws Exception {
    assertArrayEquals(new int[][]{{0, 2, 2, 1},
        {3, 4, 3, 3},
        {1, 2, 3, 1}}, sweeper.minesweeper(new boolean[][]{{true, false, false, true},
        {false, false, true, false},
        {true, true, false, true}}));
  }

}