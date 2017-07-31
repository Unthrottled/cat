package io.acari.dp.driver;

import io.acari.dp.EggDrop;
import io.acari.dp.SpecialMatrix;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG15 {

    public static void main(String[] args) {
        EggDrop steve = new EggDrop();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String[] arguments = in.nextLine().trim().split(" ");
            int eggs = Integer.parseInt(arguments[0]);
            int floors = Integer.parseInt(arguments[1]);
            System.out.println(steve.find(eggs, floors));
        }
    }
}
