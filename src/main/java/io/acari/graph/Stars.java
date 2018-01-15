package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stars {

  /**
   * You decided to create an automatic image recognizer that will determine
   * the object in the image based on its contours. The main recognition system is
   * already implemented, and now you need to start the teaching process.
   * <p>
   * Today you want to teach your program to recognize star patterns in the
   * image of the night sky, which means that you need to implement a function that,
   * given the adjacency matrix representing a number of contours in the sky,
   * will find the number of stars in it.
   * <p>
   * The graph representing some contour is considered to be a star if it
   * is a tree of size 2 or if it is a tree of size k > 2 with
   * one internal node (which is a tree root at the same time) and k - 1 leaves.
   *
   * @param adj
   * @return
   */
  int countStars(boolean[][] adj) {
    int stars = 0;
    Set<Node> visited = new HashSet<>(adj.length);
    Map<String, Node> cityGraph = createCityGraph(adj, adj.length);
    for (Map.Entry<String, Node> stringNodeEntry : cityGraph.entrySet()) {
      Node current = stringNodeEntry.getValue();
      if (visited.add(current)) {
        if (current.neighbors.size() > 1) {
          stars += isCenter(current, visited) ? 1 : 0;
        } else if (current.neighbors.size() == 1) {
          Node next = current.neighbors.iterator().next();
          if(visited.add(next)){
            stars += isLeaf(next) ||
                isSingleStar(current, next) ||
                (next.neighbors.size() > 1 && visited.remove(current) && isCenter(next, visited)) ? 1 : 0;
            visited.add(current);
          }
        }
      }
    }

    return stars;
  }

  private boolean isSingleStar(Node current, Node next) {
    return next.neighbors.size() == 1 && next.neighbors.contains(current) && !next.equals(current);
  }

  private boolean isLeaf(Node next) {
    return next.neighbors.size() == 0;
  }

  private boolean isCenter(Node current, Set<Node> visited) {
    return current.neighbors
        .stream()
        .allMatch(n -> visited.add(n) &&
            (n.neighbors.isEmpty() || (n.neighbors.size() == 1 && n.neighbors.contains(current))));
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
