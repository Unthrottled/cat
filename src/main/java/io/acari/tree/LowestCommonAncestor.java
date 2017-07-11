package io.acari.tree;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LowestCommonAncestor {

    public int lowestCommonAncestor(Node root, Node one, Node two) {
        if (root != null) {
            Deque<Node> onePath = new LinkedList<>();
            doWork(root, one, onePath);
            if(onePath.isEmpty()){
                return -1;
            }
            Deque<Node> twoPath = new LinkedList<>();
            doWork(root, two, twoPath);
            if(twoPath.isEmpty()){
                return -1;
            }

            while (!(onePath.isEmpty() || twoPath.isEmpty())){
                if(onePath.size() > twoPath.size()){
                    onePath.pollLast();
                } else if (twoPath.size() > onePath.size()){
                    twoPath.pollLast();
                } else {
                    Node onePoll = onePath.pollLast();
                    Node twoPoll = twoPath.pollLast();
                    if(onePoll.data == twoPoll.data){
                        return onePoll.data;
                    }
                }
            }
        }

        return -1;
    }

    private void doWork(Node root, Node one, Deque<Node> onePath) {
        Deque<Node> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            Node currentNode = deque.poll();
            if (currentNode.data == one.data) {
                onePath.offer(currentNode);
                break;
            }

            if (currentNode.left == null && currentNode.right == null) {
                onePath.pollLast();
            } else {
                onePath.offer(currentNode);
                if (currentNode.right != null) {
                    deque.push(currentNode.right);
                }

                if (currentNode.left != null) {
                    deque.push(currentNode.left);
                }
            }

        }
    }

    public void doThing(Node node) {
        System.out.print(lowestCommonAncestor(node, new Node(90), new Node(60)));
    }
}
