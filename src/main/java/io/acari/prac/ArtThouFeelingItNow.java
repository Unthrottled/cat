package io.acari.prac;

public class ArtThouFeelingItNow {

    /**
     * Given an array strings, determine whether it follows the sequence given
     * in the patterns array. In other words, there should be no i and j for
     * which strings[i] = strings[j] and patterns[i] ≠ patterns[j] or
     * for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].
     * <p>
     * DOES GOOD
     *
     * @param strings
     * @param patterns
     * @return
     */
    boolean areFollowingPatterns(String[] strings, String[] patterns) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                boolean stringsMatch = strings[i].equals(strings[j]);
                boolean patternsMatch = patterns[i].equals(patterns[j]);
                if ((stringsMatch && !patternsMatch) || (!stringsMatch && patternsMatch)) {
                    return false;
                }
            }
        }
        return strings.length == patterns.length;
    }


}
