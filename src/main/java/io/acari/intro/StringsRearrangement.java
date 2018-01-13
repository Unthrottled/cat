package io.acari.intro;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringsRearrangement {

  /**
   * Given an array of equal-length strings,
   * check if it is possible to rearrange the strings
   * in such a way that after the rearrangement the strings
   * at consecutive positions would differ by exactly one character.
   *
   * @param inputArray
   * @return
   */
  boolean stringsRearrangement(String[] inputArray) {
    Set<Integer> availableIndices = IntStream.range(0, inputArray.length)
        .boxed()
        .collect(Collectors.toSet());
    for (int i = 0; i < inputArray.length; i++) {
      Set<Integer> otherIndices = new HashSet<>(availableIndices);
      otherIndices.remove(i);
      if (canRearrange(inputArray, i, otherIndices)) {
        return true;
      }
    }

    return false;
  }

  private boolean canRearrange(String[] inputArray, int index, Set<Integer> otherIndices) {
    if (otherIndices.isEmpty()) {
      return true;
    }

    String currentGuy = inputArray[index];
    for (Integer otherIndex : otherIndices) {
      if (matchesDiff(currentGuy, inputArray[otherIndex])) {
        Set<Integer> oneLess = new HashSet<>(otherIndices);
        oneLess.remove(otherIndex);
        if (canRearrange(inputArray, otherIndex, oneLess)) {
          return true;
        }
      }
    }


    return false;
  }

  private boolean matchesDiff(String stringOne, String stringTwo) {
    int different = 0;
    for (int i = 0; i < stringOne.length(); i++) {
      char one = stringOne.charAt(i);
      char two = stringTwo.charAt(i);
      if (one != two) {
        if (++different > 1) {
          return false;
        }
      }
    }

    return different == 1;
  }

}
