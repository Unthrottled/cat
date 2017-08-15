package io.acari.tree;

import java.util.*;

public class DirectedCycleDetection {


    public boolean hasCycle(int v, LinkedList<Integer>[] aList, boolean[] visit, boolean[] exploring) {
        for (int i = 0; i < aList.length; i++) {
            if (hasCycleUtil(i, aList, visit, exploring)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasCycleUtil(int v, LinkedList<Integer>[] aList, boolean[] visit, boolean[] exploring) {
        if (!visit[v]) {
            exploring[v] = true;
            visit[v] = true;
            for (Integer edge : aList[v]) {
                boolean childIsCyclic = !visit[edge] && hasCycleUtil(edge, aList, visit, exploring);
                boolean refsParent = exploring[edge];
                if (childIsCyclic || refsParent) {
                    return true;
                }
            }
        }

        exploring[v] = false;

        return false;
    }

    public boolean hasCycleNoRecurse(int v, LinkedList<Integer>[] aList, boolean[] visit, boolean[] explored) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> queueHash = new HashSet<>();
        Deque<Node> queue = new LinkedList<>();
        int _x = 0;
        for (List<Integer> gee : aList) {
            visited.clear();
            queueHash.clear();
            queue.clear();
            queueHash.add(_x);
            queue.offer(new Node(_x, aList[_x++]));
            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();
                int data = currentNode.data;
                visited.add(data);
                for (Integer iGuy : currentNode.edges) {
                    if (!visited.contains(iGuy)) {
                        queue.push(new Node(iGuy, aList[iGuy]));
                        queueHash.add(iGuy);
                    } else if (queueHash.contains(iGuy)) {
                        return true;
                    }
                }
                queueHash.remove(data);
            }
        }

        return false;
    }
}

class Node {
    List<Integer> edges;
    int data;

    Node(int d, List<Integer> e) {
        edges = e;
        data = d;
    }
}