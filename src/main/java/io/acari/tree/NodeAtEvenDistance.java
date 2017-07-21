package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.LinkedList;
import java.util.Queue;

public class NodeAtEvenDistance {

    public int findNodesWithEvenDistance(Node root){
        int buddiez = 0;
        if(root != null){
            Queue<Node> bfsQueue = new LinkedList<>();
            Queue<Node> dfsQueue = new LinkedList<>();
            bfsQueue.offer(root);
            while (!bfsQueue.isEmpty()){
                int dist= 0;
                Node currentNode = bfsQueue.poll();
                Node right = currentNode.right;
                if(right != null){
                    bfsQueue.offer(right);
                    dfsQueue.offer(right);
                    while (!dfsQueue.isEmpty()){
                        Node poll = dfsQueue.poll();
                        if(++dist%2==0)buddiez++;
                        Node rightGuy = poll.right;
                        if(rightGuy != null)dfsQueue.offer(rightGuy);
                    }
                }
            }
        }
        return buddiez;
    }
}
