package io.acari.intro;

public class LuckNumber {

    /**
     * Ticket numbers usually consist of an even number of digits.
     * A ticket number is considered lucky if the sum of the first half
     * of the digits is equal to the sum of the second half.
     *
     * @param n
     * @return
     */
    boolean isLucky(int n) {
        int log10 = (int) Math.ceil(Math.log10(n));
        if (log10 % 2 != 0) {
            //there are no halfs
            return false;
        }
        int halfLog10 = log10 / 2;
        int pow = (int) Math.pow(10, halfLog10);
        int firstHalf = n / pow;
        int secondHalf = n % pow;
        return getSum(firstHalf) == getSum(secondHalf);
    }

    private int getSum(int secondHalf) {
        int sum = 0;
        while (secondHalf > 0) {
            sum += secondHalf % 10;
            secondHalf /= 10;
        }
        return sum;
    }
}
