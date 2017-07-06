package io.acari.graph;

import java.util.*;

import static java.lang.Integer.parseInt;

class LineLevelOrderTraversal {

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

final class Node {
    public final int data;
    public Node left;

    public Node right;
    public int hd = Integer.MAX_VALUE;
    public Node(int data) {
        this.data = data;
    }


}

class GFG2 {
    public static void main(String[] args) {
        TopViewBinaryTree steve = new TopViewBinaryTree();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i_t = 0; i_t < t; i_t++) {
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
            steve.topView(graph.get(parseInt(rows[0])));
            System.out.println();
        }
    }
}