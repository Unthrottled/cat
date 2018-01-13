package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class ArrayChangeTest {
  private ArrayChange arrayChange = new ArrayChange();

  @Test
  public void arrayChangeOne() throws Exception {
    assertEquals(3, arrayChange.arrayChange(new int[]{1, 1, 1}));
  }

  @Test
  public void arrayChangeTwo() throws Exception {
    assertEquals(5, arrayChange.arrayChange(new int[]{-1000, 0, -2, 0}));
  }

  @Test
  public void arrayChangeTwoHalf() throws Exception {
    assertEquals(2, arrayChange.arrayChange(new int[]{-1000, -1001, -2, 0}));
  }

  @Test
  public void arrayChangeThree() throws Exception {
    assertEquals(13, arrayChange.arrayChange(new int[]{2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15}));
  }

  @Test
  public void arrayChangeFour() throws Exception {
    assertEquals(12, arrayChange.arrayChange(new int[]{2, 1, 10, 1}));
  }

}