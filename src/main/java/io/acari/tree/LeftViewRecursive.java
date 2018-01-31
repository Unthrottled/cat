package io.acari.tree;

import io.acari.tree.pojo.Node;

public class LeftViewRecursive {

  public void leftView(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      int max = maxo(root.left, 0, 1);
      maxo(root.right, max, 1);

    }
  }

  private int maxo(Node root, int maxLevel, int level) {
    if (root != null) {
      if (maxLevel < level) {
        System.out.print(root.data + " ");
        maxLevel = level;
      }

      int leftMax = maxo(root.left, maxLevel, ++level);
      return Math.max(maxo(root.right, leftMax, level), leftMax);
    }

    return maxLevel;
  }
}
