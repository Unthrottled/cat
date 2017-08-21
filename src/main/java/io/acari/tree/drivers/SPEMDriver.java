package io.acari.tree.drivers;

import io.acari.tree.ShortestPathToEndMaff;

import java.util.Scanner;

public class SPEMDriver {

    public static void main(String[] butts) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        ShortestPathToEndMaff steve = new ShortestPathToEndMaff();
        for (int i = 0; i < testCases; i++) {
            int end = in.nextInt();
            System.out.println(steve.find(1, end));
        }
    }

}
