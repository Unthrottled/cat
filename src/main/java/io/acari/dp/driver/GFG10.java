package io.acari.dp.driver;

import io.acari.dp.SpecialMatrix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG10 {

    public static void main(String... args) {
        SpecialMatrix steve = new SpecialMatrix();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String[] arguments = in.nextLine().split(" ");
            int rowEnd = Integer.parseInt(arguments[0]);
            int colEnd = Integer.parseInt(arguments[1]);
            int blockedSpaces = Integer.parseInt(arguments[2]);
            String line = in.nextLine();
            Integer[][] matrix = new Integer[rowEnd][colEnd];
            Integer[] blockers = new Integer[2 * blockedSpaces];
            blockers = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList()).toArray(blockers);
            for (int j = 0; j < blockers.length; j += 2) {
                matrix[blockers[j] -1][blockers[j + 1]-1] = -1;
            }
            System.out.println(steve.find(matrix));
        }
    }
}
