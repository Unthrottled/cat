package io.acari.graph;

import java.util.Deque;
import java.util.LinkedList;

public class RightViewInterative extends RightViewRecursive {
    @Override
    void rightView(Node node) {
        if(node != null){
            Deque<Node> one = new LinkedList<>();
            one.offer(node);
            Deque<Node> two = new LinkedList<>();
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
            offerItem(two, currentNode.right);
            offerItem(two, currentNode.left);
        }
    }

    private void offerItem(Deque<Node> two, Node right) {
        if(right != null){
            two.offer(right);
        }
    }
}
