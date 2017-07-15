package io.acari.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LowestCommonAncestor {

    public Node LCA(Node root, int one, int two) {
        if (root != null) {
            Deque<Node> onePath = doWork(root, one);
            if (onePath.isEmpty()) {
                return null;
            }
            Deque<Node> twoPath = doWork(root, two);
            if (twoPath.isEmpty()) {
                return null;
            }

            while (!(onePath.isEmpty() || twoPath.isEmpty())) {
                if (onePath.size() > twoPath.size()) {
                    onePath.pollLast();
                } else if (twoPath.size() > onePath.size()) {
                    twoPath.pollLast();
                } else {
                    Node onePoll = onePath.pollLast();
                    Node twoPoll = twoPath.pollLast();
                    if (onePoll.data == twoPoll.data) {
                        return onePoll;
                    }
                }
            }
        }

        return root;
    }

    private Deque<Node> doWork(Node root, int nodeToFind) {
        if (root != null) {
            if (root.data == nodeToFind) {
                Deque<Node> deque = new LinkedList<>();
                deque.push(root);
                return deque;
            }

            Node right = root.right;
            if (right != null) {
                Deque<Node> deque = getNodes(right, nodeToFind);
                if (deque != null) return deque;
            }
            Node left = root.left;
            if (left != null) {
                Deque<Node> deque = getNodes(left, nodeToFind);
                if (deque != null) return deque;
            }
        }
        return new ArrayDeque<>();
    }

    private Deque<Node> getNodes(Node root, int right) {
        Deque<Node> deque = doWork(root, right);
        if (!deque.isEmpty()) {
            deque.push(root);
            return deque;
        }
        return null;
    }

    public void doThing(Node node) {
        System.out.print(LCA(node, 2, 3));
    }
}
