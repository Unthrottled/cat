package io.acari.intro;

import java.util.Map;
import java.util.stream.Collectors;

public class TacoCat {

  /**
   * Given a string, find out if its characters
   * can be rearranged to form a palindrome.
   *
   * @param inputString
   * @return
   */
  boolean palindromeRearranging(String inputString) {
    Map<Integer, Integer> collect = inputString.chars().boxed()
        .collect(Collectors.toMap(a -> a, a->1, (a,b)->a+b));
    int highlander = 0;
    for (Map.Entry<Integer, Integer> integerListEntry : collect.entrySet()) {
      if((integerListEntry.getValue() % 2 != 0 && highlander++ > 0)){
        return false;
      }
    }

    return true;
  }

}
