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
    Map<Integer, Node> tempNodeGraph = new HashMap<>();
    Map<Integer, Node> orderedGraph = giveNewNames(
        createGraph(roadRegister, length).entrySet()
            .stream()
            .map(Map.Entry::getValue)
            .flatMap(cityNode -> cityNode.neighbors
                .stream()
                .map(cityNode2 -> {
                  int number = cityNode.number + cityNode2.number;
                  Node streetNode = tempNodeGraph.getOrDefault(number, new Node(number));
                  addNeighbors(tempNodeGraph, cityNode, streetNode);
                  addNeighbors(tempNodeGraph, cityNode2, streetNode);
                  return streetNode;
                }))
            .collect(Collectors.toMap(a -> a.number, a -> a, (a, b) -> a, TreeMap::new)));
    int size = orderedGraph.size();
    boolean[][] newRoadRegister = new boolean[size][size];
    for (int i = 0; i < orderedGraph.size(); i++) {
      newRoadRegister[i] = buildNeighbors(orderedGraph.get(i), size);

    }

    return newRoadRegister;
  }

  private void addNeighbors(Map<Integer, Node> tempNodeGraph, Node cityNode2, Node streetNode) {
    cityNode2.neighbors
        .forEach(otherCityNode->{
          int naoeu = cityNode2.number + otherCityNode.number;
          Node neighborStreetNode = tempNodeGraph.getOrDefault(naoeu, new Node(naoeu));
          neighborStreetNode.addNeighbor(streetNode);
          streetNode.addNeighbor(neighborStreetNode);
        });
  }

  private Map<Integer, Node> giveNewNames(SortedMap<Integer, Node> edgeGraph) {
    int index = 0;
    HashMap<Integer, Node> newGuy = new HashMap<>(edgeGraph.size());
    for (Map.Entry<Integer, Node> integerNodeEntry : edgeGraph.entrySet()) {
      int k = index++;
      Node value = integerNodeEntry.getValue();
      newGuy.put(k, value);
      value.newIndex = k;
    }
    return newGuy;
  }

  private boolean[] buildNeighbors(Node currentNode, int size) {
    boolean[] connections = new boolean[size];
    currentNode.neighbors.forEach(node -> connections[node.newIndex] = true);
    return connections;
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
    int newIndex;

    public Node(int number) {
      this.number = number;
      newIndex = number;
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
