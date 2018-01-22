package io.acari.intro;

import java.util.Map;
import java.util.stream.Collectors;

public class CommonCharacterCounter {

    /**
     * Given two strings, find the number of common characters between them
     *
     * @param s1
     * @param s2
     * @return
     */
    int commonCharacterCount(String s1, String s2) {
        Map<Integer, Integer> counts1 = s1.chars().boxed().collect(Collectors.toMap((a) -> a, a -> 1, (a, b) -> a + b));
        Map<Integer, Integer> counts2 = s2.chars().boxed().collect(Collectors.toMap((a) -> a, a -> 1, (a, b) -> a + b));
        return counts1.entrySet().stream()
                .filter(e -> counts2.containsKey(e.getKey()))
                .mapToInt(e -> Math.min(counts2.get(e.getKey()), e.getValue()))
                .sum();
    }

}
