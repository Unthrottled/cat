package io.acari.dp;

import java.util.Arrays;

public class LongestCommonSequence {
    private static int ayy = 0;
    private static int lemon = 0;
    private static int its = 0;

    public static void main(String... args) {
        LongestCommonSequence steve = new LongestCommonSequence();
        System.out.println(steve.find("nematode knowledge", "empty bottle"));
        System.out.println(steve.betterFind("nematode knowledge", "empty bottle"));
        System.out.println(steve.evenBetterFind("nematode knowledge", "empty bottle"));


        System.out.println(ayy + " " + lemon + " " + its);
    }

    public int find(String one, String two) {
        ayy++;
        if (one.isEmpty() || two.isEmpty()) {
            return 0;
        } else if (one.charAt(0) == two.charAt(0)) {
            return 1 + find(one.substring(1), two.substring(1));
        } else {
            return Math.max(find(one.substring(1), two), find(one, two.substring(1)));
        }
    }

    public int betterFind(String one, String two) {
        int[][] lookup = new int[one.length() + 1][two.length() + 1];
        for (int i = 0; i < one.length(); i++) {
            Arrays.fill(lookup[i], -1);
        }

        return betterFindUtil(one, two, 0, 0, lookup);
    }

    public int evenBetterFind(String one, String two){
        int[][] lookup = new int[one.length() + 1][two.length() + 1];
        for(int i = one.length(); i >= 0; i--){
            for(int j = two.length(); j >= 0; j--){
                its++;
                if(i >= one.length() || j >= two.length()){
                    lookup[i][j] = 0;
                } else if (one.charAt(i) == two.charAt(j)){
                    lookup[i][j] = 1 + lookup[i + 1][j + 1];
                } else {
                    lookup[i][j] = Math.max(lookup[i + 1][j], lookup[i][j + 1]);
                }
            }
        }

        return lookup[0][0];
    }

    private int betterFindUtil(String one, String two, int i, int j, int[][] lookup) {
        lemon++;
        if (lookup[i][j] < 0) {
            if (i >= one.length() || j >= two.length()) {
                return lookup[i][j] = 0;
            } else if (one.charAt(i) == two.charAt(j)) {
                lookup[i][j] = 1 + betterFindUtil(one, two, i + 1, j + 1, lookup);
            } else {
                lookup[i][j] = Math.max(betterFindUtil(one, two, i + 1, j, lookup), betterFindUtil(one, two, i, j + 1, lookup));
            }
        }
        return lookup[i][j];
    }
}
