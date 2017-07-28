package io.acari.string.driver;

import io.acari.string.PhoneNumberWords;

import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG69 {

    public static void main(String... args) {
        PhoneNumberWords steve = new PhoneNumberWords();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String num = in.nextLine();
            String line = in.nextLine();
            System.out.println(steve.find(line.trim().split(" ")).collect(Collectors.joining(" ")));
        }
    }
}
