package io.acari.dp.driver;

import io.acari.dp.LongestPalindrome;
import io.acari.dp.MinJumps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG11 {

    public static void main(String... args) {
        LongestPalindrome steve = new LongestPalindrome();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String num = in.nextLine();
            System.out.println(steve.find(num));
        }
    }
}
