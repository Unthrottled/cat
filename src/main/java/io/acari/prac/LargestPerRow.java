package io.acari.prac;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestPerRow {

  /**
   * You have a binary tree t. Your task is to find the
   * largest value in each row of this tree.
   * In a tree, a row is a set of nodes that have equal depth.
   * For example, a row with depth 0 is a tree root, a
   * row with depth 1 is composed of the root's children, etc.
   * <p>
   * Return an array in which the first element is the
   * largest value in the row with depth 0, the second element
   * is the largest value in the row with depth 1, the third
   * element is the largest element in the row with depth 2, etc.
   * <p>
   * DOES GOOD!
   *
   * @param t
   * @return
   */
  int[] largestValuesInTreeRows(Tree<Integer> t) {
    if (t != null) {
      Queue<Tree<Integer>> q1 = new LinkedList<>();
      Queue<Tree<Integer>> q2 = new LinkedList<>();
      List<Integer> maxes = new LinkedList<>();
      q1.offer(t);
      while (!(q1.isEmpty() && q2.isEmpty())) {
        int currentMax = getCurrentMax(q2, q1);
        if (currentMax != Integer.MIN_VALUE) maxes.add(currentMax);
        currentMax = getCurrentMax(q1, q2);
        if (currentMax != Integer.MIN_VALUE) maxes.add(currentMax);
      }

      int[] r = new int[maxes.size()];
      int i = 0;
      for (Integer max : maxes) {
        r[i++] = max;
      }
      return r;

    }
    return new int[]{};
  }

  private int getCurrentMax(Queue<Tree<Integer>> two, Queue<Tree<Integer>> one) {
    int currentMax = Integer.MIN_VALUE;
    while (!one.isEmpty()) {
      Tree<Integer> p = one.poll();
      currentMax = currentMax < p.value ? p.value : currentMax;
      if (p.left != null) {
        two.offer(p.left);
      }
      if (p.right != null) {
        two.offer(p.right);
      }
    }
    return currentMax;
  }

  class Tree<T> {
    T value;
    Tree<T> left;
    Tree<T> right;

    Tree(T x) {
      value = x;
    }
  }
}
