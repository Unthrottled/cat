package io.acari.dp.driver;

import io.acari.dp.CuttedSegments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG9 {

    public static void main(String... args) {
        MatrixMulti steve = new MatrixMulti();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String num = in.nextLine();
            String line = in.nextLine();
            Integer[] coinz = new Integer[Integer.parseInt(num)];
            coinz = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList()).toArray(coinz);
            System.out.println(steve.find(coinz));
        }
    }
}
