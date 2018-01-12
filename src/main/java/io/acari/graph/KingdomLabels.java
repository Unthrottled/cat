package io.acari.graph;

import java.util.*;

public class KingdomLabels {

  /**
   * Once upon a time, in a kingdom far, far away, there
   * lived a king Byteasar V. His predecessor, king Byteasar IV,
   * lived quite a long life, and when Byteasar V finally
   * ascended the throne, he was already 150 years old.
   * The new king had been preparing all his life for his
   * moment of glory and, scared that he wouldn't have enough
   * time to shine, started his reforms right away. T
   * he first (and, as it turned out, the last) royal decree,
   * issued within a couple of days after the coronation, ordered
   * the following: all the road in the kingdom were to be named.
   * <p>
   * Unfortunately the king didn't have enough time to come up
   * with actual names, so all the roads were to be names with
   * numbers from 0 to roads.length - 1. As a born strategist,
   * Byteasar wanted to make sure that the maps of his kingdom
   * were confusing to enemies, which is why the road names were
   * to be chosen so that no two roads with the neighboring names
   * (i.e. names i and i + 1 for some i) would have a common end
   * at one of the cities.
   * <p>
   * The archicartographer came up with the names for the roads,
   * but he was not sure if the constraint the king imposed was met.
   * He asked the Greater Power to help him check it.
   * As a Greater Power from the future, you are the one
   * who can help with that. Given the names for the roads the
   * archicartographer came up with, check that no two roads with
   * the neighboring names have a common end.
   *
   * @param roads
   * @return
   */
  boolean namingRoads(int[][] roads) {
    int citieRoads = roads.length;
    if (citieRoads > 1) {
      Map<Integer, Node> graph = new HashMap<>();
      for (int[] road : roads) {
        int nodeOne = road[0];
        Node cityOne = graph.getOrDefault(nodeOne, new Node(nodeOne));
        int nodeTwo = road[1];
        Node cityTwo = graph.getOrDefault(nodeTwo, new Node(nodeTwo));
        int roadName = road[2];
        cityOne.addNeighbor(cityTwo, roadName);
        cityTwo.addNeighbor(cityOne, roadName);
        graph.put(nodeOne, cityOne);
        graph.put(nodeTwo, cityTwo);
      }

      Set<Node> visited = new HashSet<>();
      Queue<Node> queue = new LinkedList<>();
      queue.offer(graph.entrySet().iterator().next().getValue());
      while (!queue.isEmpty()) {
        Node poll = queue.poll();
        if (hasValidRoads(poll)) {
          poll.neighbors.stream()
              .map(Edge::getNode)
              .filter(visited::add)
              .forEach(queue::offer);
        } else {
          return false;
        }
      }
    }
    return true;
  }

  private boolean hasValidRoads(Node poll) {
    List<Edge> neighbors = poll.neighbors;
    for (int i = 0; i < neighbors.size(); i++) {
      Edge edge = neighbors.get(i);
      for (int j = i + 1; j < neighbors.size(); j++) {
        Edge edge1 = neighbors.get(j);
        if (Math.abs(edge.name - edge1.name) < 2)
          return false;
      }
    }
    return true;
  }

  class Edge {
    final Node fst;
    final int name;

    Edge(Node var1, int name) {
      this.fst = var1;
      this.name = name;
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

    void addNeighbor(Node cityOne, int name) {
      neighbors.add(new Edge(cityOne, name));
    }

    @Override
    public int compareTo(Node node) {
      return number - node.number;
    }
  }
}
