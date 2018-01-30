package io.acari.core;

public class WellWellWell {

  /**
   * You are standing at a magical well. It has two positive integers
   * written on it: a and b. Each time you cast a magic marble into
   * the well, it gives you a * b dollars and then both a and b
   * increase by 1. You have n magic marbles. How much money will you make?
   *
   * @param a
   * @param b
   * @param n
   * @return
   */
  int magicalWell(int a, int b, int n) {
    int dollaDollaYall = 0;
    for (int i = 0; i < n; i++) {
      dollaDollaYall += a++ * b++;
    }
    return dollaDollaYall;
  }
}
