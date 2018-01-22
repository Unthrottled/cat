package io.acari.string.driver;

import io.acari.string.PhoneNumberWords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG69 {

    public static void main(String... args) {
        PhoneNumberWords steve = new PhoneNumberWords();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String num = in.nextLine().trim();
            String line = in.nextLine().trim();
            Integer[] coinz = new Integer[Integer.parseInt(num)];
            coinz = Arrays.stream(line.trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList()).toArray(coinz);
            System.out.println(steve.find(coinz).collect(Collectors.joining(" ")));
        }
    }
}
