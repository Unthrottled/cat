package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class IPv4ValidatorTest {
  private IPv4Validator iPv4Validator = new IPv4Validator();

  @Test
  public void isIPv4AddressOne() throws Exception {
    assertTrue(iPv4Validator.isIPv4Address("172.16.254.1"));
  }

  @Test
  public void isIPv4AddressTwo() throws Exception {
    assertFalse(iPv4Validator.isIPv4Address("172.316.254.1"));
  }

  @Test
  public void isIPv4AddressThree() throws Exception {
    assertFalse(iPv4Validator.isIPv4Address(".254.255.0"));
  }

  @Test
  public void isIPv4AddressFour() throws Exception {
    assertFalse(iPv4Validator.isIPv4Address("1.1.1.1a"));
  }

  @Test
  public void isIPv4AddressFive() throws Exception {
    assertTrue(iPv4Validator.isIPv4Address("0.254.255.0"));
  }

  @Test
  public void isIPv4AddressSix() throws Exception {
    assertFalse(iPv4Validator.isIPv4Address("1.23.256.."));
  }
}