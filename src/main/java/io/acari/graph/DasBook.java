package io.acari.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DasBook {

    /**
     * You decided to create an automatic image recognizer that
     * will determine the object in the image based on its contours.
     * The main recognition system is already implemented, and
     * now you need to start the teaching process.
     * <p>
     * Today you want to teach your program to recognize book patterns,
     * which means that you need to implement a function that, given
     * the adjacency matrix representing the contour,
     * will determine whether it's a book or not.
     * <p>
     * A book consists of a base and may have any number of pages.
     * <p>
     * The book's base consists of a single edge connecting two nodes,
     * and it is a common edge for all the pages. Besides that, every page
     * has only one node connected to both sides of the base.
     *
     * @param adj
     * @return
     */
    boolean isBook(boolean[][] adj) {
        int length = adj.length;
        for (int i = 0; i < length; i++) {
            if (adj[i][i])
                return false;
        }
        Map<String, Node> cityGraph = createCityGraph(adj, length);
        List<Node> baseNodes = cityGraph.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(n -> isBaseNode(length, n))
                .collect(Collectors.toList());

        return (baseNodes.size() == 2 || baseNodes.size() == 3 && length == 3) &&
                (length == 2 || areAllPagesConnected(baseNodes.get(0), baseNodes.get(1), length));


    }

    private boolean areAllPagesConnected(Node left, Node right, int length) {
        boolean remove = left.neighbors.remove(right);
        boolean remove1 = right.neighbors.remove(left);
        if (!(remove || remove1))
            return false;

        for (Node neighbor : left.neighbors) {
            if (!right.isConnected(neighbor) || (neighbor.neighbors.size() > 2))
                return false;
        }

        return left.neighbors.size() == right.neighbors.size();
    }

    private boolean isBaseNode(int length, Node n) {
        return n.neighbors.size() == length - 1;
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
