package io.acari.dp;

public class EggDrop {

    public int find(int eggs, int floors) {
        int[][] lookup = new int[floors + 1][eggs + 1];
        for (int i = 0; i <= eggs; i++) {
            lookup[1][i] = 1;
            lookup[0][i] = 0;
        }
        for (int i = 2; i <= floors; i++) {
            lookup[i][1] = i;
        }

        for (int egg = 2; egg <= eggs; egg++) {
            for (int floor = 2; floor <= floors; floor++) {
                int min = Integer.MAX_VALUE;
                for (int subFloors = 1; subFloors <= floor; subFloors++) {
                    int max = Math.max(lookup[subFloors - 1][egg - 1], lookup[floor - subFloors][egg]) + 1;
                    min = min > max ? max : min;
                }
                lookup[floor][egg] = min;
            }

        }

        return lookup[floors][eggs];
    }
}
