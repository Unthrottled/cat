package io.acari.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Butterflies {

  /**
   * You decided to create an automatic image recognizer
   * that will determine the object in the image based on its contours.
   * The main recognition system is already implemented, and now you need
   * to start the teaching process.
   * <p>
   * Today you want to teach your program to recognize butterfly patterns,
   * which means that you need to implement a function that, given the
   * adjacency matrix representing the contour, will determine whether it's a butterfly or not.
   * <p>
   * The butterfly contour looks like this:
   * <p>
   * <img src="https://codefightsuserpics.s3.amazonaws.com/tasks/isButterfly/img/butterfly.png?_tm=1495120253756"/>
   * <p>
   * Given the object's contour as an undirected graph
   * represented by adjacency matrix adj determine whether it's a butterfly or not.
   *
   * @param adj
   * @return
   */
  boolean isButterfly(boolean[][] adj) {
    Map<Integer, Node> graph = createGraph(adj, adj.length);
    for (Node node : graph.values()) {
      if (node.neighbors.size() == 4)
        return isValid(node);
    }

    return false;
  }

  private boolean isValid(Node node) {
    Set<Node> visited = new HashSet<>();
    visited.add(node);
    int wings = 0;
    for (Node neighbor : node.neighbors) {
      if (visited.add(neighbor)) {
        wings += isWing(neighbor, visited, node) ? 1 : 0;
      }
    }

    return wings == 2;
  }

  private boolean isWing(Node neighbor, Set<Node> visited, Node center) {
    Set<Node> neighbors = neighbor.neighbors;
    if (neighbors.size() == 2) {
      for (Node node : neighbors) {
        if (!center.equals(node) && visited.add(node)) {
          Set<Node> otherNeighbor = node.neighbors;
          return otherNeighbor.size() == 2 &&
              otherNeighbor.contains(center) && otherNeighbor.contains(neighbor);
        }
      }
    }
    return false;
  }

  private Map<Integer, Node> createGraph(boolean[][] roadRegister, int length) {
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
    return graph;
  }

  class Node implements Comparable<Node> {
    final int number;
    final Set<Node> neighbors;

    public Node(int number) {
      this.number = number;
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

    void addNeighbor(Node cityOne) {
      neighbors.add(cityOne);
    }

    @Override
    public int compareTo(Node node) {
      return number - node.number;
    }
  }
}
