package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LineLevelOrderTraversalTwoQueues {

    public void levelOrder(Node root) {
        if (root != null) {
            Queue<Node> queueOne = new LinkedList<>();
            Queue<Node> queueTwo = new LinkedList<>();
            queueTwo.offer(root);
            while (!queueOne.isEmpty() || !queueTwo.isEmpty()) {
                while (!queueOne.isEmpty()) {
                    doWork(queueTwo, queueOne.poll());
                }

                while (!queueTwo.isEmpty()) {
                    doWork(queueOne, queueTwo.poll());
                }

                System.out.print("$ ");
            }
        }


    }

    private void doWork(Queue<Node> queueOne, Node node) {
        if (node.left != null)
            queueOne.offer(node.left);
        if (node.right != null)
            queueOne.offer(node.right);
        System.out.print(node.data + " ");
    }
}

