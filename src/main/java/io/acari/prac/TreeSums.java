package io.acari.prac;

public class TreeSums {

  /**
   * We're going to store numbers in a tree.
   * Each node in this tree will store a single digit
   * (from 0 to 9), and each path from root to leaf encodes
   * a non-negative integer.
   * <p>
   * Given a binary tree t, find the sum of
   * all the numbers encoded in it.
   *
   *
   * TODO: MEEEEE
   *
   * @param t
   * @return
   */
  long digitTreeSum(Tree<Integer> t) {
    return 0;
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
