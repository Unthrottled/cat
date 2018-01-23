package io.acari.dp;

import static java.lang.Math.min;

public class MinCostPath {

    public static void main(String... args) {
        MinCostPath minCostPath = new MinCostPath();
        int[][] b = {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};
        System.out.println(minCostPath.find(b));
    }

    public int find(int[][] costs) {
        int rowHeight = costs.length - 1;
        for (int i = rowHeight; i > -1; i--) {
            int columnWidth = costs[i].length - 1;
            for (int j = columnWidth; j > -1; j--) {
                if ((i == rowHeight && j != columnWidth) || i < rowHeight) {
                    boolean outOfBoundsRight = j + 1 > rowHeight;
                    int right = outOfBoundsRight ? Integer.MAX_VALUE : costs[i][j + 1];
                    boolean outOfBoundsBottom = i + 1 > columnWidth;
                    int bottom = outOfBoundsBottom ? Integer.MAX_VALUE : costs[i + 1][j];
                    int bottomRight = outOfBoundsBottom || outOfBoundsRight ? Integer.MAX_VALUE : costs[i + 1][j + 1];

                    costs[i][j] += min(min(right, bottom), bottomRight);
                }
            }
        }
        return costs[0][0];
    }
}
