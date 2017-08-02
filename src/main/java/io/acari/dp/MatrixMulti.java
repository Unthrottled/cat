package io.acari.dp;


import static io.acari.Main.printArray;

public class MatrixMulti {

    public long find(Integer[] matrices) {
        int arrayLength = matrices.length;
        int[][] lookup = new int[arrayLength][arrayLength];
        int[][] split = new int[arrayLength][arrayLength];
        //Starts at 2 because you can't multiply on matrix
        //Since [12, 10, 20] defines two matrices of 12 x 10 and 10 x 20
        for (int chainLength = 2; chainLength < arrayLength; chainLength++) {
            for (int i = 1; i < arrayLength - chainLength + 1; i++) {
                int nextMatrix = chainLength + i - 1;
                lookup[i][nextMatrix] = Integer.MAX_VALUE;
                for (int k = i; k < nextMatrix; k++) {
                    Integer column = matrices[i - 1];
                    Integer row = matrices[nextMatrix];
                    Integer otherColumn = matrices[k];
                    int previousMin = lookup[i][k] + lookup[k + 1][nextMatrix];
                    int currentCombiniation = previousMin + column * row * otherColumn;
                    int currentValue = lookup[i][nextMatrix];
                    boolean b = currentValue > currentCombiniation;
                    if (b) {
                        lookup[i][nextMatrix] = currentCombiniation;
                        split[i][nextMatrix] = k;

                    }
                }
            }
        }

        printArray(lookup);
        System.out.println();
        printArray(split);
        System.out.println(findo(matrices, split, 0, arrayLength - 1));


        return lookup[1][arrayLength - 1];
    }

    private String findo(Integer[] matrices, int[][] split, int i, int arrayLength) {
        if (i == arrayLength) {
            return matrices[i] + "";
        } else {
            int sprit = split[i][arrayLength];
            String findo1 = findo(matrices, split, i, sprit);
            String findo = findo(matrices, split, sprit + 1, arrayLength);
            return "(" + findo1 + " " + findo + ")";
        }
    }


}
