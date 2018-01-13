package io.acari.tree.drivers;

import io.acari.tree.DSR2;
import io.acari.tree.pojo.Edge;
import io.acari.tree.pojo.Node;
import util.InputReader;
import util.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class DSR2Driver {
  public static void main(String... args) {
    InputReader in = new InputReader(System.in);
    OutputWriter out = new OutputWriter(System.out);
    int testCases = Integer.parseInt(in.readString().trim());
    for (int i = 0; i < testCases; i++) {
      Integer numNodes = Integer.valueOf(in.readString());
      Map<Integer, Node<Integer>> graph = new HashMap<>(numNodes);
      for (int j = 1; j <= numNodes; j++) {
        Integer phishes = j;
        Node<Integer> node = new Node<>(j);
        node.value = phishes;
        graph.put(j, node);
      }
      Integer numRoads = Integer.valueOf(in.readString());
      for (int kBra = 0; kBra < numRoads; kBra++) {
        Node<Integer> listNode = graph.get(Integer.valueOf(in.readString()));
        Node<Integer> listNode2 = graph.get(Integer.valueOf(in.readString()));
        Integer weight = Integer.valueOf(in.readString());
        listNode.getEdges().add(new Edge<>(weight, listNode2));
        listNode2.getEdges().add(new Edge<>(weight, listNode));
      }

      int root = Integer.parseInt(in.readString().trim());
      new DSR2().find(graph.get(root), graph)
          .forEach(s -> System.out.print(s + " "));
      out.printLine();
      out.flush();
    }
    out.close();
  }
}
