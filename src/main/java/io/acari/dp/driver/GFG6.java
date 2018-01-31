package io.acari.dp.driver;

import io.acari.dp.LongestCommonSubsequence;

import java.util.Scanner;

public class GFG6 {
  public static void main(String[] args) {
    LongestCommonSubsequence steve = new LongestCommonSubsequence();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      String guy = in.nextLine();
      guy = guy.isEmpty() ? in.nextLine() : guy;
      String lineOne = in.hasNext() ? in.nextLine() : guy;
      String lineTwo = in.hasNext() ? in.nextLine() : lineOne;
      System.out.println(steve.findString(lineOne, lineTwo));
    }
  }
}
