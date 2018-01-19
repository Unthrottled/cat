package io.acari.prac;

public class GivenSum {

  /**
   * Given a binary tree t and an integer s,
   * determine whether there is a root to leaf path
   * in t such that the sum of vertex values equals s.
   *
   * @param t
   * @param s
   * @return
   */
  boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    return false;
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
