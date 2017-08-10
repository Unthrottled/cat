package io.acari.dp;

import java.util.Arrays;

public class SubsetSum {

    public String find(Integer[] numbers) {
        int sum = Arrays.stream(numbers).mapToInt(a -> a).sum();
        boolean isEven = sum % 2 == 0;
        if (isEven) {
            int length = numbers.length;
            int halfSum = sum / 2;
            boolean[][] lookup = new boolean[halfSum + 1][length + 1];
            Arrays.fill(lookup[0], true);
            for (int i = 1; i <= halfSum; i++) {
                for (int j = 1; j <= length; j++) {
                    int jMinus = j - 1;
                    Integer currentNumber = numbers[jMinus];
                    lookup[i][j] = lookup[i][j - 1];
                    if (i >= currentNumber) {
                        lookup[i][j] = lookup[i][j] || lookup[i - currentNumber][jMinus];
                    }
                }
            }

            if (lookup[halfSum][length]) {
                return "YES";
            }
        }
        return "NO";
    }
}
