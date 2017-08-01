package io.acari.dp;

public class MatrixMulti {

    public long find(Integer[] matrices) {
        int arrayLength = matrices.length;
        int[][] lookup = new int[arrayLength][arrayLength];
        for (int chainLength = 2; chainLength < arrayLength; chainLength++) {
            for (int i = 1; i < arrayLength - chainLength + 1; i++) {
                int nextMatrix = chainLength + i - 1;
                lookup[i][nextMatrix] = Integer.MAX_VALUE;
                for (int k = i; k < nextMatrix; k++) {
                    int dis = lookup[i][k] + lookup[k + 1][nextMatrix] + matrices[i - 1] * matrices[k] * matrices[nextMatrix];
                    lookup[i][nextMatrix] = lookup[i][nextMatrix] > dis ? dis : lookup[i][nextMatrix];
                }
            }
        }

        for (int[] ints : lookup) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        return lookup[1][arrayLength - 1];
    }
}
