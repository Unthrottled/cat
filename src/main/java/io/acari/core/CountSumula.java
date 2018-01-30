package io.acari.core;

public class CountSumula {

  /**
   * Given integers n, l and r,
   * find the number of ways to represent n as
   * a sum of two integers A and B such that l ≤ A ≤ B ≤ r.
   *
   * @param n
   * @param l
   * @param r
   * @return
   */
  int countSumOfTwoRepresentations2(int n, int l, int r) {
    int midPoint = n/2;
    if(l <= midPoint && r >= midPoint){
      int lHalf = midPoint - l;
      int rHalf = r - midPoint;
      boolean isOdd = n % 2 == 1;
      return Math.min(lHalf, rHalf) + (isOdd ? 0 : 1);
    } else {
      return 0;
    }
  }

}
