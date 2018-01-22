package io.acari.intro;

public class StringBoutique {

    /**
     * A string is said to be beautiful if b occurs
     * in it no more times than a;c occurs in it no more times than b; etc.
     *
     * @param inputString
     * @return
     */
    boolean isBeautifulString(String inputString) {
        int[] charCounts = new int[26];
        inputString.chars().map(i -> i - 97).forEach(i -> charCounts[i]++);
        for (int i = 1; i < charCounts.length; i++) {
            if (charCounts[i - 1] < charCounts[i]) {
                return false;
            }
        }
        return true;//gurl you always beautiful.
    }

}
