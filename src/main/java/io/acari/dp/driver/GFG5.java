package io.acari.dp.driver;

import io.acari.tree.NodeAtEvenDistance;

import java.util.*;
import java.util.stream.Collectors;

public class GFG5 {
    public static void main(String[] args) {
        NodeAtEvenDistance steve = new NodeAtEvenDistance();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i_t = 0; i_t < t; i_t++) {
            String guy = in.nextLine();
            guy = guy.isEmpty() ? in.nextLine() : guy;
            int nodes = Integer.parseInt(guy);
            String line = in.nextLine();
            line = line.isEmpty() ? in.nextLine() : line;
            List<Integer> collect = Arrays.stream(line.trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//            System.out.println(steve.findNodesWithEvenDistance(graph.get(Integer.parseInt(rows[0]))));
        }
    }
}
