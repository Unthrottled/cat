package io.acari.core;

public class BitFlippy {

  /**
   * More specifically, in the given number n
   * the kth bit from the right was initially
   * set to 0, but its current value might be
   * different. It's now up to you to write a
   * function that will change the kth bit of
   * n back to 0.
   *
   * @param n
   * @param k
   * @return
   */
  int killKthBit(int n, int k) {
    return n & ~(1 << --k);
  }

}
