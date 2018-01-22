package io.acari.tree.drivers;

import io.acari.tree.SubTree;
import io.acari.tree.pojo.Node;
import io.acari.tree.pojo.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GFG3 {
    public static void main(String[] args) {
        SubTree steve = new SubTree();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i_t = 0; i_t < t; i_t++) {
            Pair<Map<Integer, Node>, String[]> mapPair = doWerk(in);
            Map<Integer, Node> graph = mapPair.fst;
            String[] rows = mapPair.snd;
            Pair<Map<Integer, Node>, String[]> mapPair1 = doWerk(in);
            Map<Integer, Node> fst = mapPair1.fst;
            String[] snd = mapPair1.snd;

            boolean subtree = SubTree.isSubtree(graph.get(parseInt(rows[0])), fst.get(parseInt(snd[0])));
            System.out.println(subtree);
            in.nextLine();
        }
    }

    private static Pair<Map<Integer, Node>, String[]> doWerk(Scanner in) {
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
        return new Pair<>(graph, rows);
    }

}
