package io.acari.prac;

import java.util.*;
import java.util.stream.Collectors;

public class DishStacker {

    /**
     * You have a list of dishes. Each dish is associated
     * with a list of ingredients used to prepare it.
     * You want to group the dishes by ingredients, so that for
     * each ingredient you'll be able to find all the
     * dishes that contain it (if there are at least 2 such dishes).
     * <p>
     * Return an array where each element is a list with
     * the first element equal to the name of the ingredient
     * and all of the other elements equal to the names of dishes that contain this ingredient.
     * The dishes inside each list should be sorted lexicographically.
     * The result array should be sorted lexicographically
     * by the names of the ingredients in its elements.
     * <p>
     * <p>
     * DOES GOOD!
     *
     * @param dishes
     * @return
     */
    String[][] groupingDishes(String[][] dishes) {
        SortedMap<String, SortedSet<String>> grouped = Arrays.stream(dishes)
                .flatMap(dish -> Arrays.stream(dish)
                        .skip(1)
                        .map(i -> new Edge<>(dish[0], i)))
                .collect(Collectors.groupingBy(p -> p.name, TreeMap::new, Collectors.mapping(p -> p.fst, Collectors.toCollection(TreeSet::new))));
        int count = (int) grouped.entrySet().stream()
                .map(Map.Entry::getValue)
                .map(Set::size)
                .filter(s -> s > 1)
                .count();
        String[][] newReturn = new String[count][];
        int index = 0;
        for (Map.Entry<String, SortedSet<String>> stringSortedSetEntry : grouped.entrySet()) {
            if (stringSortedSetEntry.getValue().size() > 1) {
                newReturn[index++] = toArray(stringSortedSetEntry);
            }
        }
        return newReturn;
    }

    private String[] toArray(Map.Entry<String, SortedSet<String>> entry) {
        String ingredient = entry.getKey();
        SortedSet<String> dishes = entry.getValue();
        String[] returnValue = new String[dishes.size() + 1];
        int index = 0;
        returnValue[index++] = ingredient;
        for (String dish : dishes) {
            returnValue[index++] = dish;
        }
        return returnValue;
    }

    class Edge<A, B> {
        final A fst;
        final B name;

        Edge(A var1, B name) {
            this.fst = var1;
            this.name = name;
        }
    }
}
