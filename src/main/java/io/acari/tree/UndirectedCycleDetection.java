package io.acari.tree;

import java.util.LinkedList;

public class UndirectedCycleDetection {
    Boolean isCyclic(int V, LinkedList<Integer>[] aList) {
        int length = aList.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < aList.length; i++) {
            if (isCyclicHelper(new Node(i, aList[i]), null, visited, aList)) {
                return true;
            }
        }

        return false;
    }

    private boolean isCyclicHelper(Node visitingNode, Node parent, boolean[] visited, LinkedList<Integer>[] aList) {
        int currentNodeIndex = visitingNode.data;
        if(!visited[currentNodeIndex]){
            visited[currentNodeIndex] = true;
            for (Integer edge : visitingNode.edges) {
                boolean childIsCyclic = !visited[edge] && isCyclicHelper(new Node(edge, aList[edge]), visitingNode, visited, aList);
                if (childIsCyclic) {
                    return true;
                }

                boolean isCyclic = visited[edge] && parent != null && edge != parent.data;
                if (isCyclic) {
                    return true;
                }

            }
        }


        return false;
    }
}
