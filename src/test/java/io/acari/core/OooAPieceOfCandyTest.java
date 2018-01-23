package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class OooAPieceOfCandyTest {

  private final OooAPieceOfCandy jamesWoods = new OooAPieceOfCandy();

  @Test
  public void candies() {
    assertEquals(9, jamesWoods.candies(3,10));
  }
}