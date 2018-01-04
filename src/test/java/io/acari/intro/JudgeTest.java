package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class JudgeTest {
  private Judge judge = new Judge();

  @Test
  public void areSimilarOne() throws Exception {
    assertTrue(judge.areSimilar(new int[]{1,2,3},new int[]{1,2,3}));
  }

  @Test
  public void areSimilarTwo() throws Exception {
    assertTrue(judge.areSimilar(new int[]{1,2,3},new int[]{2,1,3}));
  }

  @Test
  public void areSimilarThree() throws Exception {
    assertFalse(judge.areSimilar(new int[]{1,2,2},new int[]{2,1,1}));
  }

  @Test
  public void areSimilarFour() throws Exception {
    assertFalse(judge.areSimilar(new int[]{1,1,4},new int[]{1,2,3}));
  }

  @Test
  public void areSimilarFive() throws Exception {
    assertFalse(judge.areSimilar(new int[]{1,2,3},new int[]{1,10,2}));
  }

  @Test
  public void areSimilarSix() throws Exception {
    assertTrue(judge.areSimilar(new int[]{2,3,1},new int[]{1,3,2}));
  }

  @Test
  public void areSimilarSeven() throws Exception {
    assertFalse(judge.areSimilar(new int[]{2,3,9},new int[]{10,3,2}));
  }

  @Test
  public void areSimilarEight() throws Exception {
    assertTrue(judge.areSimilar(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279},new int[]{832, 998, 148, 570, 533, 561, 455, 147, 894, 279}));
  }

  @Test
  public void areSimilarNine() throws Exception {
    assertTrue(judge.areSimilar(new int[]{1, 1, 2, 1, 2, 1, 2},new int[]{2, 1, 2, 1, 1, 1, 2}));
  }

}