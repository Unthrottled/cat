package io.acari.tree;

public class IsomorphicRecursive {
    public boolean isIsomorphic(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        } else if (root1.data == root2.data) {
            return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) ||
                    (isIsomorphic(root1.right, root2.left) && isIsomorphic(root1.left, root2.right));
        }
        return false;
    }


}
