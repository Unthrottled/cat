package io.acari.prac;

import java.util.*;
import java.util.stream.Collectors;

public class DoYouKnowDaSums {

  /**
   * You have a collection of coins, and you know the values
   * of the coins and the quantity of each type of coin in it.
   * You want to know how many distinct sums you can make
   * from non-empty groupings of these coins.
   *
   * @param coins
   * @param quantity
   * @return
   */
  int possibleSums(int[] coins, int[] quantity) {
    Set<Integer> visited = new HashSet<>();
    Map<Integer, Set<Integer>> cache = new HashMap<>();
    int daWaes = 0;
    for (int q : quantity) {
      if (visited.add(q)) {
        findDaWaes(coins, q, cache);
        daWaes = q;
      }
    }

    return cache.get(daWaes).size();
  }

  private void findDaWaes(int[] coins, int q, Map<Integer, Set<Integer>> cache) {
    if (q == 0 || cache.containsKey(q)) {
      return;
    }

    if (q == 1) {
      cache.put(q, Arrays.stream(coins).boxed().collect(Collectors.toSet()));
    } else {
      findDaWaes(coins, q - 1, cache);
      cacheDaWae(coins, q, cache);
    }

  }

  private void cacheDaWae(int[] coins, int q, Map<Integer, Set<Integer>> cache) {
    Set<Integer> previousSet = cache.get(q - 1);
    Set<Integer> newSet = new HashSet<>(previousSet);
    for (int i = 0; i < q; i++) {

    }

    cache.put(q, newSet);
  }
}
