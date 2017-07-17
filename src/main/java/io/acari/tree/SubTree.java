package io.acari.tree;

import io.acari.tree.pojo.Tree;

public class SubTree {
    public static boolean isSubtree(Tree t, Tree s) {
        if (t != null && s != null) {
            Tree left = s.left;
            Tree right = s.right;
            Tree tLeft = t.left;
            Tree tRight = t.right;
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

    private static boolean notJanky(Tree t, Tree tLeft) {
        return (t == null && tLeft == null) || (t != null && tLeft != null && (t.data != tLeft.data));
    }
}
