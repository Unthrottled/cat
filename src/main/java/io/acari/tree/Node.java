package io.acari.tree;

final class Node {
    public int data;
    public Node left;
    public Node next;

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
}
