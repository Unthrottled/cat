package io.acari.tree;

import io.acari.tree.pojo.Node;


public class SubTree {
    public static boolean isSubtree(Node t, Node s) {
        if (t != null && s != null) {
            Node left = s.left;
            Node right = s.right;
            Node tLeft = t.left;
            Node tRight = t.right;
            if (notJanky(t, tRight) && notJanky(t, tLeft)) {
                if (t.data == s.data) {
                    return (left == null && right == null) || (isSubtree(tLeft, left) && isSubtree(tRight, right));
                } else {
                    return isSubtree(tLeft, s) || isSubtree(tRight, s);
                }
            }
        } else if (t == null && s == null) {
            return true;
        }

        return false;
    }

    private static boolean notJanky(Node t, Node tLeft) {
        return (t == null && tLeft == null) || (t != null && tLeft != null && (t.data != tLeft.data));
    }
}
