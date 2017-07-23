package io.acari.dp;

public class LongestCommonSubsequence {

    public int find(String one, String two){
        int oneLength = one.length();
        int twoLength = two.length();
        int[][] matrix = new int[oneLength +1][twoLength + 1];
        for(int i = oneLength; i > -1; i--){
            for(int j = twoLength; j > -1; j--){
                if(i >= oneLength || j >= twoLength) matrix[i][j] = 0;
                else if(one.charAt(i) == two.charAt(j)) matrix[i][j] = 1 + matrix[i + 1][j + 1];
                else matrix[i][j] = Math.max(matrix[i][j + 1], matrix[i + 1][j]);
            }
        }
        return matrix[0][0];
    }

    public String findString(String one, String two){
        return "";
    }
}
