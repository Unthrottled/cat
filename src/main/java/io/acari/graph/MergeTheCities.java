package io.acari.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTheCities {

    /**
     * Once upon a time, in a kingdom far, far away, there lived a
     * king Byteasar VIII. The king came down in history as a great warrior,
     * since he managed to defeat the enemy that has been capturing the
     * cities of the kingdom over more than a century. When the war
     * was over, most of the cities were almost completely destroyed,
     * and there was no way to raise them from the debris. Byteasar decided
     * to start cities renovation by merging them.
     * <p>
     * The king decided to merge each pair of cities cityi,
     * cityi+1 for i = 0, 2, 4, ... if they were connected by
     * one of the two-way roads running through the kingdom.
     * <p>
     * Initially, all information about the roads were
     * stored in the roadRegister. Your task is to return the
     * roadRegister after the merging was performed, assuming that
     * after merging the cities reindexation is done in such way that
     * city formed out of cities a and b (where a < b) receives index a,
     * and all the cities with numbers i (where i > b) get numbers i - 1.
     *
     * @param roadRegister
     * @return
     */
    boolean[][] mergingCities(boolean[][] roadRegister) {
        int length = roadRegister.length;
        Map<Integer, Node> graph = IntStream.range(0, length)
                .boxed()
                .collect(Collectors.toMap(a -> a, Node::new));
        for (int i = 0; i < length; i++) {
            Node one = graph.get(i);
            for (int j = 0; j < length; j++) {
                if (roadRegister[i][j]) {
                    Node two = graph.get(j);
                    one.addNeighbor(two);
                    two.addNeighbor(one);
                }
            }
        }


        for (int i = 0, j = 0; i < length - 1; i += 2, j++) {
            Node currentNode = graph.get(i);
            Node nextNode = graph.get(i + 1);
            if (currentNode.isConnected(nextNode)) {
                nextNode.neighbors
                        .stream()
                        .filter(n -> !currentNode.equals(n))
                        .forEach(n -> {
                            n.neighbors.remove(nextNode);
                            currentNode.addNeighbor(n);
                            n.addNeighbor(currentNode);
                        });
                IntStream.range(nextNode.number + 1, length)
                        .boxed()
                        .map(graph::get)
                        .filter(Objects::nonNull)
                        .forEach(n -> n.newIndex--);
                currentNode.neighbors.remove(nextNode);
                graph.remove(nextNode.number);
            }
        }

        int size = graph.size();
        boolean[][] newRegister = new boolean[size][size];
        for (int row = 0, j = 0; row < length; row++) {
            if (graph.containsKey(row)) {
                newRegister[j++] = buildNeighbors(graph.get(row), size);
            }
        }

        return newRegister;
    }

    private boolean[] buildNeighbors(Node currentNode, int size) {
        boolean[] connections = new boolean[size];
        currentNode.neighbors.forEach(node -> connections[node.newIndex] = true);
        return connections;
    }

    class Node implements Comparable<Node> {
        final int number;
        final Set<Node> neighbors;
        int newIndex;

        public Node(int number) {
            this.number = number;
            this.newIndex = number;
            this.neighbors = new HashSet<>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return number == node.number;
        }

        @Override
        public int hashCode() {
            return number;
        }

        boolean isConnected(Node c) {
            return neighbors.contains(c) || equals(c);
        }

        void addNeighbor(Node cityOne) {
            neighbors.add(cityOne);
        }

        @Override
        public int compareTo(Node node) {
            return number - node.number;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "number=" + number +
                    ", newIndex=" + newIndex +
                    '}';
        }
    }
}
