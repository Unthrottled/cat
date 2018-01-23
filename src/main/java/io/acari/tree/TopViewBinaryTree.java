package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TopViewBinaryTree {

    public void topView(Node root) {
        if (root != null) {
            root.hd = 0;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            SortedMap<Integer, Integer> map = new TreeMap<>(Comparator.comparingInt(a -> a));
            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();
                map.putIfAbsent(currentNode.hd, currentNode.data);
                processNode(queue, currentNode.right, currentNode, a -> a + 1);
                processNode(queue, currentNode.left, currentNode, a -> a - 1);
            }

            System.out.println(map.entrySet()
                    .stream()
                    .map(Map.Entry::getValue)
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        }
    }

    private void processNode(Queue<Node> queue, Node node, Node parent, UnaryOperator<Integer> integerUnaryOperator) {
        if (node != null && node.hd == Integer.MAX_VALUE) {
            node.hd = integerUnaryOperator.apply(parent.hd);
            queue.offer(node);
        }
    }
}
