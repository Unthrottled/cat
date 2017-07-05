package io.acari.graph;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderSpiral {

    public void levelOrder(Node root) {
        if (root != null) {
            Queue<Node> queueOne = new LinkedList<>();
            Queue<Node> queueTwo = new LinkedList<>();
            queueTwo.offer(root);
            while (!queueOne.isEmpty() || !queueTwo.isEmpty()) {
                while (!queueOne.isEmpty()) {
                    Node node = queueOne.poll();
                    if (node.right != null)
                        queueTwo.offer(node.right);
                    if (node.left != null) {
                        queueTwo.offer(node.left);
                    }
                    System.out.print(node.data + " ");
                }

                while (!queueTwo.isEmpty()) {
                    Node node = queueTwo.poll();
                    if (node.left != null)
                        queueOne.offer(node.left);
                    if (node.right != null)
                        queueOne.offer(node.right);
                    System.out.print(node.data + " ");
                }
            }
        }


    }

}

