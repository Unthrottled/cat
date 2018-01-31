package io.acari.prac;

public class GivenSum {

  /**
   * Given a binary tree t and an integer s,
   * determine whether there is a root to leaf path
   * in t such that the sum of vertex values equals s.
   * <p>
   * DOES GOOD!
   *
   * @param t
   * @param s
   * @return
   */
  boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    return helper(t, s, 0);
  }

  private boolean helper(Tree<Integer> t, int s, int sum) {
    if (t == null) {
      return s == 0;
    } else {
      Integer value = t.value;
      int rootPlus = sum + value;
      if (t.left == null && t.right == null) {
        return s == rootPlus;
      } else {
        return helper(t.left, s, rootPlus) || helper(t.right, s, rootPlus);
      }
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
