package io.acari.algorithms;

public class ElectronicsShop {

    public int getMoneySpent(int[] keyboards, int[] drives, int s) {
        int maxo = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int comboWombo = keyboard + drive;
                if (comboWombo <= s && comboWombo > maxo) {
                    maxo = comboWombo;
                }
            }
        }
        return maxo;
    }
}
