package io.acari.dp;

public class LongestPalindrome {
    private final LongestCommonSequence longestCommonSequence = new LongestCommonSequence();

    public String find(String steve) {
        String two = new StringBuilder(steve).reverse().toString();
        int[][] lcs = this.longestCommonSequence.getInts(steve, two);
        int i = 0, j = 0;
        int length = steve.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (i <  length && j < length) {
            int main = lcs[i][j];
            if (main != lcs[i + 1][j]) {
                while (main == lcs[i][j]) {
                    j++;
                }
                stringBuilder.append(two.charAt(j - 1));
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
