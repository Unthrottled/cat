package io.acari.algorithms.driver;

import io.acari.algorithms.CatAndMouse;

import java.util.Scanner;

public class CatMouseDriver {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        CatAndMouse steve = new CatAndMouse();
        for(int i = 0; i < testCases; i++){
            int catA = in.nextInt();
            int catB = in.nextInt();
            int mouseC = in.nextInt();
            System.out.println(steve.find(catA, catB, mouseC));
        }
    }
}
