package io.acari.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClosedMinded {

  /**
   * Given an array of integers nums and an integer k,
   * determine whether there are two distinct indices i and j
   * in the array where nums[i] = nums[j] and
   * the absolute difference between i and j is less than or equal to k.
   *
   * @param nums
   * @param k
   * @return
   */
  boolean containsCloseNums(int[] nums, int k) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      List<Integer> list = map.getOrDefault(num, new ArrayList<>());
      list.add(i);
      map.put(num, list);
    }

    return map.entrySet()
        .stream()
        .filter(e->e.getValue().size() >1)
        .map(Map.Entry::getValue)
        .anyMatch(l->{
          for (int i = 0; i < l.size() - 1; i++) {
            int one = l.get(i) + 1;
            for (int j = i + 1; j < l.size(); j++) {
                int two = l.get(j) + 1;
                if(two - one <= k)
                  return true;
            }
          }
          return false;
        });
  }

}
