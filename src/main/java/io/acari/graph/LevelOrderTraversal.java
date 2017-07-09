package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

class LevelOrderTraversal {

    public java.util.stream.Stream<Integer> traverseTree(TreeNode root) {
        final java.util.stream.Stream.Builder<Integer> bob = java.util.stream.Stream.builder();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            Set<TreeNode> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                TreeNode poll = queue.poll();
                bob.add(poll.getData());
                visited.add(poll);
                processNode(queue, visited, poll.getLeft());
                processNode(queue, visited, poll.getRight());
            }
        }
        return bob.build();
    }

    private void processNode(Queue<TreeNode> queue, Set<TreeNode> visited, TreeNode left) {
        if (left != null && !visited.contains(left)) {
            queue.add(left);
        }
    }


}

class GFG1 {
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
