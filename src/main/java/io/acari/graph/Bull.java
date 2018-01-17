package io.acari.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bull {

  /**
   * You decided to create an automatic image recognizer that will
   * determine the object in the image based on its contours. The main
   * recognition system is already implemented, and now
   * you need to start the teaching process.
   *
   * Today you want to teach your program to recognize bull
   * patterns, which means that you need to implement a function
   * that, given the adjacency matrix representing the contour, will
   * determine whether it's a bull or not.
   *
   * You noticed that although all bull heads are similar
   * there is some variation in the shapes of their horns, so there
   * are several possible bull contours. The image below shows all such contours.
   *
   * @param adj
   * @return
   */
  boolean isBull(boolean[][] adj) {
    return false;
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
