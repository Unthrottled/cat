package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class AlmostIncreasingSequenceTest {
  AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
  @Test
  public void almostIncreasingSequence() throws Exception {
    assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1,3,2,1}));
  }

}