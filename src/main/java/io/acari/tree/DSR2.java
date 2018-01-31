package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class DSR2 {

  public Stream<String> find(Node<Integer> root, Map<Integer, Node<Integer>> graph) {
    TreeMap<Node<Integer>, Node<Integer>> treeMap = new TreeMap<>(Node::compareTo);
    int size = graph.size();
    Set<Node<Integer>> shortPathInGraphSet = new HashSet<>(size);
    root.hd = 0;
    treeMap.put(root, root);
    while (shortPathInGraphSet.size() < size && !treeMap.isEmpty()) {
      Node<Integer> value = treeMap.pollFirstEntry().getValue();
      shortPathInGraphSet.add(value);
      value.getEdges().stream()
          .filter(integerEdge -> value.hd + integerEdge.weight < integerEdge.vertex.hd)
          .forEach(integerEdge -> {
            Node<Integer> vertex = integerEdge.vertex;
            vertex.hd = value.hd + integerEdge.weight;
            treeMap.put(vertex, vertex);
          });
    }
    return Stream.iterate(1, i -> i + 1)
        .limit(size)
        .map(i -> graph.getOrDefault(i, new Node<>(i)))
        .filter(n -> !root.equals(n))
        .map(Node::getHd)
        .map(i -> Integer.MAX_VALUE == i ? -1 : i)
        .map(String::valueOf);
  }
}
