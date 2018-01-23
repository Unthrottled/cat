package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.Deque;
import java.util.LinkedList;

public class PerfectBinaryTreeTraversal {

    public static void main(String... args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        root.left.left.left.left = new Node(16);
        root.left.left.left.right = new Node(17);
        root.left.left.right.left = new Node(18);
        root.left.left.right.right = new Node(19);
        root.left.right.left.left = new Node(20);
        root.left.right.left.right = new Node(21);
        root.left.right.right.left = new Node(22);
        root.left.right.right.right = new Node(23);
        root.right.left.left.left = new Node(24);
        root.right.left.left.right = new Node(25);
        root.right.left.right.left = new Node(26);
        root.right.left.right.right = new Node(27);
        root.right.right.left.left = new Node(28);
        root.right.right.left.right = new Node(29);
        root.right.right.right.left = new Node(30);
        root.right.right.right.right = new Node(31);
        new PerfectBinaryTreeTraversal().print(root);
    }

    public void print(Node root) {
        if (root != null) {
            Deque<Node> one = new LinkedList<>();
            Deque<Node> two = new LinkedList<>();
            one.offer(root);
            System.out.print(root.data + " ");
            while (!(one.isEmpty() && two.isEmpty())) {
                doWork(one, two);
                printThing(new LinkedList<>(two), true);
                doWork(two, one);
                printThing(new LinkedList<>(one), true);
            }
        }
    }

    private void printThing(Deque<Node> two, boolean thing) {
        while (!two.isEmpty()) {
            if (thing) {
                System.out.print(two.poll().data + " ");
            } else {
                System.out.print(two.pollLast().data + " ");
            }

            thing = !thing;
        }
    }

    private void doWork(Deque<Node> one, Deque<Node> two) {
        while (!one.isEmpty()) {
            Node currentNode = one.poll();
            offer(two, currentNode.left);
            offer(two, currentNode.right);
        }
    }

    private void offer(Deque<Node> two, Node left) {
        if (left != null) {
            two.offer(left);
        }
    }


}
