package io.acari.dp;

import java.math.BigDecimal;
import java.util.Scanner;

public class UglyNumbers {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = in.nextInt();
    for (int i_t = 0; i_t < testCases; i_t++) {
      System.out.println(nextUgly(in.nextBigDecimal()));
    }
    in.close();
  }

  private static BigDecimal nextUgly(BigDecimal n) {
    BigDecimal guy = BigDecimal.valueOf(0);
    return guy.add(n.divide(BigDecimal.valueOf(2), BigDecimal.ROUND_HALF_EVEN)
        .add(n.divide(BigDecimal.valueOf(3), BigDecimal.ROUND_HALF_EVEN))
        .add(n.divide(BigDecimal.valueOf(5), BigDecimal.ROUND_HALF_EVEN))
        .add(n.divide(BigDecimal.valueOf(7), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(6), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(10), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(14), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(15), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(21), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(35), BigDecimal.ROUND_HALF_EVEN))
        .add(n.divide(BigDecimal.valueOf(30), BigDecimal.ROUND_HALF_EVEN))
        .add(n.divide(BigDecimal.valueOf(42), BigDecimal.ROUND_HALF_EVEN))
        .add(n.divide(BigDecimal.valueOf(70), BigDecimal.ROUND_HALF_EVEN))
        .add(n.divide(BigDecimal.valueOf(105), BigDecimal.ROUND_HALF_EVEN))
        .subtract(n.divide(BigDecimal.valueOf(210), BigDecimal.ROUND_HALF_EVEN)));
  }
}
