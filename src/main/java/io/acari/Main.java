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

    public static void printArray(boolean[][] lookup) {
        for (boolean[] ints : lookup) {
            for (boolean anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(long[][] lookup) {
        for (long[] ints : lookup) {
            for (long anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}