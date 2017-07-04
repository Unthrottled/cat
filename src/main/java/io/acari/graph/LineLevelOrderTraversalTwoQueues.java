package io.acari.graph;

import java.util.LinkedList;
import java.util.Queue;

class LineLevelOrderTraversalTwoQueues {

    public void levelOrder(LineLevelOrderTraversal.Node root) {
        if (root != null){
            Queue<LineLevelOrderTraversal.Node> queueOne = new LinkedList<>();
            Queue<LineLevelOrderTraversal.Node> queueTwo = new LinkedList<>();
            queueOne.offer(root);
            while (!queueOne.isEmpty() || !queueTwo.isEmpty()){
                while (!queueOne.isEmpty()){
                    doWork(queueTwo, queueOne.poll());
                }

                while (!queueTwo.isEmpty()){
                    doWork(queueOne, queueTwo.poll());
                }

                System.out.print("$ ");
            }
        }


    }

    private void doWork(Queue<LineLevelOrderTraversal.Node> queueOne, LineLevelOrderTraversal.Node node) {
        if(node.left != null)
            queueOne.offer(node.left);
        if(node.right != null)
            queueOne.offer(node.right);
        System.out.print(node.data + " ");
    }
}

