package io.acari.dp;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeat {

    public int find(String one) {
        Map<Character, Integer> veezeted = new HashMap<>();
        int length = one.length();
        int[] counts = new int[length];
        int lengthMinusOne = length - 1;
        int maxPrefix = 0;
        for (int i = lengthMinusOne; i > -1; i--) {
            char charAt = one.charAt(i);
            if (veezeted.containsKey(charAt)) {
                int previous = veezeted.get(charAt);
                counts[i] = (previous - 1 > -1 ? previous - 1 : 0) - i;
            } else {
                counts[i] += 1 + (i + 1 <= lengthMinusOne ? counts[i + 1] : 0);
            }

            veezeted.put(charAt, i);

            if (counts[i] > maxPrefix) {
                maxPrefix = counts[i];
            }
        }
        counts = new int[length];
        veezeted.clear();
        int maxSuffix = 0;
        for (int i = 0; i < length; i++) {
            char charAt = one.charAt(i);
            if (veezeted.containsKey(charAt)) {
                int previous = veezeted.get(charAt);
                counts[i] = i - (previous + 1 > lengthMinusOne ? lengthMinusOne : previous + 1);
            } else {
                counts[i] += 1 + (i - 1 < 0 ? 0 : counts[i - 1]);
            }

            veezeted.put(charAt, i);
            if (counts[i] > maxSuffix) {
                maxSuffix = counts[i];
            }
        }


        return Math.max(maxPrefix, maxSuffix);
    }
}
