package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class AbsoluteMinTest {
  private AbsoluteMin absoluteMin = new AbsoluteMin();

  @Test
  public void absoluteValuesSumMinimization() throws Exception {
    assertEquals(4, absoluteMin.absoluteValuesSumMinimization(new int[]{2, 4, 7}));
  }

  @Test
  public void absoluteValuesSumMinimizationTwo() throws Exception {
    assertEquals(1, absoluteMin.absoluteValuesSumMinimization(new int[]{1, 1, 3, 4}));
  }

  @Test
  public void absoluteValuesSumMinimizationThree() throws Exception {
    assertEquals(23, absoluteMin.absoluteValuesSumMinimization(new int[]{23}));
  }

  @Test
  public void absoluteValuesSumMinimizationFour() throws Exception {
    assertEquals(23, absoluteMin.absoluteValuesSumMinimization(new int[]{23}));
  }

  @Test
  public void absoluteValuesSumMinimizationFive() throws Exception {
    assertEquals(15, absoluteMin.absoluteValuesSumMinimization(new int[]{-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
  }

  @Test
  public void absoluteValuesSumMinimizationSix() throws Exception {
    assertEquals(-4, absoluteMin.absoluteValuesSumMinimization(new int[]{-4, -1}));
  }

  @Test
  public void absoluteValuesSumMinimizationSeven() throws Exception {
    assertEquals(0, absoluteMin.absoluteValuesSumMinimization(new int[]{-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000}));
  }

}