package io.acari.tree.pojo;

import java.util.LinkedList;
import java.util.List;

public final class Node {
    public int data;
    public Node left;
    public Node next;
    public List<Node> neighbors = new LinkedList<>();

    public Node right;
    public int hd = Integer.MAX_VALUE;

    public Node(int data) {
        ;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return data == node.data;
    }

    @Override
    public int hashCode() {
        return data;
    }
}
