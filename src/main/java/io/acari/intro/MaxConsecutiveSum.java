package io.acari.intro;

public class MaxConsecutiveSum {

    /**
     * Given array of integers, find the maximal
     * possible sum of some of its k consecutive elements.
     *
     * @param inputArray
     * @param k
     * @return
     */
    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int max = Integer.MIN_VALUE;
        int runningSum = 0;
        for (int i = 1; i <= inputArray.length; i++) {
            int currentIndex = i - 1;
            int currentValue = inputArray[currentIndex];
            runningSum += currentValue;
            if (i >= k) {
                max = runningSum > max ? runningSum : max;
                runningSum -= inputArray[currentIndex - k + 1];
            }
        }
        return max;
    }
}
