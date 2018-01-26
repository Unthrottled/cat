package io.acari.core;

public class InfiniteProc {

  /**
   * Given integers a and b, determine whether the following pseudocode results in an infinite loop
   * <p>
   * while a is not equal to b do
   * increase a by 1
   * decrease b by 1
   * <p>
   * Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.
   *
   * @param a
   * @param b
   * @return
   */
  boolean isInfiniteProcess(int a, int b) {
    return a > b ||  (b - a) % 2 == 1;
  }
}
