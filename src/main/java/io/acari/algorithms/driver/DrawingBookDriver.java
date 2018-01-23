package io.acari.algorithms.driver;

import io.acari.algorithms.DrawingBook;

import java.util.Scanner;

public class DrawingBookDriver {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println(new DrawingBook().find(in.nextLong(), in.nextLong()));
        in.close();
    }
}
