package io.acari.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class BFSXTotal {

    public int findTree(char[][] matrix) {
        final int rowHeight = matrix.length;
        if (rowHeight > 0) {
            return getShapes(matrix, rowHeight);
        }
        return 0;
    }

    private int getShapes(char[][] matrix, int rowHeight) {
        int shapes = 0;
        final boolean searched[][] = new boolean[rowHeight][matrix[0].length];
        for (int row = 0; row < rowHeight; row++) {
            final int colWidth = matrix[row].length;
            for (int col = 0; col < colWidth; col++) {
                if (matrix[row][col] == 'X' && !searched[row][col]) {
                    shapes++;
                    Queue<Node> queue = new LinkedList<>();
                    Node rootNode = new Node(col, row);
                    queue.add(rootNode);
                    while (!queue.isEmpty()) {
                        Node currentNode = queue.poll();
                        searched[currentNode.getY()][currentNode.getX()] = true;
                        currentNode.fetchNeighbors()
                                .filter(node -> node.getX() < colWidth && node.getX() > -1)
                                .filter(node -> node.getY() < rowHeight && node.getY() > -1)
                                .filter(node -> !searched[node.getY()][node.getX()])
                                .filter(node -> matrix[node.getY()][node.getX()] == 'X')
                                .forEach(queue::offer);
                    }
                }
            }
        }
        return shapes;
    }

    private static final class Node {
        private final int x;
        private final int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Stream<Node> fetchNeighbors() {
            return Stream.of(
                    new Node(x, y - 1),//top
                    new Node(x, y + 1),//bottom
                    new Node(x - 1, y),//left
                    new Node(x + 1, y)//right
            );
        }
    }
}


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
