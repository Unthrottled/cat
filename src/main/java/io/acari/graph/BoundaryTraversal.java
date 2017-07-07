package io.acari.graph;

import java.util.Deque;
import java.util.LinkedList;

public class BoundaryTraversal {

    public void printBoundary(Node root) {
        if (root != null) {
            Deque<Node> printQueue = new LinkedList<>();
            printQueue.offer(root);
            Deque<Node> leftDeque = new LinkedList<>();
            Deque<Node> rightDeque = new LinkedList<>();
            if (root.left != null) {
                printQueue.offer(root.left);
                leftDeque.offer(root.left);
                while (!leftDeque.isEmpty()) {
                    Node currentNode = leftDeque.poll();
                    Node childLeft = currentNode.left;
                    Node childRight = currentNode.right;
                    if (childLeft != null) {
                        printQueue.offer(childLeft);
                        leftDeque.push(childLeft);
                        if (childRight != null) {
                            rightDeque.push(childRight);
                        }
                    } else if (childRight != null){
                        printQueue.offer(childRight);
                        leftDeque.offer(childRight);
                    }
                }

                doWork(printQueue, rightDeque);

            }

            Deque<Node> printStack = new LinkedList<>();
            if (root.right != null) {
                printStack.offer(root.right);
                leftDeque.offer(root.right);
                while (!leftDeque.isEmpty()) {
                    Node currentNode = leftDeque.poll();
                    Node childRight = currentNode.right;
                    Node childLeft = currentNode.left;
                    if (childRight != null) {
                        printStack.push(childRight);
                        leftDeque.push(childRight);
                        if (childLeft != null) {
                            rightDeque.offer(childLeft);
                        }
                    } else if(childLeft != null){
                        printStack.push(childLeft);
                        leftDeque.push(childLeft);
                    }
                }

                doWork(printQueue, rightDeque);

                printStack.forEach(printQueue::offer);

            }

            System.out.print(printQueue.stream()
                    .map(a -> a.data)
                    .map(String::valueOf)
                    .collect(java.util.stream.Collectors.joining(" ")));
        }
    }

    private void doWork(Deque<Node> printQueue, Deque<Node> nodeDeque) {
        while (!nodeDeque.isEmpty()) {
            Node currentNode = nodeDeque.poll();
            Node childLeft = currentNode.left;
            Node childRight = currentNode.right;
            if (childRight == null && childLeft == null) {
                printQueue.offer(currentNode);
            }

            if (childRight != null) {
                nodeDeque.push(childRight);
            }

            if (childLeft != null) {
                nodeDeque.push(childLeft);
            }
        }
    }

}
