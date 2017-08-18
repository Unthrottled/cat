package io.acari.tree.pojo;

public class Edge<T> {

    public int weight;
    public Node<T> vertex;

    public Edge(int w, Node<T> v) {
        weight = w;
        vertex = v;
    }

    public Node<T> getVertex() {
        return vertex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge<?> edge = (Edge<?>) o;

        if (weight != edge.weight) return false;
        return vertex.equals(edge.vertex);
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + vertex.hashCode();
        return result;
    }
}
