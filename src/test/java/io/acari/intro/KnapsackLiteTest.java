package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class KnapsackLiteTest {
  private final KnapsackLite knapsackLite = new KnapsackLite();

  @Test
  public void knapsackLightOne() throws Exception {
    assertEquals(10, knapsackLite.knapsackLight(10, 5, 6, 4, 8));
  }

  @Test
  public void knapsackLightTwo() throws Exception {
    assertEquals(16, knapsackLite.knapsackLight(10, 5, 6, 4, 9));
  }

  @Test
  public void knapsackLightThree() throws Exception {
    assertEquals(7, knapsackLite.knapsackLight(5, 3, 7, 4, 6));
  }

  @Test
  public void knapsackLightFour() throws Exception {
    assertEquals(0, knapsackLite.knapsackLight(10, 2, 11, 3, 1));
  }

  @Test
  public void knapsackLightFive() throws Exception {
    assertEquals(15, knapsackLite.knapsackLight(15, 2, 20, 3, 2));
  }

}