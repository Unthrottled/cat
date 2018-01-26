package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class MetroDCTest {
  private final MetroDC metroDC = new MetroDC();

  @Test
  public void metroCardOne() {
    assertArrayEquals(new int[]{31}, metroDC.metroCard(30));
  }

  @Test
  public void metroCardThree() {
    assertArrayEquals(new int[]{28, 30, 31}, metroDC.metroCard(31));
  }

  @Test
  public void metroCardTwo() {
    assertArrayEquals(new int[]{31}, metroDC.metroCard(28));
  }
}