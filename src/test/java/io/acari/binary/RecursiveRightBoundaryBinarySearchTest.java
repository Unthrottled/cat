package io.acari.binary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class RecursiveRightBoundaryBinarySearchTest {
    private final RecursiveRightBoundaryBinarySearch steve = new RecursiveRightBoundaryBinarySearch();

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExists() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5};
        assertEquals(1, steve.search(testInput, 2));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationOne() throws Exception {
        int[] testInput = new int[]{1, 2, 2, 2, 2, 3, 4, 5};
        assertEquals(4, steve.search(testInput, 2));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationSix() throws Exception {
        int[] testInput = new int[]{1, 2, 2, 2, 2, 2, 3, 4, 5};
        assertEquals(5, steve.search(testInput, 2));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationSeve() throws Exception {
        int[] testInput = new int[]{1, 2, 2, 3, 4, 5};
        assertEquals(2, steve.search(testInput, 2));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationTwo() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(5, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationEight() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5, 6, 6};
        assertEquals(6, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationNine() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5, 6, 6, 6};
        assertEquals(7, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationTen() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5, 5, 6, 6, 6};
        assertEquals(8, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationTwelve() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 4, 5, 5, 5, 6, 6, 6};
        assertEquals(9, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationThirteen() throws Exception {
        int[] testInput = new int[]{1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 6};
        assertEquals(10, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationThree() throws Exception {
        int[] testInput = new int[]{2, 4, 6, 8, 10, 12};
        assertEquals(2, steve.search(testInput, 6));
    }

    @Test
    public void searchShouldReturnCorrectIndexWhenGivenKeyThatExistsPermutationFour() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 5, 8, 13};
        assertEquals(4, steve.search(testInput, 8));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExists() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 5, 8, 13};
        assertEquals(-6, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsFour() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 3, 5, 8, 13};
        assertEquals(-7, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsSeven() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 3, 5, 5, 5, 8, 13};
        assertEquals(-9, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsSix() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 3, 5, 5, 8, 13};
        assertEquals(-8, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsFive() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 3, 3, 5, 8, 13};
        assertEquals(-8, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsTwo() throws Exception {
        int[] testInput = new int[]{1, 2, 2, 3, 5, 8, 13};
        assertEquals(-7, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsThree() throws Exception {
        int[] testInput = new int[]{1, 2, 2, 2, 3, 5, 8, 13};
        assertEquals(-8, steve.search(testInput, 10));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationTwo() throws Exception {
        int[] testInput = new int[]{11, 22, 33, 44, 55};
        assertEquals(-5, steve.search(testInput, 445));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationThree() throws Exception {
        int[] testInput = new int[]{1, 2, 3, 5, 8, 13};
        assertEquals(-4, steve.search(testInput, 4));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationFour() throws Exception {
        int[] testInput = new int[]{2, 4, 6, 8, 10, 12};
        assertEquals(-2, steve.search(testInput, 3));
    }

    @Test
    public void searchShouldReturnCorrectNegativeIndexWhenGivenKeyThatDoesNotExistsPermutationFive() throws Exception {
        int[] testInput = new int[]{2, 4, 6, 8, 10, 12};
        assertEquals(-1, steve.search(testInput, 1));
    }
}