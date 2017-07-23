package io.acari.dp;

public class LongestCommonSubsequence {

    public int find(String one, String two){
        int oneLength = one.length();
        int twoLength = two.length();
        int[][] matrix = getMatrix(one, two, oneLength, twoLength);
        return matrix[0][0];
    }

    private int[][] getMatrix(String one, String two, int oneLength, int twoLength) {
        int[][] matrix = new int[oneLength +1][twoLength + 1];
        for(int i = oneLength; i > -1; i--){
            for(int j = twoLength; j > -1; j--){
                if(i >= oneLength || j >= twoLength) matrix[i][j] = 0;
                else if(one.charAt(i) == two.charAt(j)) matrix[i][j] = 1 + matrix[i + 1][j + 1];
                else matrix[i][j] = Math.max(matrix[i][j + 1], matrix[i + 1][j]);
            }
        }
        return matrix;
    }

    public String findString(String one, String two){
        int oneLength = one.length();
        int twoLength = two.length();
        int[][] matrix = getMatrix(one, two, oneLength, twoLength);
        int i = 0, j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < oneLength && j < twoLength){
            int main = matrix[i][j];
            if(main != matrix[i + 1][j]){
                while (main == matrix[i][j]){
                    j++;
                }
                stringBuilder.append(two.charAt(j-1));
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
