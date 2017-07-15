package io.acari.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LineLevelOrderTraversal {

    public void levelOrder(Node node) {
        BetterNode root = new BetterNode(node);
        final java.util.stream.Stream.Builder<String> bob = java.util.stream.Stream.builder();
        Queue<BetterNode> queue = new LinkedList<>();
        root.distance = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            BetterNode currentNode = queue.poll();
            bob.add(String.valueOf(currentNode.data));
            processNode(queue, currentNode.left, currentNode);
            processNode(queue, currentNode.right, currentNode);

            if (queue.isEmpty() || currentNode.distance < queue.peek().distance) {
                bob.add("$");
            }
        }
        System.out.print(bob.build().collect(java.util.stream.Collectors.joining(" ")));
    }

    private void processNode(Queue<BetterNode> queue, BetterNode child, BetterNode parent) {
        if (child != null && child.distance == -1) {
            child.distance = parent.distance + 1;
            queue.add(child);
        }
    }


    static final class BetterNode {
        public int data;
        public BetterNode left;
        public BetterNode right;
        public int distance = -1;

        public BetterNode(Node data) {
            this.data = data.data;
            this.right = data.right == null ? null : new BetterNode(data.right);
            this.left = data.left == null ? null : new BetterNode(data.left);
        }

    }

}

