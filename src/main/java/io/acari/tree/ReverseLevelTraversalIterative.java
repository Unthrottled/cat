package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseLevelTraversalIterative {
    public void reversePrint(Node node) {
        if (node != null) {
            Deque<Node> deque = new LinkedList<>();
            Deque<Node> print = new LinkedList<>();
            deque.offer(node);
            while (!(deque.isEmpty())) {
                Node currentNode = deque.poll();
                print.push(currentNode);
                if (currentNode.right != null) {
                    deque.offer(currentNode.right);
                }
                if (currentNode.left != null) {
                    deque.offer(currentNode.left);
                }

            }

            System.out.print(print.stream()
                    .map(a -> a.data)
                    .map(String::valueOf)
                    .collect(java.util.stream.Collectors.joining(" ")));
        }
    }
}
