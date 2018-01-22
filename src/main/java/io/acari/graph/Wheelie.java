package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Wheelie {

    /**
     * You decided to create an automatic image recognizer
     * that will determine the object in the image based on its contours.
     * The main recognition system is already implemented,
     * and now you need to start the teaching process.
     * <p>
     * Today you want to teach your program to recognize wheel patterns,
     * which means that you need to implement a function that,
     * given the adjacency matrix representing the contour,
     * will determine whether it's a wheel or not.
     * <p>
     * The wheel contour can be thought of as a single center vertex
     * and a regular polygon with n (n > 2) vertices
     * which are all connected to the center.
     *
     * @param adj
     * @return
     */
    boolean isWheel(boolean[][] adj) {
        for (int i = 0; i < adj.length; i++) {
            if (adj[i][i])
                return false;
        }
        int length = adj.length;
        Map<String, Node> cityGraph = createCityGraph(adj, length);
        Node entryPoint = cityGraph.entrySet().iterator().next().getValue();//wowwwwwwwww
        if (isCenter(length, entryPoint)) {
            return areSpokesConnected(entryPoint.neighbors.iterator().next(), length);
        } else if (entryPoint.neighbors.size() == 3) {//center, left, and right connections
            return hasCenter(entryPoint, length) && areSpokesConnected(entryPoint, length);
        }
        return false;
    }

    private boolean hasCenter(Node entryPoint, int length) {
        return entryPoint.neighbors.stream()
                .filter(n -> isCenter(length, n))
                .count() == 1;
    }

    private boolean isCenter(int length, Node entryPoint) {
        return entryPoint.neighbors.size() == length - 1;
    }

    private boolean areSpokesConnected(Node edgeNode, int length) {
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(edgeNode);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.neighbors.size() != 3)//center, left, and right connections
                return false;

            visited.add(current);
            boolean notLinkedToCenter = true;
            for (Node neighbor : current.neighbors) {
                if (isCenter(length, neighbor)) {
                    visited.add(neighbor);
                    notLinkedToCenter = false;
                } else if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                }
            }

            if (notLinkedToCenter)
                return false;
        }
        return visited.size() == length;
    }

    private Map<String, Node> createCityGraph(boolean[][] roadRegister, int length) {
        Map<String, Node> graph = IntStream.range(0, length)
                .boxed()
                .map(Object::toString)
                .collect(Collectors.toMap(a -> a, Node::new));
        for (int i = 0; i < length; i++) {
            Node one = graph.get(String.valueOf(i));
            for (int j = 0; j < length; j++) {
                if (roadRegister[i][j]) {
                    Node two = graph.get(String.valueOf(j));
                    one.addNeighbor(two);
                    two.addNeighbor(one);
                }
            }
        }
        return graph;
    }

    class Node {
        final String number;
        final Set<Node> neighbors;

        public Node(String number) {
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

        void addNeighbor(Node cityOne) {
            neighbors.add(cityOne);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "number='" + number + '\'' +
                    '}';
        }
    }
}
