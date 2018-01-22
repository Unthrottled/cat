package io.acari.intro;

public class DegreesOfDigits {

    /**
     * Let's define digit degree of some positive integer
     * as the number of times we need to replace this number
     * with the sum of its digits until we get to a one digit number.
     * <p>
     * Given an integer, find its digit degree.
     *
     * @param n
     * @return
     */
    int digitDegree(int n) {
        double v = Math.log10(n);
        if (Double.compare(1d, v) > 0) {
            return 0;
        }
        int degrees = 1;
        int runningCount = n;
        while ((int) Math.log10((runningCount = decompose(runningCount))) >= 1) {
            degrees++;
        }
        return degrees;
    }

    private int decompose(int n) {
        int runningSum = 0;
        while (n > 0) {
            runningSum += n % 10;
            n /= 10;
        }
        return runningSum;
    }
}
