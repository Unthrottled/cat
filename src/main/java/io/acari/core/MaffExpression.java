package io.acari.core;

public class MaffExpression {

  /**
   * Consider an arithmetic expression of the form a#b=c.
   * Check whether it is possible to replace # with one of
   * the four signs: +, -, * or / to obtain a correct expression.
   *
   * @param a
   * @param b
   * @param c
   * @return
   */
  boolean arithmeticExpression(int a, int b, int c) {
    return a + b == c || a - b == c || a * b == c || Double.compare(a / (double) b, c) == 0;
  }

}
