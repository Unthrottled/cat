package io.acari.tree;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

public class yeager {

  public static void main(String... aoe) {
    long numbo = 1000000000000000000L;
    long mambo5 = 168471150609214225L;
//        while (numbo > 0){
//            System.out.println(numbo = numbo >> 1);
//
//        }
    int count = 0;
    for (int i = 1; i < 200; i++) {
      final int guy = i;
      if (Stream.of(2, 3, 4, 5, 6, 7, 8, 9, 10).allMatch(j -> guy % j != 0)) {
        count++;
      }
    }
    System.out.println(count);
    int i = 1000000;
    int[][][] lookup = new int[i][i][i];
    lookup[0][0][0] = 1;
    Instant now = Instant.now();
    for (int j = 0; j < lookup[j].length; j++) {
      for (int k = 0; k < lookup[k].length; k++) {
        for (int bra = 0; bra < lookup[bra].length; bra++) {
          lookup[i][j][k] += lookup[getAnInt(i)][getAnInt(k)][getAnInt(bra)];
        }
        System.out.print(lookup[i][j][i - 1] + " ");
      }
      System.out.print(lookup[i][i - 1][i - 1] + " ");
    }
    Instant now1 = Instant.now();
    System.out.println();
    System.out.println(Duration.between(now, now1));
  }

  private static int getAnInt(int i) {
    return i - 1 > 0 ? 0 : i - 1;
  }
}
