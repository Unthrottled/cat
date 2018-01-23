package io.acari.dp.driver;

import io.acari.dp.PathInMatrix;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG16 {

    public static void main(String[] args) {
        PathInMatrix steve = new PathInMatrix();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String arguments = in.nextLine();
            int rowEnd = Integer.parseInt(arguments);
            String line = in.nextLine();
            Integer[][] matrix = new Integer[rowEnd][rowEnd];
            List<Integer> collect = Arrays.stream(line.trim().split(" ")).filter(s -> !s.isEmpty()).map(Integer::parseInt).collect(Collectors.toList());
            int rollingGuy = 0;
            for (int j = 0; j < rowEnd; j++) {
                for (int i = 0; i < rowEnd; i++) {
                    matrix[j][i] = collect.get(rollingGuy++);
                }
            }
            System.out.println(steve.find(matrix));
        }
    }
}
