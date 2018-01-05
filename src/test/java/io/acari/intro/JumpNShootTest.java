package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class JumpNShootTest {
  private JumpNShoot jumpNShoot = new JumpNShoot();

  @Test
  public void avoidObstaclesOne() throws Exception {
    assertEquals(4, jumpNShoot.avoidObstacles(new int[]{5, 3, 6, 7, 9}));
  }

  @Test
  public void avoidObstaclesTwo() throws Exception {
    assertEquals(4, jumpNShoot.avoidObstacles(new int[]{2,3}));
  }

  @Test
  public void avoidObstaclesThree() throws Exception {
    assertEquals(7, jumpNShoot.avoidObstacles(new int[]{1, 4, 10, 6, 2}));
  }

}