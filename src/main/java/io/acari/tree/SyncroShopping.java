package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.*;
import java.util.stream.Collectors;

public class SyncroShopping {

    //todo: figure out dijkstra's algorithm
    public int find(Node<List<Integer>> root, int size) {
        Set<Node<List<Integer>>> shortestPathTreeSet = new HashSet<>();
        TreeMap<Integer, Node<List<Integer>>> queue = new TreeMap<>();
        queue.put(root.data, root);
        root.hd = 0;
        while (shortestPathTreeSet.size() < size) {
            Node<List<Integer>> poll = queue.pollFirstEntry().getValue();
            shortestPathTreeSet.add(poll);
            poll.getEdges().stream()
                    .filter(ee -> poll.hd + ee.weight <ee.vertex.hd)
                    .forEach(edge -> {
                        Node<List<Integer>> vertex = edge.vertex;
                        vertex.hd = poll.hd + edge.weight;
                        queue.put(vertex.data, vertex);
                    });
        }
        System.out.println(shortestPathTreeSet.stream()
                .filter(n-> !root.equals(n))
                .map(Node::getData)
                .map(String::valueOf).collect(Collectors.joining(" ")));
        return -1;
    }
}
