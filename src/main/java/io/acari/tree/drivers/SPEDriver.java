package io.acari.tree.drivers;

import io.acari.tree.ShortestPathToEndDijkstra;
import io.acari.tree.pojo.Edge;
import io.acari.tree.pojo.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SPEDriver {

    public static void main(String[] butts) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        ShortestPathToEndDijkstra steve = new ShortestPathToEndDijkstra();
        for (int i = 0; i < testCases; i++) {
            Map<Integer, Node<Integer>> graph = buildGraph(in.nextInt());
            System.out.println(steve.find(graph.get(1), graph.get(graph.size())));
        }
    }

    private static Map<Integer, Node<Integer>> buildGraph(int i) {
        HashMap<Integer, Node<Integer>> graph = new HashMap<>(i);
        for (int j = 1; j <= i; j++) {
            Node<Integer> currentNode = graph.getOrDefault(j, new Node<>(j));
            graph.put(j, currentNode);
            int edgeOne = j + 1;
            if (edgeOne <= i) {
                createNode(graph, currentNode, edgeOne);
            }

            int edgeTwo = j * 3;
            if (edgeTwo <= i) {
                createNode(graph, currentNode, edgeTwo);
            }
        }

        return graph;
    }

    private static void createNode(HashMap<Integer, Node<Integer>> graph, Node<Integer> currentNode, int edgeTwo) {
        Node<Integer> edgeGuy = graph.getOrDefault(edgeTwo, new Node<>(edgeTwo));
        addEdge(currentNode, edgeGuy);
        graph.put(edgeTwo, edgeGuy);
    }

    private static void addEdge(Node<Integer> currentNode, Node<Integer> edgeNode) {
        currentNode.getEdges().add(new Edge<>(1, edgeNode));
        edgeNode.getEdges().add(new Edge<>(1, currentNode));
    }
}
