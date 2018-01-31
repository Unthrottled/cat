package io.acari.dp.driver;

import io.acari.dp.BinomialCoefficient;

import java.util.Scanner;

public class GFG15 {

  public static void main(String[] args) {
    BinomialCoefficient steve = new BinomialCoefficient();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      String[] arguments = in.nextLine().trim().split(" ");
      int eggs = Integer.parseInt(arguments[0]);
      int floors = Integer.parseInt(arguments[1]);
      System.out.println(steve.find(eggs, floors));
    }
  }
}
