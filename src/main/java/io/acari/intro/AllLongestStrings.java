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
    return null;
  }
}
//  SortedMap<Integer, List<String>> collect = Arrays.stream(inputArray)
//      .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
//    return (String[]) collect.get(collect.lastKey()).toArray();