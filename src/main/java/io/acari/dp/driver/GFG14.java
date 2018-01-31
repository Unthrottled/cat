package io.acari.dp.driver;

import io.acari.dp.CuttedSegments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG14 {

  public static void main(String... args) {
    CuttedSegments steve = new CuttedSegments();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      String num = in.nextLine().trim();
      String line = in.nextLine().trim();
      String[] split = line.trim().split(" ");
      Integer[] coinz = new Integer[split.length];
      coinz = Arrays.stream(split).map(Integer::parseInt).collect(Collectors.toList()).toArray(coinz);
      System.out.println(steve.find(Integer.parseInt(num), coinz));
    }
  }
}
