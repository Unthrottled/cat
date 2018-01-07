package io.acari.intro;

public class DigitFirst {

  /**
   * Find the leftmost digit that occurs in a given string.
   *
   * @param inputString
   * @return
   */
  char firstDigit(String inputString) {
    return inputString.chars()
        .mapToObj(i->(char)i)
        .filter(Character::isDigit)
        .findFirst()
        .orElse('\0');
  }
}
