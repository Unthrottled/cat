package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class MaryIsInLoveTest {
  private final MaryIsInLove maryIsInLove = new MaryIsInLove();

  @Test
  public void willYouOne() {
    assertFalse(maryIsInLove.willYou(true, true, true));
  }

  @Test
  public void willYouTwo() {
    assertTrue(maryIsInLove.willYou(true, false, true));
  }

  @Test
  public void willYouThree() {
    assertFalse(maryIsInLove.willYou(false, false, false));
  }

  @Test
  public void willYouFour() {
    assertTrue(maryIsInLove.willYou(false, false, true));
  }
}