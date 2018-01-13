package io.acari.dp.driver;

import io.acari.dp.LongestIncreasingSequence;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG5 {
  public static void main(String[] args) {
    LongestIncreasingSequence steve = new LongestIncreasingSequence();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      String guy = in.nextLine();
      guy = guy.isEmpty() ? in.nextLine() : guy;
      char c = guy.charAt(0);
      String line = in.hasNext() ? in.nextLine() : guy;
      line = line.isEmpty() ? in.nextLine() : line;
      if ((guy.length() == 1 && c != '0' && c != '1') || guy.length() > 1) {
        List<Integer> collect = Arrays.stream(line.trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(steve.find(collect));
      } else {
        System.out.println(0);
      }
    }
  }
}
