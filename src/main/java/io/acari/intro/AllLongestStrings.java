package io.acari.intro;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AllLongestStrings {

    /**
     * Given an array of strings, return another array containing all of its longest strings.
     *
     * @param inputArray
     * @return
     */
    String[] allLongestStrings(String[] inputArray) {
        SortedMap<Integer, List<String>> collect = Arrays.stream(inputArray)
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        List<String> strings = collect.get(collect.lastKey());
        String[] returnValue = new String[strings.size()];
        strings.toArray(returnValue);
        return returnValue;
    }
}