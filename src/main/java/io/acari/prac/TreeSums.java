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
     * <p>
     * <p>
     * Does good!
     *
     * @param t
     * @return
     */
    long digitTreeSum(Tree<Integer> t) {
        return helper(t, 0L);
    }

    private long helper(Tree<Integer> t, long i) {
        if (t != null) {
            long current = i * 10 + t.value;
            if (t.left == null && t.right == null) {
                return current;
            }

            long left = helper(t.left, current);
            long right = helper(t.right, current);
            return left + right;
        }
        return 0L;
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
