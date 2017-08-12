package io.acari.tree;

import java.util.*;

public class CycleDetection {


    public boolean hasCycle(int v, LinkedList<Integer>[] aList, boolean[] visit, boolean[] exploring) {
        if (!visit[v]) {
            visit[v] = true;

            for (Integer integer : aList[v]) {
                if (hasCycle(integer, aList, visit, exploring) || exploring[integer]) {
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

    Boolean isCyclic(int V, LinkedList<Integer>[] alist) {
        Set<Integer> visited = new HashSet<>();
        Deque<Node> queue = new LinkedList<>();
        int _x = 0;
        for (List<Integer> gee : alist) {
            visited.clear();
            queue.clear();
            queue.offer(new Node(_x, alist[_x++]));
            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();
                int currentNodeData = currentNode.data;
                visited.add(currentNodeData);
                for (Integer iGuy : currentNode.edges) {
                    LinkedList<Integer> iGuyEdges = alist[iGuy];
                    if (!visited.contains(iGuy)) {
                        queue.push(new Node(iGuy, iGuyEdges));
                    } else {
                        if (iGuyEdges.stream().anyMatch(a -> a == currentNodeData)) {
                            return true;
                        }
                    }
                }
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
