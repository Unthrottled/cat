package io.acari.dp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FloydWarshall {

    public String find(Integer[][] adjacencyMatrix){
        int length = adjacencyMatrix.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    int edgeCombo = adjacencyMatrix[j][i] + adjacencyMatrix[i][k];
                    int currentEdgeWeight = adjacencyMatrix[j][k];
                    adjacencyMatrix[j][k] = currentEdgeWeight > edgeCombo ? edgeCombo : currentEdgeWeight;
                }
            }
        }

        return Arrays.stream(adjacencyMatrix)
                .flatMap(Arrays::stream)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
