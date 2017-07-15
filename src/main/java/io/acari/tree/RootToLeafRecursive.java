package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.Deque;
import java.util.LinkedList;

public class RootToLeafRecursive {
    public void rootToLeaf(Node root) {
        traverseTree(root, new LinkedList<>());
    }

    public void traverseTree(Node root, Deque<Node> nodeDeque) {
        if (root != null) {
            nodeDeque.offer(root);

            Node left = root.left;
            Node right = root.right;
            if (left == null && right == null) {
                while (!nodeDeque.isEmpty()) {
                    System.out.print(nodeDeque.poll().data + " ");
                }
                System.out.println();
            } else {
                traverseTree(left, new LinkedList<>(nodeDeque));
                traverseTree(right, new LinkedList<>(nodeDeque));
            }
        }
    }
}
