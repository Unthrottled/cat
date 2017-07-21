package io.acari.tree.drivers;

import io.acari.tree.NodeAtEvenDistance;
import io.acari.tree.pojo.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GFG4 {
    public static void main(String[] args) {
        NodeAtEvenDistance steve = new NodeAtEvenDistance();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String guy = in.nextLine();
            guy = guy.isEmpty() ? in.nextLine() : guy;
            int nodes = Integer.parseInt(guy);
            Map<Integer, Node> graph = new HashMap<>(nodes);
            String line = in.nextLine();
            line = line.isEmpty() ? in.nextLine() : line;
            String[] rows = line.trim().split(" ");
            int root = Integer.parseInt(rows[0]);
            graph.put(root, new Node(root));
            for (int i = 1; i < rows.length; i += 2) {
                int parent = Integer.parseInt(rows[i - 1]);
                int child = Integer.parseInt(rows[i]);
                Node rootTreeNode = graph.getOrDefault(parent, new Node(parent));
                Node childTreeNode = graph.getOrDefault(child, new Node(child));
                if (childTreeNode.left != null && childTreeNode.right != null) {
                    childTreeNode = new Node(child);
                }
                rootTreeNode.right = childTreeNode;
                childTreeNode.left = rootTreeNode;


                graph.put(rootTreeNode.data, rootTreeNode);
                graph.put(childTreeNode.data, childTreeNode);
            }
            System.out.println(steve.findNodesWithEvenDistance(graph.get(Integer.parseInt(rows[0]))));
        }
    }

}
