package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DifferentSymbolsTest {
  @Test
  public void differentSymbolsNaive() throws Exception {
    assertEquals(3, new DifferentSymbols().differentSymbolsNaive("cabca"));
  }

}