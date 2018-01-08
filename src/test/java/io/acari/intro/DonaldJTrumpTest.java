package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class DonaldJTrumpTest {
  private final DonaldJTrump donaldJTrump = new DonaldJTrump();

  @Test
  public void electionsWinnersOne() throws Exception {
    assertEquals(2,
        donaldJTrump.electionsWinners(new int[]{2, 3, 5, 2}, 2));
  }

  @Test
  public void electionsWinnersTwo() throws Exception {
    assertEquals(0,
        donaldJTrump.electionsWinners(new int[]{1, 3, 3, 1, 1}, 0));
  }

  @Test
  public void electionsWinnersThree() throws Exception {
    assertEquals(1,
        donaldJTrump.electionsWinners(new int[]{5, 1, 3, 4, 1}, 0));
  }

  @Test
  public void electionsWinnersFour() throws Exception {
    assertEquals(4,
        donaldJTrump.electionsWinners(new int[]{1,1,1,1}, 1));
  }

  @Test
  public void electionsWinnersFive() throws Exception {
    assertEquals(0,
        donaldJTrump.electionsWinners(new int[]{1,1,1,1}, 0));
  }

  @Test
  public void electionsWinnersSix() throws Exception {
    assertEquals(2,
        donaldJTrump.electionsWinners(new int[]{3, 1, 1, 3, 1}, 2));
  }

}