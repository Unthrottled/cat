package io.acari.tree;

import io.acari.tree.pojo.Node;

import java.util.*;

public class NodeAtEvenDistance {

  public long findNodesWithEvenDistance(Node<Integer> root) {
    if (root != null) {
      Queue<Node> bfsQueue = new LinkedList<>();
      Set<Node> visited = new HashSet<>();
      bfsQueue.offer(root);
      root.hd = 0;
      while (!bfsQueue.isEmpty()) {
        Node currentNode = bfsQueue.poll();
        int dist = currentNode.hd + 1;
        visited.add(currentNode);
        List<Node<Integer>> neighbors = currentNode.getNeighbors();
        for (Node<Integer> neighbor : neighbors) {
          if (!visited.contains(neighbor)) {
            neighbor.hd = dist;
            bfsQueue.offer(neighbor);
          }
        }
      }
      long evenCount = visited.stream().filter(n -> n.hd % 2 == 0).count();
      if (evenCount > 0) {
        long odd = visited.size() - evenCount;
        return (odd * (odd - 1) / 2) + (evenCount * (evenCount - 1) / 2);
      }
    }
    return 0L;
  }
}
