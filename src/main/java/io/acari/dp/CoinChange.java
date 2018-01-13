package io.acari.dp;

import java.util.Arrays;

public class CoinChange {

  public long find(Integer[] coins, int value) {
    return findUtil(coins, value);
  }

  private long findUtil(Integer[] coins, int value) {
    long[][] lookup = new long[value + 1][coins.length];
    Arrays.fill(lookup[0], 1);
    for (int valueRemaining = 1; valueRemaining < lookup.length; valueRemaining++) {
      for (int coinIndex = 0; coinIndex < lookup[valueRemaining].length; coinIndex++) {
        int coin = coins[coinIndex];
        int diffy = valueRemaining - coin;
        lookup[valueRemaining][coinIndex] = ((diffy < 0) ? 0 : lookup[diffy][coinIndex]) +
            (coinIndex > 0 ? lookup[valueRemaining][coinIndex - 1] : 0);
      }
    }

    return lookup[value][coins.length - 1];
  }
}
