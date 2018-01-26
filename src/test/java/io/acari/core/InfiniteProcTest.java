package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class InfiniteProcTest {
  private final InfiniteProc infiniteProc = new InfiniteProc();

  @Test
  public void isInfiniteProcessOne() {
    assertFalse(infiniteProc.isInfiniteProcess(2,6));
  }

  @Test
  public void isInfiniteProcessTwo() {
    assertTrue(infiniteProc.isInfiniteProcess(2,3));
  }

  @Test
  public void isInfiniteProcessThree() {
    assertFalse(infiniteProc.isInfiniteProcess(2,10));
  }

  @Test
  public void isInfiniteProcessFour() {
    assertTrue(infiniteProc.isInfiniteProcess(0,1));
  }
}