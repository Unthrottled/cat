package io.acari.core;

public class MirroredBits {

  /**
   * Reverse the order of the bits in a given integer.
   *
   * @param a
   * @return
   */
  int mirrorBits(int a) {
    int mirror = 0;
    while (a > 0) {
      mirror <<= 1;
      mirror |= a & 1;
      a >>= 1;
    }

    return mirror;
  }

}
