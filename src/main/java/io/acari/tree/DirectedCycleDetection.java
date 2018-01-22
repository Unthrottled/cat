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
        Deque<Butt> queue = new LinkedList<>();
        int _x = 0;
        for (List<Integer> gee : aList) {
            visited.clear();
            queueHash.clear();
            queue.clear();
            queueHash.add(_x);
            queue.offer(new Butt(_x, aList[_x++]));
            while (!queue.isEmpty()) {
                Butt currentButt = queue.poll();
                int data = currentButt.data;
                visited.add(data);
                for (Integer iGuy : currentButt.edges) {
                    if (!visited.contains(iGuy)) {
                        queue.push(new Butt(iGuy, aList[iGuy]));
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

    class Butt {
        List<Integer> edges;
        int data;

        Butt(int d, List<Integer> e) {
            edges = e;
            data = d;
        }
    }

}
