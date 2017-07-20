package io.acari.dp;

import java.util.Scanner;

public class UglyNumbers {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i_t = 0; i_t < testCases; i_t++){
            System.out.println(nextUgly(in.nextLong()));
        }

        in.close();
    }

    private static long nextUgly(long testCase){
        return Long.MAX_VALUE;
    }
}
