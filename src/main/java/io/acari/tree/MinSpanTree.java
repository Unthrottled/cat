package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MinSpanTree {

    public long find(Map<Integer, Node<Integer>> root){
        long min = Long.MAX_VALUE;
        for (Node<Integer> integerNode : root.values()) {
            min = Math.min(min, minSpan(integerNode, root.size()));
        }

        return min;
    }

    private long minSpan(Node<Integer> root, int size) {
        Set<Node<Integer>> visited = new HashSet<>();
        TreeMap<Node<Integer>, Node<Integer>> queue = new TreeMap<>();
        root.hd = 0;
        queue.put(root, root);
        while (visited.size() < size && !queue.isEmpty()){
            Node<Integer> currentNode = queue.pollFirstEntry().getValue();
            currentNode.getEdges().stream()
            .filter(e-> !visited.contains(e.getVertex()))
            .filter(e-> e.weight < e.getVertex().hd)
            .forEach(e-> {
                Node<Integer> vertex = e.getVertex();
                vertex.hd = e.weight;
                queue.put(vertex, vertex);

            });
            visited.add(currentNode);
        }

        int sum = visited.stream().mapToInt(Node::getHd).sum();
        visited.forEach(n->n.hd = Integer.MAX_VALUE);
        return sum;
    }
}
