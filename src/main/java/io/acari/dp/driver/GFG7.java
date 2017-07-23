package io.acari.dp.driver;

import io.acari.dp.LongestCommonSubsequence;
import io.acari.dp.StringIncreasingDistance;

import java.util.Scanner;

public class GFG7 {
    public static void main(String[] args) {
        StringIncreasingDistance steve = new StringIncreasingDistance();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String line = in.nextLine();
            System.out.println(steve.find(line));
        }
    }
}
