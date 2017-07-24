package io.acari.dp;

public class MinCostPath {

    public int find(int[][] costs){
        return -1;
    }

    public static void main(String... args){
        MinCostPath minCostPath = new MinCostPath();
        int[][] b = {{1,2,3},{4,8,2},{1,5,3}};
        System.out.println(minCostPath.find(b));
    }
}
