package io.acari.algorithms.driver;

import io.acari.algorithms.ElectronicsShop;

import java.util.Scanner;

public class ElectricAvenue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for (int drives_i = 0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can'value purchase both items
        int moneySpent = new ElectronicsShop().getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
