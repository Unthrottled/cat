package io.acari.dp;

public class LongestPalindrome {

    private final LongestCommonSubsequence steve = new LongestCommonSubsequence();
    public String find(String steve) {
        return this.steve.findString(steve, new StringBuilder(steve).reverse().toString());
    }
}
