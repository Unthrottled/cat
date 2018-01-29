package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class CountSumulaTest {
  private final CountSumula countSumula = new CountSumula();

  @Test
  public void countSumOfTwoRepresentations2One() {
    assertEquals(2, countSumula.countSumOfTwoRepresentations2(6, 2, 4));
  }

  @Test
  public void countSumOfTwoRepresentations2Two() {
    assertEquals(1, countSumula.countSumOfTwoRepresentations2(6, 3, 3));
  }

  @Test
  public void countSumOfTwoRepresentations2Three() {
    assertEquals(0, countSumula.countSumOfTwoRepresentations2(10, 9, 11));
  }

  @Test
  public void countSumOfTwoRepresentations2Four() {
    assertEquals(5, countSumula.countSumOfTwoRepresentations2(24, 8, 16));
  }
}