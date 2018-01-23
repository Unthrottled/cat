package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class ShyRonnieTest {
  private final ShyRonnie shyRonnie = new ShyRonnie();
  @Test
  public void seatsInTheaterOne() {
    assertEquals(96, shyRonnie.seatsInTheater(16,11,5,3));
  }

  @Test
  public void seatsInTheaterTwo() {
    assertEquals(0, shyRonnie.seatsInTheater(1,1,1,1));
  }

  @Test
  public void seatsInTheaterThree() {
    assertEquals(18, shyRonnie.seatsInTheater(13,6,8,3));
  }
}