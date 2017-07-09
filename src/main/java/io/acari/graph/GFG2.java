package io.acari.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class GFG2 {
    public static void main(String[] args) {
        RightViewRecursive steve = new RightViewRecursive();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i_t = 0; i_t < t; i_t++) {
            int nodes = in.nextInt();
            Map<Integer, Node> graph = new HashMap<>(nodes);
            in.nextLine();
            String line = in.nextLine();
            String[] rows = line.split(" ");
            for (int i = 0; i < rows.length - 2; i += 3) {
                int root = Integer.parseInt(rows[i]);
                int child = Integer.parseInt(rows[i + 1]);
                String side = rows[i + 2];
                Node rootTreeNode = graph.getOrDefault(root, new Node(root));
                Node childTreeNode = graph.getOrDefault(child, new Node(child));
                if (childTreeNode.left != null && childTreeNode.right != null) {
                    childTreeNode = new Node(child);
                }

                if (side.charAt(0) == 'L' && rootTreeNode.left == null) {
                    rootTreeNode.left = childTreeNode;
                } else if (rootTreeNode.right == null) {
                    rootTreeNode.right = childTreeNode;
                }

                graph.put(rootTreeNode.data, rootTreeNode);
                graph.put(childTreeNode.data, childTreeNode);
            }
            steve.rightView(graph.get(parseInt(rows[0])));
            System.out.println();
        }
    }
}
