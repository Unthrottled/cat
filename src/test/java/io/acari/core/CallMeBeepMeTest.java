package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class CallMeBeepMeTest {
  private final CallMeBeepMe kimPossible = new CallMeBeepMe();

  @Test
  public void phoneCallOne() {
    assertEquals(14, kimPossible.phoneCall(3,1,2,20));
  }

  @Test
  public void phoneCallTwo() {
    assertEquals(1, kimPossible.phoneCall(2,2,1,1));
  }

  @Test
  public void phoneCallThree() {
    assertEquals(11, kimPossible.phoneCall(10,1,2,22));
  }
}