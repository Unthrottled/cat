package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class MaffExpressionTest {
  private final MaffExpression maffExpression = new MaffExpression();

  @Test
  public void arithmeticExpressionOne() {
    assertTrue(maffExpression.arithmeticExpression(2,3,5));
  }

  @Test
  public void arithmeticExpressionTwo() {
    assertTrue(maffExpression.arithmeticExpression(8,2,4));
  }

  @Test
  public void arithmeticExpressionThree() {
    assertFalse(maffExpression.arithmeticExpression(8,3,2));
  }

  @Test
  public void arithmeticExpressionFour() {
    assertTrue(maffExpression.arithmeticExpression(6,3,3));
  }
}