package io.acari.tree;

import io.acari.tree.pojo.Edge;
import io.acari.tree.pojo.Node;

import java.util.*;

public class SyncroShopping {

    //todo: figure out dijkstra's algorithm
    public int find(Node<List<Integer>> root, int size){
        Set<Node<List<Integer>>> shortestPathTreeSet = new HashSet<>();
        Queue<Node<List<Integer>>> queue = new LinkedList<>();
        queue.offer(root);
        root.hd = 0;
        while (shortestPathTreeSet.size() < size){
            Node<List<Integer>> poll = queue.poll();
            shortestPathTreeSet.add(poll);
            poll.getEdges().stream()
                    .filter(ee-> ee.vertex.hd == Integer.MAX_VALUE)
                    .forEach(edge-> {
                        edge.vertex.hd = poll.hd + edge.weight;
                        queue.offer(edge.vertex);
                    });
        }

        return -1;
    }
}
