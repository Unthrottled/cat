package io.acari.graph;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

    public void leftView(Node root) {
        if (root != null) {
            Deque<Node> one = new LinkedList<>();
            Deque<Node> two = new LinkedList<>();
            one.offer(root);
            while (!(one.isEmpty() && two.isEmpty())){
                doWork(one, two);
                doWork(two, one);


            }
        }
    }

    private void doWork(Deque<Node> one, Deque<Node> two) {
        if(!one.isEmpty()){
            System.out.print(one.peek().data + " ");
        }
        while (!one.isEmpty()){
            Node currentNode = one.poll();
            offer(two, currentNode.left);
            offer(two, currentNode.right);
        }
    }

    private void offer(Deque<Node> two, Node left) {
        if(left != null){
            two.offer(left);
        }
    }

}