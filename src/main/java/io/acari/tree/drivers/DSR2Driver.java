package io.acari.tree.drivers;

import io.acari.tree.DSR2;
import io.acari.tree.pojo.Edge;
import io.acari.tree.pojo.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DSR2Driver {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine().trim());
        for (int i = 0; i < testCases; i++) {
            String[] line = in.nextLine().split(" ");
            Integer numNodes = Integer.valueOf(line[0]);
            Map<Integer, Node<Integer>> graph = new HashMap<>(numNodes);
            for (int j = 1; j <= numNodes; j++) {
                Integer phishes = j;
                Node<Integer> node = new Node<>(j);
                node.value = phishes;
                graph.put(j, node);
            }
            Integer numRoads = Integer.valueOf(line[1]);
            for (int kBra = 0; kBra < numRoads; kBra++) {
                String[] roadz = in.nextLine().split(" ");
                Integer weight = Integer.valueOf(roadz[2]);
                Node<Integer> listNode = graph.get(Integer.valueOf(roadz[0]));
                Node<Integer> listNode2 = graph.get(Integer.valueOf(roadz[1]));
                listNode.getEdges().add(new Edge<>(weight, listNode2));
                listNode2.getEdges().add(new Edge<>(weight, listNode));
            }

            int root = Integer.parseInt(in.nextLine().trim());
            System.out.println(new DSR2().find(graph.get(root), numNodes).collect(Collectors.joining(" ")));
        }
        in.close();
    }
}
