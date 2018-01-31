package io.acari.core;

public class CallMeBeepMe {

  /**
   * Some phone usage rate may be described as follows:
   * <p>
   * first minute of a call costs min1 cents,
   * <p>
   * each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
   * <p>
   * each minute after 10th costs min11 cents.
   * <p>
   * You have s cents on your account before the call. What is the duration
   * of the longest call (in minutes rounded down to
   * the nearest integer) you can have?
   *
   * @param min1
   * @param min2_10
   * @param min11
   * @param s
   * @return
   */
  int phoneCall(int min1, int min2_10, int min11, int s) {
    int firstMinute = 0;
    int secondMinute = 0;
    int thirdMinute = 0;
    if (s >= min1) {
      firstMinute = 1;
      s -= min1;
    }

    if (firstMinute > 0) {
      int availableMinutes = s / min2_10;
      int maxSecondTier = 9;
      if (availableMinutes > maxSecondTier) {
        secondMinute = maxSecondTier;
        s -= (min2_10 * maxSecondTier);
        thirdMinute = s / min11;
      } else {
        secondMinute = availableMinutes;
      }
    }

    return firstMinute + secondMinute + thirdMinute;
  }

}
