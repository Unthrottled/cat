package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DigitProductTest {
  private final DigitProduct digitProduct = new DigitProduct();

  @Test
  public void digitsProductOne() throws Exception {
    assertEquals(26,
        digitProduct.digitsProduct(12));
  }

  @Test
  public void digitsProductTwo() throws Exception {
    assertEquals(-1,
        digitProduct.digitsProduct(19));
  }

  @Test
  public void digitsProductThree() throws Exception {
    assertEquals(2559,
        digitProduct.digitsProduct(450));
  }

  @Test
  public void digitsProductFour() throws Exception {
    assertEquals(10,
        digitProduct.digitsProduct(0));
  }

  @Test
  public void digitsProductFive() throws Exception {
    assertEquals(-1,
        digitProduct.digitsProduct(13));
  }

  @Test
  public void digitsProductSix() throws Exception {
    assertEquals(1,
        digitProduct.digitsProduct(1));
  }

  @Test
  public void digitsProductSeven() throws Exception {
    assertEquals(589,
        digitProduct.digitsProduct(360));
  }

}