package io.acari;

public class Main {

    public static void printArray(int[][] lookup) {
        for (int[] ints : lookup) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}