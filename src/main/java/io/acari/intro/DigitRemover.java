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
        int max = 0;
        for (int t = 1; t < n; t *= 10) {
            int i = n / 10;
            int i1 = i / t;
            int i2 = i1 * t;
            int i3 = n % t;
            int i4 = i2 + i3;
            max = Math.max(i4, max);
        }
        return max;
    }

}
