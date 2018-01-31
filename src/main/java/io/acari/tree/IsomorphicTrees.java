package io.acari.tree;

import io.acari.tree.pojo.Node;

public class IsomorphicTrees {

  public boolean isIsomorphic(Node root1, Node root2) {
    if (!(root1 == null || root2 == null)) {
      final java.util.Map<Integer, java.util.Set<Integer>> oneLevels = getLel(root1);
      final java.util.Map<Integer, java.util.Set<Integer>> twoLevels = getLel(root2);
      return oneLevels.size() == twoLevels.size() &&
          oneLevels.entrySet()
              .stream()
              .allMatch(entry -> entry.getValue().equals(twoLevels.get(entry.getKey())));
    }
    return false;
  }

  private java.util.Map<Integer, java.util.Set<Integer>> getLel(Node root1) {
    if (root1 != null) {
      java.util.Queue<Node> queueOneNodeOne = new java.util.LinkedList<>();
      java.util.Queue<Node> queueTwoNodeOne = new java.util.LinkedList<>();
      queueTwoNodeOne.offer(root1);
      java.util.Map<Integer, java.util.Set<Integer>> map = new java.util.HashMap<>();
      int level = 0;
      while (!(queueOneNodeOne.isEmpty() && queueTwoNodeOne.isEmpty())) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        doWork(queueOneNodeOne, queueTwoNodeOne, set);
        doWork(queueTwoNodeOne, queueTwoNodeOne, set);
        map.put(++level, set);
      }
      return map;
    }

    return java.util.Collections.emptyMap();
  }

  private void doWork(java.util.Queue<Node> queueOneNodeOne, java.util.Queue<Node> queueTwoNodeOne, java.util.Set<Integer> set) {
    while (!queueOneNodeOne.isEmpty()) {
      Node currentNode = queueOneNodeOne.poll();
      if (currentNode.left != null) {
        queueTwoNodeOne.offer(currentNode.left);
      }
      if (currentNode.right != null) {
        queueTwoNodeOne.offer(currentNode.right);
      }
      set.add(currentNode.data);
    }
  }
}
