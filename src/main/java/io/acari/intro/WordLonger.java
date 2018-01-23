package io.acari.intro;

public class WordLonger {

    /**
     * Define a word as a sequence of consecutive
     * English letters.
     * <p>
     * Find the longest word from the given string.
     *
     * @param text
     * @return
     */
    String longestWord(String text) {
        String max = "";
        boolean onWord = false;
        int startIndex = 0;
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (!onWord) {
                    startIndex = i;
                    onWord = true;
                }
            } else {
                if (onWord && i - startIndex > max.length()) {
                    max = text.substring(startIndex, i);
                }
                startIndex = i + 1;
                onWord = false;
            }
        }
        if (onWord) max = length - startIndex > max.length() ? text.substring(startIndex, length) : max;

        return max;
    }

}
