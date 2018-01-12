package io.acari.graph;

import java.util.HashSet;
import java.util.Set;

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
    return false;
  }

  static class Edge implements Comparable<Edge> {
    final Node fst;
    final Node snd;
    final int name;

    Edge(Node var1, Node var2, int name) {
      this.fst = var1;
      this.snd = var2;
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Edge edge = (Edge) o;

      if (!fst.equals(edge.fst)) return false;
      return snd.equals(edge.snd);
    }

    @Override
    public int hashCode() {
      int result = fst.hashCode();
      result = 31 * result + snd.hashCode();
      return result;
    }

    @Override
    public int compareTo(Edge edge) {
      int i = getSmallest().compareTo(edge.getSmallest());
      return i == 0 ? getLargest().compareTo(edge.getLargest()) : i;
    }

    private Node getSmallest(){
      return fst.compareTo(snd) < 0 ? fst : snd;
    }

    private Node getLargest(){
      return fst.compareTo(snd) > 0 ? fst : snd;
    }
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
