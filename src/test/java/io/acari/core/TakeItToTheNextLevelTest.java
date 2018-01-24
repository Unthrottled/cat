package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class TakeItToTheNextLevelTest {
  private final TakeItToTheNextLevel thisHandshake = new TakeItToTheNextLevel();


  @Test
  public void reachNextLevelOne() {
    assertTrue(thisHandshake.reachNextLevel(10,15,5));
  }

  @Test
  public void reachNextLevelTwo() {
    assertFalse(thisHandshake.reachNextLevel(10,15,4));
  }

  @Test
  public void reachNextLevelThree() {
    assertTrue(thisHandshake.reachNextLevel(3,6,4));
  }
}