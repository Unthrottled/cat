package io.acari.intro;

import java.util.Arrays;

public class MACAttack {

    /**
     * A media access control address (MAC address)
     * is a unique identifier assigned to network interfaces
     * for communications on the physical network segment.
     * <p>
     * The standard (IEEE 802) format for printing MAC-48
     * addresses in human-friendly form is six groups of
     * two hexadecimal digits (0 to 9 or A to F), separated
     * by hyphens (e.g. 01-23-45-67-89-AB).
     *
     * @param inputString
     * @return
     */
    boolean isMAC48Address(String inputString) {
        if (inputString.startsWith("-") || inputString.endsWith("-"))
            return false;
        String[] split = inputString.split("-");
        return split.length == 6 &&
                Arrays.stream(split)
                        .allMatch(s -> s.matches("[A-F0-9]{2}"));
    }
}
