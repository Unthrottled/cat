package io.acari.prac;

public class FirstUniqueChar {

  public static void main(String... args) {
    System.out.println(new FirstUniqueChar().firstNotRepeatingCharacter("abacabaabacaba"));
  }

  /**
   * Note: Write a solution that only
   * iterates over the string once and uses O(1) additional memory,
   * since this is what you would be asked to do during a real interview.
   * <p>
   * Given a string s, find and return the first
   * instance of a non-repeating character in it.
   * If there is no such character, return '_'.
   *
   * @param s
   * @return
   */
  char firstNotRepeatingCharacter(String s) {
    if (s.length() > 0) {
      int[] counts = new int[26];
      s.chars().map(i -> i - 97)
          .forEach(i -> counts[i]++);
      return s.chars().filter(c -> counts[c - 97] == 1)
          .mapToObj(c -> (char) c)
          .findFirst()
          .orElse('_');

    }

    return '_';
  }

}
