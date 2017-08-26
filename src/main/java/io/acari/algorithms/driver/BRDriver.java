package io.acari.algorithms.driver;

import io.acari.algorithms.BreakingRecords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BRDriver {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String[] split = in.nextLine().split(" ");
        BreakingRecords steve = new BreakingRecords();
        System.out.println(steve.find(Arrays.stream(split)
                .mapToInt(Integer::parseInt))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
