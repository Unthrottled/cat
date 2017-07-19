package io.acari.dp;

public class LongestCommonSequence {

    public static void main(String... args) {
        LongestCommonSequence steve = new LongestCommonSequence();
        System.out.println(steve.find("nematode knowledge", "empty bottle"));
    }

    public int find(String one, String two) {
        if (one.isEmpty() || two.isEmpty()) {
            return 0;
        } else if (one.charAt(0) == two.charAt(0)) {
            return 1 + find(one.substring(1), two.substring(1));
        } else {
            return Math.max(find(one.substring(1), two), find(one, two.substring(1)));
        }
    }
}
