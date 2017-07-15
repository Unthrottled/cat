package io.acari.tree;

public class RightViewRecursive {
    void rightView(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            int rightMax = maxo(node.right, 0, 1);
            maxo(node.left, rightMax, 1);
        }
    }

    private int maxo(Node node, int maxLevel, int currentLevel) {
        if (node != null) {
            if (maxLevel < currentLevel) {
                System.out.print(node.data + " ");
                maxLevel = currentLevel;
            }

            int rightMax = maxo(node.right, maxLevel, ++currentLevel);
            return maxo(node.left, rightMax, currentLevel);
        }

        return maxLevel;
    }

}
