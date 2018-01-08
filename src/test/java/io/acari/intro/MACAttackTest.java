package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class MACAttackTest {
  private final MACAttack macAttack = new MACAttack();

  @Test
  public void isMAC48AddressOne() throws Exception {
    assertTrue(macAttack.isMAC48Address("00-1B-63-84-45-E6"));
  }

  @Test
  public void isMAC48AddressTwo() throws Exception {
    assertFalse(macAttack.isMAC48Address("Z1-1B-63-84-45-E6"));
  }

  @Test
  public void isMAC48AddressThree() throws Exception {
    assertFalse(macAttack.isMAC48Address("not a MAC-48 address"));
  }

  @Test
  public void isMAC48AddressFour() throws Exception {
    assertFalse(macAttack.isMAC48Address("FF-FF-FF-FF-FF-FF"));
  }

  @Test
  public void isMAC48AddressFive() throws Exception {
    assertTrue(macAttack.isMAC48Address("00-00-00-00-00-00"));
  }

  @Test
  public void isMAC48AddressSix() throws Exception {
    assertTrue(macAttack.isMAC48Address("G0-00-00-00-00-00"));
  }

}