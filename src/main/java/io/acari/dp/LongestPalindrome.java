package io.acari.dp;

public class LongestPalindrome {

    public String find(String steve) {
        int length = steve.length();
        boolean[][] lookup = new boolean[length + 1][length + 1];
        int start = 0, longestLength = 1;

        for (int i = 0; i < length; i++) {
            lookup[i][i] = true;//all single character strings are palindromes, yay!
        }

        for (int i = 0; i < length - 1; i++) {
            if (steve.charAt(i) == steve.charAt(i + 1)) {
                lookup[i][i + 1] = true;
                longestLength = 2;
                start = i;
            }
        }

        for (int i = 3; i <= length; i++) {
            for (int j = 0; j < length - i + 1; j++) {
                int k = i + j - 1;
                boolean allBefore = lookup[j + 1][k - 1];
                if (allBefore && steve.charAt(j) == steve.charAt(k)) {
                    lookup[j][k] = true;
                    if (i > longestLength) {
                        longestLength = i;
                        start = j;
                    }
                }
            }
        }

        return steve.substring(start, start + longestLength);
    }
}
