package io.acari.tree;

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        BFSXTotal steve = new BFSXTotal();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i_t = 0; i_t < t; i_t++) {
            int height = in.nextInt();
            int width = in.nextInt();
            char[][] matrix = new char[height][width];
            in.nextLine();
            String line = in.nextLine();
            String[] rows = line.split(" ");
            for (int i = 0; i < height; i++) {
                String rowLine = rows[i];
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = rowLine.charAt(j);
                }
            }
            System.out.println(steve.findTree(matrix));
        }
    }
}
