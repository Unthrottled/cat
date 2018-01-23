package io.acari.binary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class RecursiveBinarySearchTest {
    private RecursiveBinarySearch steve = new RecursiveBinarySearch();

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExists() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5};
        assertEquals(1, steve.search(testInput, 0, testInput.length - 1, 2));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationTwo() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(5, steve.search(testInput, 0, testInput.length - 1, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationThree() throws Exception {
        int[] testInput = new int[]{2, 4, 6, 8, 10, 12};
        assertEquals(2, steve.search(testInput, 0, testInput.length - 1, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationFour() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 5, 8, 13};
        assertEquals(4, steve.search(testInput, 0, testInput.length - 1, 8));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExists() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 5, 8, 13};
        assertEquals(-6, steve.search(testInput, 0, testInput.length - 1, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationTwo() throws Exception {
        int[] testInput = new int[]{11, 22, 33, 44, 55};
        assertEquals(-5, steve.search(testInput, 0, testInput.length - 1, 445));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationThree() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 5, 8, 13};
        assertEquals(-4, steve.search(testInput, 0, testInput.length - 1, 4));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationFour() throws Exception {
        int[] testInput = new int[]{2, 4, 6, 8, 10, 12};
        assertEquals(-2, steve.search(testInput, 0, testInput.length - 1, 3));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationFive() throws Exception {
        int[] testInput = new int[]{2, 4, 6, 8, 10, 12};
        assertEquals(-1, steve.search(testInput, 0, testInput.length - 1, 1));
    }

}