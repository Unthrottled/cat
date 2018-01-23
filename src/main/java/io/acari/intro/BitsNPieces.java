package io.acari.intro;

public class BitsNPieces {

    /**
     * You are taking part in an Escape Room challenge
     * designed specifically for programmers.
     * <p>
     * In your efforts to find a clue, you've found a binary
     * code written on the wall behind a vase, and realized that it
     * must be an encrypted message.
     * <p>
     * After some thought, your first guess is that each
     * consecutive 8 bits of the code stand for the character with
     * the corresponding extended ASCII code.
     * <p>
     * Assuming that your hunch is correct, decode the message.
     *
     * @param code
     * @return
     */
    String messageFromBinaryCode(String code) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < code.length(); i += 8) {
            stringBuilder.appendCodePoint((char) Long.parseLong(code.substring(i, i + 8), 2));
        }
        return stringBuilder.toString();
    }

}
