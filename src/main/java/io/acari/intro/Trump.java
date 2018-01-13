package io.acari.intro;

public class Trump {

  /**
   * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
   * <p>
   * Example
   * <p>
   * For:
   * picture = ["abc","ded"]
   * <p>
   * the output should be
   * <p>
   * addBorder(picture) =
   * <p>
   * ["*****",
   * <p>
   * "*abc*",
   * <p>
   * "*ded*",
   * <p>
   * "*****"]
   *
   * @param picture
   * @return
   */
  String[] addBorder(String[] picture) {
    int length = picture.length;
    String bar = generateBar(picture[0].length() + 2);
    String[] returnValue = new String[length + 2];
    returnValue[0] = bar;
    int i = 1;
    for (String s : picture) {
      returnValue[i++] = "*" + s + "*";
    }
    returnValue[length + 1] = bar;
    return returnValue;
  }

  private String generateBar(int length) {
    StringBuilder returnValue = new StringBuilder();
    int i = 0;
    while (i++ < length) {
      returnValue.append("*");
    }
    return returnValue.toString();
  }
}
