package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class DSR2 {

    public Stream<String> find(Node<Integer> root, int size){
        TreeMap<Integer, Node<Integer>> treeMap = new TreeMap<>();
        Set<Node<Integer>> shortPathInGraphSet = new HashSet<>(size);
        root.hd = 0;
        treeMap.put(root.data, root);
        while (shortPathInGraphSet.size() < size){
            Node<Integer> value = treeMap.pollFirstEntry().getValue();
            shortPathInGraphSet.add(value);
            value.getEdges().stream()
                    .filter(integerEdge -> value.hd + integerEdge.weight < integerEdge.vertex.hd)
                    .forEach(integerEdge -> {
                        Node<Integer> vertex = integerEdge.vertex;
                        vertex.hd = value.hd + integerEdge.weight;
                        treeMap.put(vertex.data, vertex);
                    });
        }
        return shortPathInGraphSet.stream()
                .filter(n-> !root.equals(n))
                .map(Node::getHd)
                .map(String::valueOf);
    }
}
