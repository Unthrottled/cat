package io.acari.binary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class QuickSortIterativeTest {
    private final QuickSortIterative steve = new QuickSortIterative();

    @Test
    public void sortShouldSortParta() throws Exception {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, steve.sort(input));
    }

    @Test
    public void sortShouldSortPartb() throws Exception {
        int[] input = {3, 2, 1};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, steve.sort(input));
    }

    @Test
    public void sortShouldSortPartc() throws Exception {
        int[] input = {3, 1, 2};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, steve.sort(input));
    }

    @Test
    public void sortShouldSortPartd() throws Exception {
        int[] input = {1, 3, 2};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, steve.sort(input));
    }

    @Test
    public void sortShouldSortParte() throws Exception {
        int[] input = {36, 8, 13, 5, 21, 1, 3, 2};
        int[] expected = {1, 2, 3, 5, 8, 13, 21, 36};
        assertArrayEquals(expected, steve.sort(input));
    }

    @Test
    public void sortShouldSortPartf() throws Exception {
        int[] input = {10, 80, 30, 90, 40, 50, 70};
        int[] expected = {10, 30, 40, 50, 70, 80, 90};
        assertArrayEquals(expected, steve.sort(input));
    }
}