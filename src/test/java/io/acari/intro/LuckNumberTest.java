package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class LuckNumberTest {
  private LuckNumber luckNumber = new LuckNumber();

  @Test
  public void isLuckyOne() throws Exception {
    assertTrue(luckNumber.isLucky(1230));
  }

  @Test
  public void isLuckyTwo() throws Exception {
    assertFalse(luckNumber.isLucky(239017));
  }

  @Test
  public void isLuckyThree() throws Exception {
    assertTrue(luckNumber.isLucky(134008));
  }

  @Test
  public void isLuckyFour() throws Exception {
    assertFalse(luckNumber.isLucky(10));
  }

  @Test
  public void isLuckyFive() throws Exception {
    assertTrue(luckNumber.isLucky(11));
  }

  @Test
  public void isLuckySix() throws Exception {
    assertTrue(luckNumber.isLucky(1010));
  }

}