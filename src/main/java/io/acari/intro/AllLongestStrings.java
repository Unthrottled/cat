package io.acari.intro;

import java.util.*;
import java.util.stream.Collectors;

public class AllLongestStrings {

  /**
   * Given an array of strings, return another array containing all of its longest strings.
   *
   * @param inputArray
   * @return
   */
  String[] allLongestStrings(String[] inputArray) {
    return toArray(Arrays.stream(inputArray)
        .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList())));
  }

  private String[] toArray(SortedMap<Integer, List<String>> collect) {
    List<String> strings = collect.get(collect.lastKey());
    String[] returnValue = new String[strings.size()];
    strings.toArray(returnValue);
    return returnValue;
  }
}