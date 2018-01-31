package io.acari.dp.driver;

import io.acari.dp.CoinChange;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GFG8 {

  public static void main(String... args) {
    CoinChange steve = new CoinChange();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      String num = in.nextLine();
      String line = in.nextLine();
      Long[] coinz = new Long[Integer.parseInt(num)];
      coinz = Arrays.stream(line.split(" ")).map(Long::parseLong).collect(Collectors.toList()).toArray(coinz);
      String value = in.nextLine();
      System.out.println(steve.find(coinz, Integer.parseInt(value)));
    }
  }
}
