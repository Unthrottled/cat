package io.acari.tree;

import io.acari.tree.pojo.Node;

public class SumPathPruning {

    public static int aoeu = 0;

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

        SumPathPruning sumPathPruning = new SumPathPruning();
        sumPathPruning.print(root);
        System.out.println();
        sumPathPruning.prune(root, k);
        sumPathPruning.print(root);
        System.out.println();
        System.out.println(aoeu);
    }

    public void prune(Node root, int k) {
        prunGuy(root, k, root != null ? root.data : 0);
    }

    private void prunGuy(Node root, int k, int parentSum) {
        aoeu++;
        if (root != null) {
            parentSum += root.data;
            Node right = root.right;
            if (right != null) {
                int sum = sumGen(right, parentSum);
                if (sum < k) {
                    root.right = null;
                } else {
                    prunGuy(right, k, parentSum);
                }
            }

            Node left = root.left;
            if (left != null) {
                int sum = sumGen(left, parentSum);
                if (sum < k) {
                    root.left = null;
                } else {
                    prunGuy(left, k, parentSum);
                }
            }
        }
    }

    private int sumGen(Node root, int parentSum) {
        aoeu++;
        int sum = parentSum + root.data;
        Node left = root.left;
        Node right = root.right;
        if (left != null && right != null) {
            return Math.max(sumGen(left, sum), sumGen(right, sum));
        } else if (left != null) {
            return sumGen(left, sum);
        } else if (right != null) {
            return sumGen(right, sum);
        } else {
            return sum;
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
