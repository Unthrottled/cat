package io.acari.tree.drivers;

import java.util.Scanner;

public class SyncroDriver {

    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        Integer numNodes = Integer.valueOf(line[0]);
        Integer numRoads = Integer.valueOf(line[0]);
        Integer typesFish = Integer.valueOf(line[0]);
        in.close();
    }
}
