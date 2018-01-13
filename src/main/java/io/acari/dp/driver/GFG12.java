package io.acari.dp.driver;

import io.acari.dp.NCR;

import java.util.Scanner;

public class GFG12 {

  public static void main(String[] args) {
    NCR steve = new NCR();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      String[] num = in.nextLine().split(" ");
      System.out.println(steve.find(Integer.parseInt(num[0]), Integer.parseInt(num[1])));
    }
  }
}
