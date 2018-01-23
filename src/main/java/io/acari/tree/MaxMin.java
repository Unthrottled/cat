package io.acari.tree;

import io.acari.tree.pojo.Node;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxMin {

    int findMax(Node node) {
        if (node != null) {
            int max = max(node.data, findMax(node.right));
            return max(max, findMax(node.left));
        }

        return MIN_VALUE;
    }

    int findMin(Node node) {
        if (node != null) {
            int min = min(node.data, findMin(node.right));
            return min(min, findMin(node.left));
        }
        return MAX_VALUE;
    }
}
