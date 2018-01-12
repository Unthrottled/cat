package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RoadsForTheKing {

  /**
   * Once upon a time, in a kingdom far, far away, there
   * lived a king Byteasar II. There was nothing special
   * neither about him, nor about his kingdom. As a mediocre
   * ruler, he did nothing about his kingdom and preferred
   * hunting and feasting over doing anything about his
   * kingdom prosperity.
   * <p>
   * Luckily, his adviser, wise magician Bitlin, was working
   * for the kingdom welfare daily and nightly. However, since
   * there was no one to advise him, he completely forgot about
   * one important thing: the roads. Over the years most of the
   * two-way roads built by Byteasar II predecessors were forgotten
   * and no longer traversable. Only a few roads can still be used.
   * <p>
   * Bitlin wanted each pair of cities to be connected, but couldn't
   * find a way to figure out which roads are missing. Desperate, he
   * turned to his magic crystal, seeking help. The crystal showed him
   * a programmer from the distant future: you! Now you're the only one
   * who can save the kingdom. Given the existing roads and the number
   * of cities in the kingdom, you should use the most modern
   * technologies and find out what roads should be built again to
   * make each pair of cities connected. Since the magic crystal is
   * quite old and meticulous, it will only transfer the information
   * that is sorted properly.
   * <p>
   * The roads to be built should be returned in an array
   * sorted lexicographically,
   * with each road stored as [cityi, cityj], where cityi < cityj.
   *
   * @param cities
   * @param roads
   * @return
   */
  int[][] roadsBuilding(int cities, int[][] roads) {
    if (cities > 1) {
      Map<Integer, Node> graph = IntStream.range(0, cities)
          .boxed()
          .collect(Collectors.toMap(a -> a, a -> new Node(a, cities)));
      for (int[] road : roads) {
        Node cityOne = graph.get(road[0]);
        Node cityTwo = graph.get(road[1]);
        cityOne.addNeighbor(cityTwo);
        cityTwo.addNeighbor(cityOne);
      }

      SortedSet<Edge> newRoads =
          IntStream.range(0, cities)
              .boxed()
              .flatMap(city -> {
                Node cityNode = graph.get(city);
                return IntStream.range(0, cities)
                    .boxed()
                    .map(graph::get)
                    .filter(Objects::nonNull)
                    .filter(c -> !cityNode.isConnected(c))
                    .map(c -> new Edge(cityNode, c));
              })
              .collect(Collectors.toCollection(TreeSet::new));

      int[][] brandNewRoads = new int[newRoads.size()][];
      int index = 0;
      for (Edge newRoad : newRoads) {
        brandNewRoads[index++] = new int[]{newRoad.fst.number, newRoad.snd.number};
      }
      return brandNewRoads;

    }
    return roads;
  }

  static class Edge implements Comparable<Edge> {
    final Node fst;
    final Node snd;

    Edge(Node var1, Node var2) {
      this.fst = var1;
      this.snd = var2;
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
