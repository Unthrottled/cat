package io.acari.tree.drivers;

import io.acari.tree.LevelOrderTraversal;
import io.acari.tree.pojo.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class GFG1 {
    public static void main(String[] args) {
        LevelOrderTraversal steve = new LevelOrderTraversal();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i_t = 0; i_t < t; i_t++) {
            int nodes = in.nextInt();
            Map<String, TreeNode> graph = new HashMap<>(nodes);
            in.nextLine();
            String line = in.nextLine();
            String[] rows = line.split(" ");
            for (int i = 0; i < rows.length - 2; i += 3) {
                String root = rows[i];
                String child = rows[i + 1];
                String side = rows[i + 2];
                TreeNode rootTreeNode = graph.getOrDefault(root, new TreeNode(parseInt(root)));
                TreeNode childTreeNode = graph.getOrDefault(child, new TreeNode(parseInt(child)));
                if (side.charAt(0) == 'L') {
                    rootTreeNode.setLeft(childTreeNode);
                } else {
                    rootTreeNode.setRight(childTreeNode);
                }

                graph.put(valueOf(rootTreeNode.getData()), rootTreeNode);
                graph.put(valueOf(childTreeNode.getData()), childTreeNode);
            }
            System.out.println(steve
                    .traverseTree(graph.get(rows[0]))
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        }
    }
}
