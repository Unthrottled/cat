package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class StronkTest {
  private Stronk stronk = new Stronk();

  @Test
  public void areEquallyStrongOne() throws Exception {
    assertTrue(stronk.areEquallyStrong(10, 15, 15, 10));
  }

  @Test
  public void areEquallyStrongTwo() throws Exception {
    assertTrue(stronk.areEquallyStrong(10, 15, 10, 15));
  }

  @Test
  public void areEquallyStrongThree() throws Exception {
    assertFalse(stronk.areEquallyStrong(10, 15, 15, 9));
  }

  @Test
  public void areEquallyStrongFour() throws Exception {
    assertTrue(stronk.areEquallyStrong(15, 10, 15, 10));
  }

  @Test
  public void areEquallyStrongFive() throws Exception {
    assertFalse(stronk.areEquallyStrong(10, 15, 5, 20));
  }

  @Test
  public void areEquallyStrongSix() throws Exception {
    assertTrue(stronk.areEquallyStrong(10, 20, 10, 20));
  }

}