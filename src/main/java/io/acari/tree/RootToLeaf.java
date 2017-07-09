package io.acari.tree;

import java.util.Deque;
import java.util.LinkedList;

public class RootToLeaf {

    //todo: fix me later m8;
    public void rootToLeaf(Node root) {
        if (root != null) {
            Deque<Node> deque = new LinkedList<>();
            Deque<Node> thing = new LinkedList<>();
            deque.offer(root);
            while (!deque.isEmpty()) {
                Node currentNode = deque.poll();
                Node right = currentNode.right;
                Node left = currentNode.left;
                if (right == null && left == null) {
                    LinkedList<Node> nodes = new LinkedList<>(thing);
                    while(!nodes.isEmpty()){
                        System.out.print(nodes.poll().data + " ");
                    }
//                    System.out.print(thing.stream()
//                            .map(a->a.data)
//                            .map(String::valueOf)
//                            .collect(Collectors.joining(" ")));
                    System.out.print(currentNode.data);
                    System.out.println();
                    System.out.println("------");
                } else {
                    thing.offer(currentNode);
                }

                if (right != null) {
                    deque.push(right);
                }

                if (left != null) {
                    deque.push(left);
                }

            }
        }
    }
}
