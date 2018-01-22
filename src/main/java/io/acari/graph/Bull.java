package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bull {

    /**
     * You decided to create an automatic image recognizer that will
     * determine the object in the image based on its contours. The main
     * recognition system is already implemented, and now
     * you need to start the teaching process.
     * <p>
     * Today you want to teach your program to recognize bull
     * patterns, which means that you need to implement a function
     * that, given the adjacency matrix representing the contour, will
     * determine whether it's a bull or not.
     * <p>
     * You noticed that although all bull heads are similar
     * there is some variation in the shapes of their horns, so there
     * are several possible bull contours. The image below shows all such contours.
     *
     * @param adj
     * @return
     */
    boolean isBull(boolean[][] adj) {
        int length = adj.length;
        for (int i = 0; i < length; i++) {
            if (adj[i][i])
                return false;
        }

        Map<Integer, Node> cityGraph = createCityGraph(adj);
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.offer(cityGraph.get(0));
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            visited.add(current);
            if (isPartOfHead(current)) {
                return hasHorns(current);
            } else {
                current.neighbors.stream()
                        .filter(n -> !visited.contains(n))
                        .forEach(queue::offer);
            }
        }

        return false;
    }

    private boolean hasHorns(Node current) {
        return hasSingleLongHorn(current) ^ hasTwoHorns(current);
    }

    private boolean hasSingleLongHorn(Node current) {
        for (Node neighbor : current.neighbors) {
            for (Node otherNeighbor : neighbor.neighbors) {
                if (otherNeighbor.isConnected(current) && !otherNeighbor.equals(current)) {
                    long singleHorns =
                            countTwoLengthHorns(otherNeighbor, current, neighbor) +
                                    countTwoLengthHorns(current, otherNeighbor, neighbor) +
                                    countTwoLengthHorns(current, neighbor, otherNeighbor);
                    return singleHorns == 1;
                }
            }
        }

        return false;
    }

    private boolean hasTwoHorns(Node current) {
        for (Node neighbor : current.neighbors) {
            for (Node otherNeighbor : neighbor.neighbors) {
                if (otherNeighbor.isConnected(current) && !otherNeighbor.equals(current)) {
                    long singleHorns =
                            countOneLengthHorns(otherNeighbor, current, neighbor) +
                                    countOneLengthHorns(current, otherNeighbor, neighbor) +
                                    countOneLengthHorns(current, neighbor, otherNeighbor);
                    return singleHorns == 2;
                }
            }
        }

        return false;
    }

    private long countOneLengthHorns(Node current, Node neighbor, Node otherNeighbor) {
        return neighbor.neighbors.stream()
                .filter(n -> !current.equals(n))
                .filter(n -> !otherNeighbor.equals(n))
                .filter(n -> n.neighbors.size() == 1)
                .filter(n -> n.neighbors.contains(neighbor))
                .count();
    }

    private long countTwoLengthHorns(Node current, Node neighbor, Node otherNeighbor) {
        return neighbor.neighbors.stream()
                .filter(n -> !current.equals(n))
                .filter(n -> !otherNeighbor.equals(n))
                .filter(n -> n.neighbors.size() == 2)
                .filter(n -> n.neighbors.contains(neighbor))
                .filter(n -> !n.neighbors.contains(otherNeighbor))
                .filter(n -> !n.neighbors.contains(current))
                .count();
    }

    private boolean isPartOfHead(Node current) {
        return current.neighbors.stream()
                .filter(neighbor -> neighbor.neighbors.stream()
                        .filter(otherNeighbor -> !otherNeighbor.equals(current))
                        .filter(otherNeighbor -> otherNeighbor.isConnected(current))
                        .count() == 1)
                .count() == 2;
    }

    private Map<Integer, Node> createCityGraph(boolean[][] roadRegister) {
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
                }
            }
        }
        return graph;
    }

    class Node {
        final Integer number;
        final Set<Node> neighbors;

        public Node(Integer number) {
            this.number = number;
            this.neighbors = new HashSet<>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return number.equals(node.number);
        }

        @Override
        public int hashCode() {
            return number.hashCode();
        }

        boolean isConnected(Node c) {
            return neighbors.contains(c) || equals(c);
        }

        void addNeighbor(Node cityOne) {
            neighbors.add(cityOne);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "number = '" + number + '\'' +
                    '}';
        }
    }
}
