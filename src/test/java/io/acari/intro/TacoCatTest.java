package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class TacoCatTest {
  private TacoCat tacoCat = new TacoCat();

  @Test
  public void palindromeRearrangingOne() throws Exception {
    assertTrue(tacoCat.palindromeRearranging("aabb"));
  }

  @Test
  public void palindromeRearrangingTwo() throws Exception {
    assertFalse(tacoCat.palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
  }

  @Test
  public void palindromeRearrangingThree() throws Exception {
    assertTrue(tacoCat.palindromeRearranging("zyyzzzzz"));
  }

  @Test
  public void palindromeRearrangingFour() throws Exception {
    assertTrue(tacoCat.palindromeRearranging("z"));
  }

  @Test
  public void palindromeRearrangingFive() throws Exception {
    assertTrue(tacoCat.palindromeRearranging("zaa"));
  }

  @Test
  public void palindromeRearrangingSix() throws Exception {
    assertTrue(tacoCat.palindromeRearranging("tacocat"));
  }

  @Test
  public void palindromeRearrangingSeven() throws Exception {
    assertTrue(tacoCat.palindromeRearranging("racecar"));
  }

}