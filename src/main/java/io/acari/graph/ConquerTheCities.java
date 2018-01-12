package io.acari.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConquerTheCities {

  /**
   * Once upon a time, in a kingdom far, far away, there lived
   * a king Byteasar VII. He reigned during the Dark Times, so
   * very little is known about those times. It is known that
   * when he ascended the throne, there were n cities in the
   * kingdom, connected by several two-way roads. But before the
   * young king managed to start ruling, the enemy came to the gates:
   * the evil emperor Bugoleon invaded the kingdom and started to
   * conquer the cities day after day.
   * <p>
   * It is not known how long it took to capture each of
   * the cities, but you've recently discovered an ancient
   * chronicle saying that each day Bugoleon captured all the
   * cities that had at most 1 neighboring free city at the moment.
   * Knowing this fact, the number of cities n and all the roads of
   * the kingdom, determine in how many days each of the cities was
   * conquered.
   *
   * @param n
   * @param roads
   * @return
   */
  int[] citiesConquering(int n, int[][] roads) {
    Map<Integer, Node> graph = new HashMap<>();
    for (int[] road : roads) {
      int nodeOne = road[0];
      Node cityOne = graph.getOrDefault(nodeOne, new Node(nodeOne));
      int nodeTwo = road[1];
      Node cityTwo = graph.getOrDefault(nodeTwo, new Node(nodeTwo));
      cityOne.addNeighbor(cityTwo);
      cityTwo.addNeighbor(cityOne);
      graph.put(nodeOne, cityOne);
      graph.put(nodeTwo, cityTwo);
    }

    int[] conquered = new int[n];
    return conquered;
  }

  class Edge {
    final Node fst;

    Edge(Node var1) {
      this.fst = var1;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Edge edge = (Edge) o;

      return fst.equals(edge.fst);
    }

    @Override
    public int hashCode() {
      return fst.hashCode();
    }

    public Node getNode() {
      return fst;
    }

  }

  class Node implements Comparable<Node> {
    final int number;
    final List<Edge> neighbors;

    public Node(int number) {
      this.number = number;
      this.neighbors = new ArrayList<>();
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
      neighbors.add(new Edge(cityOne));
    }

    @Override
    public int compareTo(Node node) {
      return number - node.number;
    }
  }
}
