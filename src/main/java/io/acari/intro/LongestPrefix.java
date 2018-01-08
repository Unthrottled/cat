package io.acari.intro;

public class LongestPrefix {

  /**
   * Given a string, output its longest prefix which
   * contains only digits.
   *
   * @param inputString
   * @return
   */
  String longestDigitsPrefix(String inputString) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < inputString.length(); i++) {
      char c = inputString.charAt(i);
      if (Character.isDigit(c)) {
        stringBuilder.append(c);
      } else {
        break;
      }
    }
    return stringBuilder.toString();
  }
}
