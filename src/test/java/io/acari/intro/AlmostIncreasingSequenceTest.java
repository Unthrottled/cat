package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class AlmostIncreasingSequenceTest {
  AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
  @Test
  public void almostIncreasingSequenceOne() throws Exception {
    assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1,3,2,1}));
  }
  @Test
  public void almostIncreasingSequenceTwo() throws Exception {
    assertTrue(almostIncreasingSequence.almostIncreasingSequence(new int[]{1,3,2}));
  }
  @Test
  public void almostIncreasingSequenceThree() throws Exception {
    assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1,4,10,4,2}));
  }
  @Test
  public void almostIncreasingSequenceFour() throws Exception {
    assertTrue(almostIncreasingSequence.almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5}));
  }
  @Test
  public void almostIncreasingSequenceFive() throws Exception {
    assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 1, 1, 2, 3}));
  }
  @Test
  public void almostIncreasingSequenceSix() throws Exception {
    assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1,2,1,2}));
  }

}