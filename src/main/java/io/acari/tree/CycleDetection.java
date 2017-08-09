package io.acari.tree;

import java.util.*;

public class CycleDetection {

    public boolean hasCycle(int v, LinkedList<Integer>[] alist, boolean[] visi, boolean[] explored) {
        Set<Integer> visited = new HashSet<>();
        Deque<Node> queue = new LinkedList<>();
        int _x = 0;
        for(List<Integer> gee: alist){
            visited.clear();
            queue.clear();
            queue.offer(new Node(_x, alist[_x++]));
            while(!queue.isEmpty()){
                Node currentNode = queue.poll();
                visited.add(currentNode.data);
                for(Integer iGuy: currentNode.edges){
                    if(!visited.contains(iGuy)){
                        queue.push(new Node(iGuy, alist[iGuy]));
                    } else {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

class Node {
    List<Integer> edges;
    int data;

    Node( int d, List<Integer> e){
        edges = e;
        data = d;
    }
}
