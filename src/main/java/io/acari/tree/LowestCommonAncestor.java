package io.acari.tree;

import com.google.common.collect.Lists;

import java.util.*;

public class LowestCommonAncestor {

    public int lowestCommonAncestor(Node root, Node one, Node two) {
        if (root != null) {
            Deque<Node> onePath = doWork(root, one);
            if(onePath.isEmpty()){
                return -1;
            }
            Deque<Node> twoPath = doWork(root, two);
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

    private Deque<Node> doWork(Node root, Node nodeToFind) {
        if(root != null){
            if(root.data == nodeToFind.data){
                Deque<Node> deque = new LinkedList<>();
                deque.push(root);
                return deque;
            }

            Node right = root.right;
            if(right != null){
                Deque<Node> deque = getNodes(nodeToFind, right);
                if (deque != null) return deque;
            }
            Node left = root.left;
            if (left != null){
                Deque<Node> deque = getNodes(nodeToFind, left);
                if (deque != null) return deque;
            }
        }
        return new ArrayDeque<>();
    }

    private Deque<Node> getNodes(Node one, Node right) {
        Deque<Node> deque = doWork(right, one);
        if(!deque.isEmpty()){
            deque.push(right);
            return deque;
        }
        return null;
    }

    public void doThing(Node node) {
        System.out.print(lowestCommonAncestor(node, new Node(90), new Node(60)));
    }
}
