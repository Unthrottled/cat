package io.acari.dp;

public class SpecialMatrix {

    public long find(Integer[][] matrix){
        int rowHeight = matrix.length - 1;
        if(rowHeight > -1){
            int columnHeight = matrix[rowHeight].length - 1;
            matrix[rowHeight][columnHeight] = 1;
            for(int i = rowHeight; i > -1; i--){
                for(int j = columnHeight; j > -1; j--){
                    matrix[i][j] = matrix[i][j] == null ? 0 : matrix[i][j];
                    if(matrix[i][j] != -1){
                        int right = j + 1 > columnHeight ? 0 : matrix[i][j+1];
                        int bottom = i + 1 > rowHeight ? 0 : matrix[i+1][j];
                        matrix[i][j] += getAnInt(right) + getAnInt(bottom);
                    }
                }
            }

            return matrix[0][0] == null ? 0 : matrix[0][0];
        }

        return 0L;
    }

    private int getAnInt(int anInt) {
        return anInt < 0 ? 0 : anInt;
    }
}
