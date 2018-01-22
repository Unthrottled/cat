package io.acari.algorithms.driver;

import io.acari.algorithms.CountingValleys;

import java.util.Scanner;

public class CVDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println(new CountingValleys().find(in.nextLine()));
        in.close();
    }
}
