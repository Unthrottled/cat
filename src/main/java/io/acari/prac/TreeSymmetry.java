package io.acari.prac;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TreeSymmetry {

  /**
   * Given a binary tree t, determine whether it is
   * symmetric around its center, i.e. each side mirrors the other.
   * <p>
   * TODO: MEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
   *
   * @param t
   * @return
   */
  boolean isTreeSymmetric(Tree<Integer> t) {
    if (t != null) {
      Queue<Tree> queueOne = new LinkedList<>();
      Queue<Tree> queueTwo = new LinkedList<>();
      queueTwo.offer(t);
      while (!queueOne.isEmpty() || !queueTwo.isEmpty()) {
        while (!queueOne.isEmpty()) {
          doWork(queueTwo, queueOne.poll());
        }

        if (notValid(queueTwo))
          return false;

        while (!queueTwo.isEmpty()) {
          doWork(queueOne, queueTwo.poll());
        }

        if (notValid(queueOne))
          return false;

      }
    }
    return true;
  }

  private boolean notValid(Queue<Tree> queueOne) {
    Deque<Tree> tempo = new LinkedList<>(queueOne);

    while (!tempo.isEmpty()) {
      if (!tempo.pollFirst().equals(tempo.pollLast()))
        return true;
    }

    return false;
  }

  private void doWork(Queue<Tree> queueOne, Tree node) {
    if (node.left != null) {
      queueOne.offer(node.left);
    }
    if (node.right != null) {
      queueOne.offer(node.right);
    }
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
