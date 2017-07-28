package io.acari.string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneNumberWords {
    private final Character[][] phone = {
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public Stream<String> find(Integer[] numbers) {
        Map<Integer, Node> graph = new HashMap<>();
        int numLessOne = numbers.length - 1;
        for (int i = numLessOne; i > -1; i--) {
            int number = numbers[i];
            Node guy = new Node();
            guy.data = number;
            guy.values = phone[number];
            if (i < numLessOne) {
                guy.next = graph.get(i + 1);
            }
            graph.put(i, guy);
        }


        return build(graph.get(0));
    }

    private Stream<String> build(Node node){
        if(node != null){
            if(node.next == null){
                return Arrays.stream(node.values).map(String::valueOf);
            } else {

                List<String> collect = build(node.next).collect(Collectors.toList());
                return Arrays.stream(node.values).flatMap(character -> collect.stream().map(cc-> character + cc));
            }
        }

        return Stream.empty();
    }
}

class Node {
    Node next;
    Integer data;
    Character[] values;
}
