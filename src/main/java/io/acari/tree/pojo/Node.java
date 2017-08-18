package io.acari.tree.pojo;

import java.util.HashSet;
import java.util.Set;

public final class Node<T> implements Comparable<Node<T>> {
    public int data;
    public Node<T> left;
    public Node<T> next;
    public T value;
    public Set<Node<T>> neighbors = new HashSet<>();
    public Set<Edge<T>> edges = new HashSet<>();

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
                ", value=" + value +
                ", hd=" + hd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Node node = (Node) o;

        return data == node.data;
    }

    @Override
    public int hashCode() {
        return data;
    }

    public int getData() {
        return data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public Set<Node<T>> getNeighbors() {
        return neighbors;
    }

    public Set<Edge<T>> getEdges() {
        return edges;
    }

    public Node getRight() {
        return right;
    }

    public int getHd() {
        return hd;
    }


    @Override
    public int compareTo(Node<T> tNode) {
        return Integer.compare(hd, tNode.hd);
    }
}
