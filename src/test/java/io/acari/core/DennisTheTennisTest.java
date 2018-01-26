package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class DennisTheTennisTest {
  private final DennisTheTennis dennisTheTennis = new DennisTheTennis();

  @Test
  public void tennisSetOne() {
    assertTrue(dennisTheTennis.tennisSet(3,6));
  }

  @Test
  public void tennisSetTwo() {
    assertFalse(dennisTheTennis.tennisSet(8, 5));
  }

  @Test
  public void tennisSetThree() {
    assertFalse(dennisTheTennis.tennisSet(6, 5));
  }

  @Test
  public void tennisSetFour() {
    assertFalse(dennisTheTennis.tennisSet(7,7));
  }

  @Test
  public void tennisSetFive() {
    assertTrue(dennisTheTennis.tennisSet(6,4));
  }
}