package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeafBinaryTreeCounterNonRecursive {

    public int countLeaves(Node root) {
        if (root != null) {
            int children = 0;
            Queue<Node> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();

                if (currentNode.right == null && currentNode.left == null) {
                    children++;
                } else {
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                }
            }
            return children;

        }

        return 0;
    }
}
