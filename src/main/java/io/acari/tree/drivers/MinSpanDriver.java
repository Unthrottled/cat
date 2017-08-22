package io.acari.tree.drivers;

import io.acari.tree.DSR2;
import io.acari.tree.MinSpanTree;
import io.acari.tree.pojo.Edge;
import io.acari.tree.pojo.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinSpanDriver {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine().trim());
        MinSpanTree steve = new MinSpanTree();
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
            String[] roadz = in.nextLine().split(" ");
            int cap = numRoads - 2;
            for (int kBra = 0; kBra < cap; kBra+=3) {
                Integer weight = Integer.valueOf(roadz[kBra + 2]);
                Node<Integer> listNode = graph.get(Integer.valueOf(roadz[kBra]));
                Node<Integer> listNode2 = graph.get(Integer.valueOf(roadz[kBra + 1]));
                listNode.getEdges().add(new Edge<>(weight, listNode2));
                listNode2.getEdges().add(new Edge<>(weight, listNode));
            }
            System.out.println(steve.find(graph));
        }
        in.close();
    }
}
