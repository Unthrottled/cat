package io.acari.intro;

public class DigitRemover {

  /**
   * Given some integer, find the maximal number
   * you can obtain by deleting exactly one digit
   * of the given number.
   *
   * @param n
   * @return
   */
  int deleteDigit(int n) {
    int max = decompose(n);
    String s = String.valueOf(n);
    return Integer.parseInt(s.substring(0, max) + s.substring(max +1));
  }

  private int decompose(int n) {
    int previous = -1;
    int current;
    int returnValue = -1;
    int ceil = (int) Math.ceil(Math.log10(n));
    int index = ceil;
    while (n > 0){
      index--;
      current = n % 10;
      if (previous != -1 && current < previous){
        returnValue = index;
      }
      previous = current;
      n/=10;
    }
    return returnValue == -1 ? ceil : returnValue;
  }

}
