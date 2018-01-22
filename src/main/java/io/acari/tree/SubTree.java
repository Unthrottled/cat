package io.acari.tree;

import io.acari.tree.pojo.Node;


public class SubTree {
    public static boolean isSubtree(Node t, Node s) {
        if (t != null && s != null) {
            Node left = s.left;
            Node right = s.right;
            Node tLeft = t.left;
            Node tRight = t.right;
            if (t.data == s.data) {
                return (left == null && right == null && tRight == null && tLeft == null) ||
                        (isSubtree(tLeft, left) && isSubtree(tRight, right));
            } else {
                return isSubtree(tLeft, s) || isSubtree(tRight, s);
            }
        } else if (t == null && s == null) {
            return true;
        }

        return false;
    }
}
