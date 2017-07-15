package io.acari.tree;

import io.acari.tree.pojo.Node;

public class SumPathPruningP2 {

    private static int aoeu = 0;

    public static void main(String... args) {
        int k = 45;
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(12);
        root.right.right.left = new Node(10);
        root.right.right.left.right = new Node(11);
        root.left.left.right.left = new Node(13);
        root.left.left.right.right = new Node(14);
        root.left.left.right.right.left = new Node(15);

        SumPathPruningP2 sumPathPruning = new SumPathPruningP2();
        sumPathPruning.print(root);
        System.out.println();
        sumPathPruning.prune(root, k);
        sumPathPruning.print(root);
        System.out.println();
        System.out.println(aoeu);
    }

    public void prune(Node root, int k) {
        prunGuy(root, null, k);
    }

    private void prunGuy(Node root, Node parent, int k) {
        aoeu++;
        if (root != null) {
            int k1 = k - root.data;
            prunGuy(root.left, root, k1);
            prunGuy(root.right, root, k1);

            if (root.right == null && root.left == null && parent != null && k > root.data) {
                if (parent.left == root)
                    parent.left = null;
                else
                    parent.right = null;
            }
        }
    }

    public void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.print(node.data + " ");
            print(node.right);
        }
    }
}
