package io.acari.intro;

import java.util.LinkedList;
import java.util.List;

public class KnapsackLite {

    /**
     * You found two items in a treasure chest!
     * The first item weighs weight1 and is worth value1, and the second
     * item weighs weight2 and is worth value2. What is the total maximum value of the
     * items you can take with you,
     * assuming that your max weight capacity is maxW and
     * you can't come back for the items later?
     *
     * @param value1
     * @param weight1
     * @param value2
     * @param weight2
     * @param maxW
     * @return
     */
    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        List<Item> treasureChest = new LinkedList<>();
        treasureChest.add(new Item(value1, weight1));
        treasureChest.add(new Item(value2, weight2));
        return maxProfit(maxW, 0, treasureChest);
    }

    private int maxProfit(int capacity, int value, List<Item> oneLess) {
        int maxProfit = value;
        for (int j = 0; j < oneLess.size(); j++) {
            List<Item> guy = new LinkedList<>(oneLess);
            Item item = guy.remove(j);
            int weight = item.weight;
            int profit;
            if (capacity >= weight) {
                profit = Math.max(maxProfit(capacity - weight, value + item.value, guy), maxProfit(capacity, value, guy));
            } else {
                profit = maxProfit(capacity, value, guy);
            }
            maxProfit = profit > maxProfit ? profit : maxProfit;
        }
        return maxProfit;
    }

    class Item {
        private final int value;
        private final int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }
}
