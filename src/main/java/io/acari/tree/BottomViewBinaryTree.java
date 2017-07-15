package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.*;

public class BottomViewBinaryTree {
    // Should print bottom view of tree with given root
    public void bottomView(Node root) {
        // Your code here
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            root.hd = 0;
            queue.offer(root);
            SortedMap<Integer, Integer> map = new TreeMap<>(Comparator.comparingInt(a -> a));
            map.put(root.hd, root.data);
            while (!queue.isEmpty()) {
                Node poll = queue.poll();

                Node left = poll.left;
                if (left != null && left.hd == Integer.MAX_VALUE) {
                    left.hd = poll.hd - 1;
                    map.put(left.hd, left.data);
                    queue.offer(left);
                }

                Node right = poll.right;
                if (right != null && right.hd == Integer.MAX_VALUE) {
                    right.hd = poll.hd + 1;
                    map.put(right.hd, right.data);
                    queue.offer(right);
                }

            }

            System.out.print(map.entrySet().stream()
                    .map(Map.Entry::getValue)
                    .map(String::valueOf)
                    .collect(java.util.stream.Collectors.joining(" ")));
        }
    }

}