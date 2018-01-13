package io.acari.tree.drivers;

import io.acari.tree.SyncroShopping;
import io.acari.tree.pojo.Edge;
import io.acari.tree.pojo.Node;

import java.util.*;
import java.util.stream.Collectors;

public class SyncroDriver {

  public static void main(String... args) {
    Scanner in = new Scanner(System.in);
    String[] line = in.nextLine().split(" ");
    Integer numNodes = Integer.valueOf(line[0]);
    Map<Integer, Node<List<Integer>>> graph = new HashMap<>(numNodes);
    Integer typesFish = Integer.valueOf(line[2]);
    for (int i = 1; i <= typesFish; i++) {
      List<Integer> phishes = Arrays.stream(in.nextLine().split(" "))
          .skip(1)
          .map(Integer::valueOf)
          .collect(Collectors.toList());
      Node<List<Integer>> node = new Node<>(i);
      node.value = phishes;
      graph.put(i, node);
    }

    Integer numRoads = Integer.valueOf(line[1]);
    for (int i = 0; i < numRoads; i++) {
      String[] roadz = in.nextLine().split(" ");
      Integer weight = Integer.valueOf(roadz[2]);
      Node<List<Integer>> listNode = graph.get(Integer.valueOf(roadz[0]));
      Node<List<Integer>> listNode2 = graph.get(Integer.valueOf(roadz[1]));
      listNode.getEdges().add(new Edge<>(weight, listNode2));
      listNode2.getEdges().add(new Edge<>(weight, listNode));
    }

    System.out.println(new SyncroShopping().find(graph.get(1), numNodes));
    in.close();
  }
}
