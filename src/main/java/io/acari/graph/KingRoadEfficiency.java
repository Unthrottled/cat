package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KingRoadEfficiency {

  /**
   * Once upon a time, in a kingdom far, far away, there lived a
   * king Byteasar III. As a smart and educated ruler, he did everything
   * in his (unlimited) power to make every single system of his kingdom
   * efficient. The king went down in history as a great road builder:
   * during his reign a great number of roads were built, and the road
   * system he created was the most efficient for those dark times.
   * <p>
   * When you started to learn about Byteasar's III deeds in your
   * history classes, the creeping doubt crawled into the back of
   * your mind: what if the famous king wasn't so great after all?
   * According to the most recent studies, there were n cities in the
   * Byteasar's kingdom, which were connected by the two-ways roads.
   * You managed to get information about this roads from the university
   * library, so now you can write a function that will determine whether
   * the road system in Byteasar's kingdom was efficient or not.
   * <p>
   * A road system is considered efficient if it is possible to
   * travel from any city to any other city by traversing at
   * most 2 roads.
   *
   * @param n
   * @param roads
   * @return
   */
  boolean efficientRoadNetwork(int n, int[][] roads) {
    if (n > 1) {
      Map<Integer, Node> graph = IntStream.range(0, n)
          .boxed()
          .collect(Collectors.toMap(a -> a, a -> new Node(a, n)));
      for (int[] road : roads) {
        Node cityOne = graph.get(road[0]);
        Node cityTwo = graph.get(road[1]);
        cityOne.addNeighbor(cityTwo);
        cityTwo.addNeighbor(cityOne);
      }

      return true;

    }

    return true;
  }

  class Node implements Comparable<Node> {
    final int number;
    final Set<Node> neighbors;

    public Node(int number, int cities) {
      this.number = number;
      this.neighbors = new HashSet<>(cities);
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
  }
}
