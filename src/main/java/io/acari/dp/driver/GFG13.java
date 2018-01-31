package io.acari.dp.driver;

import io.acari.dp.Knapsacky;
import io.acari.dp.pojo.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GFG13 {

  public static void main(String[] args) {
    Knapsacky steve = new Knapsacky();
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());
    for (int i_t = 0; i_t < t; i_t++) {
      int num = Integer.parseInt(in.nextLine().trim());
      int sackCap = Integer.parseInt(in.nextLine().trim());
      String values = in.nextLine();
      String weights = in.nextLine();
      String[] split = values.trim().split(" ");
      String[] weightList = weights.trim().split(" ");
      List<Item> items = new ArrayList<>(num);
      for (int i = 0; i < num; i++) {
        items.add(new Item(Integer.parseInt(split[i]), Integer.parseInt(weightList[i])));
      }
      System.out.println(steve.find(sackCap, items));
    }
  }
}
