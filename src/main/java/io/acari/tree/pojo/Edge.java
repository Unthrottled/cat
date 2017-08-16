package io.acari.tree.pojo;

public class Edge<T> {

    public int weight;
    public Node<T> vertex;

    public Edge(int w, Node<T> v){
        weight = w;
        vertex = v;
    }

    public Node<T> getVertex() {
        return vertex;
    }
}
