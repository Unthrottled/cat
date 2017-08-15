package io.acari.tree;

import java.util.LinkedList;

public class UndirectedCycleDetection {
//    Boolean isCyclic(int V, LinkedList<Integer>[] aList) {
//        int length = aList.length;
//        boolean[] visited = new boolean[length];
//        for (int i = 0; i < aList.length; i++) {
//            if (!visited[i] && isCyclicHelper(new Node(i, aList[i]), null, visited, aList)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    private boolean isCyclicHelper(Node visitingNode, Node parent, boolean[] visited, LinkedList<Integer>[] aList) {
//        int currentNodeIndex = visitingNode.data;
//        visited[currentNodeIndex] = true;
//        for (Integer edge : visitingNode.edges) {
//            boolean childIsCyclic = !visited[edge] && isCyclicHelper(new Node(edge, aList[edge]), visitingNode, visited, aList);
//            if (childIsCyclic) {
//                return true;
//            }
//
//            boolean isCyclic = visited[edge] && parent != null && edge != parent.data;
//            if (isCyclic) {
//                return true;
//            }
//        }
//        return false;
//    }

    Boolean isCyclic(int V, LinkedList<Integer>[] aList) {
        boolean visited[] = new boolean[V];
        for (int rootIndex = 0; rootIndex < V; rootIndex++) {
            if (!visited[rootIndex]){
                if (isCyclicUtil(rootIndex, visited, -1, aList)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isCyclicUtil(int v, boolean visited[], int parent, LinkedList<Integer>[] aList) {
        visited[v] = true;
        for(Integer i : aList[v]){
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v, aList)){
                    return true;
                }
            } else if (i != parent){
                return true;
            }
        }
        return false;
    }
}
