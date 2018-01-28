package io.acari.core;

import java.util.Arrays;

public class Packen {

    /**
     * You are given an array of up to four
     * non-negative integers, each less than 256.
     * <p>
     * Your task is to pack these integers
     * into one number M in the following way:
     * <p>
     * The first element of the array
     * occupies the first 8 bits of M;
     * The second element occupies next
     * 8 bits, and so on.
     * <p>
     * Return the obtained integer M.
     * <p>
     * Note: the phrase "first bits of M"
     * refers to the least significant bits
     * of M - the right-most bits of an integer.
     * For further clarification see the
     * following example.
     *
     * @param numsToPack
     * @return
     */
    int arrayPacking(int[] numsToPack) {
        int packed = 0;
        for (int i = 0; i < numsToPack.length; i++) {
            packed |= numsToPack[i] << (i * 8);
        }
        return packed;
    }

}
