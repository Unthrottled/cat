package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TadPole {

    /**
     * You decided to create an automatic image recognizer that
     * will determine the object in the image based on its contours.
     * The main recognition system is already implemented, and now
     * you need to start the teaching process.
     * <p>
     * Today you want to teach your program to recognize tadpole
     * patterns, which means that you need to implement a function
     * that, given the adjacency matrix representing the contour,
     * will determine whether it's a tadpole or not.
     * <p>
     * The tadpole contour consists of two parts: a head which is
     * a cycle with n (n > 2) vertices, and a tail which is a simple
     * path (with at least one vertex) connected to the head.
     *
     * @param adj
     * @return
     */
    boolean isTadpole(boolean[][] adj) {
        int length = adj.length;
        for (int i = 0; i < length; i++) {
            if (adj[i][i])
                return false;
        }
        return findHeadNode(createCityGraph(adj))
                .map(node -> hasSingleTail(node, length))
                .orElse(false);
    }

    private Optional<Node> findHeadNode(Map<Integer, Node> cityGraph) {
        return cityGraph.entrySet().stream().map(Map.Entry::getValue)
                .filter(this::hasCycle)
                .findFirst();
    }

    private boolean hasCycle(Node head) {
        Set<Node> visited = new HashSet<>();
        Deque<Node> queue = new LinkedList<>();
        queue.offer(head);
        head.depth = 0;
        while (!queue.isEmpty()) {
            Node current = queue.pollLast();
            visited.add(current);
            for (Node neighbor : current.neighbors) {
                if (neighbor.depth == 0 && current.depth > 1)
                    return true;
                else if (!visited.contains(neighbor)) {
                    neighbor.depth = current.depth + 1;
                    queue.offer(neighbor);
                }
            }
        }
        return false;
    }

    private boolean hasSingleTail(Node head, int length) {
        List<Node> nodesWithThreeConnections = findThreeConnections(head);
        if (nodesWithThreeConnections.size() == 1) {
            Node node = nodesWithThreeConnections.get(0);
            for (Node neighbor : node.neighbors) {
                if (!hasCycle(neighbor)) {
                    return true;
                }
            }

        }
        return false;
    }

    private List<Node> findThreeConnections(Node head) {
        Set<Node> visited = new HashSet<>();
        Deque<Node> queue = new LinkedList<>();
        LinkedList<Node> nodesWithThreeConnections = new LinkedList<>();
        queue.offer(head);
        head.depth = 0;
        while (!queue.isEmpty()) {
            Node current = queue.pollLast();
            if (current.neighbors.size() > 2)
                nodesWithThreeConnections.offer(current);
            visited.add(current);
            for (Node neighbor : current.neighbors) {
                if (neighbor.depth == 0 && current.depth > 1)
                    return nodesWithThreeConnections;
                else if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }
        return nodesWithThreeConnections;
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
        int depth = -1;

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
                    "number='" + number + '\'' +
                    '}';
        }
    }

}
