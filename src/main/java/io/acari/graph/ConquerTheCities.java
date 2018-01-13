package io.acari.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    Map<Integer, Node> graph = IntStream.range(0, n)
        .boxed()
        .collect(Collectors.toMap(a -> a, Node::new));

    for (int[] road : roads) {
      int nodeOne = road[0];
      Node cityOne = graph.get(nodeOne);
      int nodeTwo = road[1];
      Node cityTwo = graph.get(nodeTwo);
      cityOne.addNeighbor(cityTwo);
      cityTwo.addNeighbor(cityOne);
      graph.put(nodeOne, cityOne);
      graph.put(nodeTwo, cityTwo);
    }

    final java.util.concurrent.atomic.AtomicInteger citiesConquered = new java.util.concurrent.atomic.AtomicInteger(0);
    final java.util.concurrent.atomic.AtomicInteger day = new java.util.concurrent.atomic.AtomicInteger(1);
    do {
      citiesConquered.getAndSet(0);
      Set<Node> visited = new HashSet<>(n);
      IntStream.range(0, n)
          .boxed()
          .map(graph::get)
          .filter(no -> !visited.contains(no))
          .filter(no -> !no.conquered)
          .forEach(node -> {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(node);
            while (!queue.isEmpty()) {
              Node currentNode = queue.poll();
              if (visited.add(currentNode)) {
                if (canConquer(currentNode, day.get())) {
                  citiesConquered.getAndIncrement();
                  currentNode.conquered = true;
                  currentNode.dayConqured = day.get();
                }
                currentNode.fetchNeighbors()
                    .filter(node1 -> !node1.conquered)
                    .filter(node1 -> !visited.contains(node1))
                    .forEach(queue::offer);
              }
            }
          });
      day.getAndIncrement();
    } while (citiesConquered.get() > 0);

    int[] conquered = new int[n];
    IntStream.range(0, n)
        .boxed()
        .forEach(i -> conquered[i] = graph.get(i).dayConqured);
    return conquered;
  }

  private boolean canConquer(Node poll, int i) {
    return poll.fetchNeighbors()

        .filter(n -> !n.conquered || n.dayConqured == i)
        .count() < 2;
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
    boolean conquered = false;
    int dayConqured = -1;

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

    @Override
    public String toString() {
      return "Node{" +
          "number=" + number +
          '}';
    }

    void addNeighbor(Node cityOne) {
      neighbors.add(new Edge(cityOne));
    }

    Stream<Node> fetchNeighbors() {
      return neighbors.stream().map(Edge::getNode);
    }

    @Override
    public int compareTo(Node node) {
      return number - node.number;
    }
  }
}
