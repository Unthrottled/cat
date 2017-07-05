package io.acari.graph;

import java.util.*;

public class BottomViewBinaryTree {
    // Should print bottom view of tree with given root
    public void bottomView(Node root) {
        // Your code here
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            root.hd = 0;
            queue.offer(root);
            SortedMap<Integer, Integer> map = new TreeMap<>(Comparator.comparingInt(a -> a));
            map.put(root.hd, root.data);
            while (!queue.isEmpty()) {
                Node poll = queue.poll();

                Node left = poll.left;
                if (left != null && left.hd == Integer.MAX_VALUE) {
                    left.hd = poll.hd - 1;
                    map.put(left.hd, left.data);
                    queue.offer(left);
                }

                Node right = poll.right;
                if (right != null && right.hd == Integer.MAX_VALUE) {
                    right.hd = poll.hd + 1;
                    map.put(right.hd, right.data);
                    queue.offer(right);
                }

            }

            System.out.print(map.entrySet().stream()
                    .map(Map.Entry::getValue)
                    .map(String::valueOf)
                    .collect(java.util.stream.Collectors.joining(" ")));
        }
    }

}


class Pair<A, B> {
    public final A fst;
    public final B snd;

    public Pair(A var1, B var2) {
        this.fst = var1;
        this.snd = var2;
    }

    public static <A, B> Pair<A, B> of(A var0, B var1) {
        return new Pair<>(var0, var1);
    }

    public String toString() {
        return "Pair[" + this.fst + "," + this.snd + "]";
    }

    public boolean equals(Object var1) {
        return var1 instanceof Pair && Objects.equals(this.fst, ((Pair) var1).fst) && Objects.equals(this.snd, ((Pair) var1).snd);
    }

    public int hashCode() {
        return this.fst == null ? (this.snd == null ? 0 : this.snd.hashCode() + 1) : (this.snd == null ? this.fst.hashCode() + 2 : this.fst.hashCode() * 17 + this.snd.hashCode());
    }
}