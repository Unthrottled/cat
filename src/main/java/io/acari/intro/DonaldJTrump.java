package io.acari.intro;

import java.util.HashMap;
import java.util.Map;

public class DonaldJTrump {

    /**
     * Elections are in progress!
     * Given an array of the numbers of votes given
     * to each of the candidates so far, and an integer
     * k equal to the number of voters who haven't cast
     * their vote yet, find the number of candidates
     * who still have a chance to win the election.
     * <p>
     * The winner of the election must secure
     * strictly more votes than any other candidate.
     * <p>
     * If two or more candidates receive the same
     * (maximum) number of votes, assume there is no winner at all.
     *
     * @param votes
     * @param k
     * @return
     */
    int electionsWinners(int[] votes, int k) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int vote : votes) {
            int count = map.getOrDefault(vote, 0);
            max = max < vote ? vote : max;
            map.put(vote, ++count);
        }
        final int largestValue = max;
        int sum = map.entrySet()
                .stream()
                .filter(e -> e.getKey() + k > largestValue)
                .mapToInt(Map.Entry::getValue)
                .sum();
        int top = map.getOrDefault(max, 0);
        return sum == 0 ? topWinner(k, top) : sum;
    }

    private int topWinner(int k, int top) {
        return (top == 1 && k == 0) ||
                k > 0 ? top : 0;
    }
}
