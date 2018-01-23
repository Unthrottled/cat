package io.acari.prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DoYouKnowDaSums {

    /**
     * You have a collection of coins, and you know the values
     * of the coins and the quantity of each type of coin in it.
     * You want to know how many distinct sums you can make
     * from non-empty groupings of these coins.
     * <p>
     * <p>
     * TODO: MEEEEEE
     *
     * @param coins
     * @param quantityOfEachCoin
     * @return
     */
    int possibleSums(int[] coins, int[] quantityOfEachCoin) {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Set<Integer>> cache = new HashMap<>();
        int daWaes = 0;


        return cache.get(daWaes).size();
    }

}
