package io.acari.intro;

public class AlphaShift {

    /**
     * Given a string, replace each its
     * character by the next one in the English alphabet (z would be replaced by a).
     *
     * @param inputString
     * @return
     */
    String alphabeticShift(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        inputString.chars()
                .map(i -> 97 + ((i - 96) % 26))
                .mapToObj(i -> (char) i)
                .forEach(stringBuilder::append);
        return stringBuilder.toString();
    }


}
