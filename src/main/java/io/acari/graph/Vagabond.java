package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Vagabond {

  /**
   * In a kingdom far, far away, there lives a king Byteasar IX.
   * The history of the kingdom is rich with events and actions,
   * most of which has something to do with the cities of that kingdom.
   * King Byteasar doesn't want to go down in history, and, most of all,
   * he doesn't want to have anything to do with the cities of the kingdom.
   * Cities are lame!
   * <p>
   * Instead, king Byteasar wants to focus on the roads,
   * which is why he issued a new decree: from now on, all roads are
   * considered to be cities, and all cities are considered to be roads.
   * Now his gratefuller subjects pack their livings and move out from
   * the cities to the roads, and the cartographers are busy with building
   * a new roadRegister of the kingdom. All roads of the kingdom are to be
   * named by the cities they connect (i.e. [city1, city2], city1 < city2),
   * sorted lexicographically and enumerated starting from 0.
   * A new road register for such a system should be created.
   * <p>
   * Your task is to help the cartographers with building the new
   * road register. Handle the challenge, and the glorious kingdom of
   * Byteasar IX will never have to deal with the tasks related to cities
   * ever again!
   *
   * @param roadRegister
   * @return
   */
  boolean[][] livingOnTheRoads(boolean[][] roadRegister) {
    int length = roadRegister.length;
    Map<Integer, Node> graph = createGraph(roadRegister, length);
    SortedSet<Edge> edges = createEdgeGraph(graph);


    return roadRegister;
  }

  private SortedSet<Edge> createEdgeGraph(Map<Integer, Node> graph1) {
    Map<Node, List<Edge>> graphy = graph1.entrySet()
        .stream()
        .map(Map.Entry::getValue)
        .flatMap(n -> n.neighbors.stream()
            .map(n1 -> new Edge(n, n1))
            .map(e -> new Pair<>(n, e)))
        .collect(Collectors.groupingBy(Pair::getKey, Collectors.mapping(Pair::getValue, Collectors.toList())));

    return null;
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

  class Pair<A, B> {
    public final A fst;
    public final B snd;

    public Pair(A var1, B var2) {
      this.fst = var1;
      this.snd = var2;
    }

    public  A getKey(){
      return fst;
    }

    public B getValue(){
      return snd;
    }
  }



  class Edge implements Comparable<Edge> {
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
      int result = getSmallest().hashCode();
      result = 31 * result + getLargest().hashCode();
      return result;
    }

    @Override
    public int compareTo(Edge edge) {
      int i = getSmallest().compareTo(edge.getSmallest());
      return i == 0 ? getLargest().compareTo(edge.getLargest()) : i;
    }

    private Node getSmallest() {
      return fst.compareTo(snd) < 0 ? fst : snd;
    }

    private Node getLargest() {
      return fst.compareTo(snd) > 0 ? fst : snd;
    }
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
