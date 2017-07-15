package io.acari.tree;

public class LeafBinaryTreeCounter {

    public int countLeaves(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                return 1;
            } else {
                return countLeaves(node.left) + countLeaves(node.right);
            }
        }

        return 0;
    }
}
