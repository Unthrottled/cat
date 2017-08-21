package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class ShortestPathToEnd {

    public long find(Node<Integer> root, Node<Integer> terminatingNode){
        final TreeMap<Node<Integer>, Node<Integer>> nextShortest = new TreeMap<>();
        final Set<Node<Integer>> visited = new HashSet<>();
        root.hd = 0;
        nextShortest.put(root, root);
        while (visited.size() < terminatingNode.getData() && !nextShortest.isEmpty()){
            final Node<Integer> currentMin = nextShortest.pollFirstEntry().getValue();
            visited.add(currentMin);
            currentMin.getEdges().stream()
                    .filter(edge-> edge.weight + currentMin.hd < edge.getVertex().hd)
                    .forEach(edge->{
                        Node<Integer> vertex = edge.getVertex();
                        vertex.hd = edge.weight + currentMin.hd;
                        nextShortest.put(vertex, vertex);
                    });

            if(terminatingNode.equals(currentMin)){
                break;
            }
        }

        return terminatingNode.getHd();
    }
}
