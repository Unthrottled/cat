package io.acari.dp;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeat {

  public int find(String one) {
    Map<Character, Integer> veezeted = new HashMap<>();
    int length = one.length();
    int lengthMinusOne = length - 1;
    int maxSuffix = 1;
    int currentLength = 0;
    for (int i = 0; i < length; i++) {
      char charAt = one.charAt(i);
      Integer previous = veezeted.get(charAt);
      if (previous != null && i - currentLength <= previous) {
        currentLength = (i - (previous + 1 > lengthMinusOne ? i : previous + 1)) + 1;
      } else {
        currentLength++;
      }
      veezeted.put(charAt, i);
      if (maxSuffix < currentLength) {
        maxSuffix = currentLength;
      }
    }


    return maxSuffix;
  }
}
