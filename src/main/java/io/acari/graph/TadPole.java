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
        .map(this::hasSingleTail)
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
    while (!queue.isEmpty()) {
      Node current = queue.pollLast();
      visited.add(current);
      for (Node neighbor : current.neighbors) {
        if (neighbor.equals(head))
          return visited.size() > 1;
        else if (!visited.contains(neighbor)) {
          queue.offer(neighbor);
        }
      }

    }
    return false;
  }

  private boolean hasSingleTail(Node head) {
    return false;
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
          "number='" + number + '\'' +
          '}';
    }
  }

}
