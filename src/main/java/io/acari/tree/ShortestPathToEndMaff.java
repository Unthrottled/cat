package io.acari.tree;

public class ShortestPathToEndMaff {

    public long find(Integer root, Integer terminatingNode) {
        long jumps = -1;
        while (terminatingNode > 0) {
            if (terminatingNode % 3 == 0) {
                terminatingNode /= 3;
            } else {
                terminatingNode--;
            }
            jumps++;
        }
        return jumps;
    }
}
