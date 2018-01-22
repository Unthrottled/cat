package io.acari.dp;

import io.acari.dp.pojo.Item;

import java.util.List;

public class Knapsacky {

    public int find(int sackCapacity, List<Item> items) {
        int itemCount = items.size();
        int[][] lookup = new int[sackCapacity + 1][itemCount + 1];
        for (int sackKap = 0; sackKap <= sackCapacity; sackKap++) {
            for (int itemIndex = 0; itemIndex <= itemCount; itemIndex++) {
                if (sackKap == 0 || itemIndex == 0) {
                    lookup[sackKap][itemIndex] = 0;
                } else {
                    Item item = items.get(itemIndex - 1);
                    int weight = item.getWeight();
                    if (sackKap >= weight) {
                        lookup[sackKap][itemIndex] = Math.max(lookup[sackKap - weight][itemIndex - 1] + item.getValue(), lookup[sackKap][itemIndex - 1]);
                    } else {
                        lookup[sackKap][itemIndex] = lookup[sackKap][itemIndex - 1];
                    }
                }
            }
        }

        return lookup[sackCapacity][itemCount];
    }
}
