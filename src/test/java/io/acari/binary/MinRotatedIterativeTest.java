package io.acari.binary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class MinRotatedIterativeTest {
    private final MinRotatedIterative steve = new MinRotatedIterative();
    @Test
    public void searchA() throws Exception {
        int[] input = {1, 2, 3, 4, 5, 6};
        assertEquals(0, steve.search(input));
    }

    @Test
    public void searchB() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(0, steve.search(input));
    }

    @Test
    public void searchC() throws Exception {
        int[] input = {1, 2, 3, 4};
        assertEquals(0, steve.search(input));
    }

    @Test
    public void searchD() throws Exception {
        int[] input = {1, 2, 3};
        assertEquals(0, steve.search(input));
    }

    @Test
    public void searchE() throws Exception {
        int[] input = {1, 2};
        assertEquals(0, steve.search(input));
    }

    @Test
    public void searchF() throws Exception {
        int[] input = {1};
        assertEquals(0, steve.search(input));
    }

    @Test
    public void searchG() throws Exception {
        int[] input = {2, 1};
        assertEquals(1, steve.search(input));
    }

    @Test
    public void searchH() throws Exception {
        int[] input = {2, 3, 1};
        assertEquals(2, steve.search(input));
    }

    @Test
    public void searchI() throws Exception {
        int[] input = {2, 3, 4, 1};
        assertEquals(3, steve.search(input));
    }

    @Test
    public void searchJ() throws Exception {
        int[] input = {2, 3, 4, 5, 1};
        assertEquals(4, steve.search(input));
    }

    @Test
    public void searchK() throws Exception {
        int[] input = {2, 3, 4, 5, 6, 1};
        assertEquals(5, steve.search(input));
    }

    @Test
    public void searchL() throws Exception {
        int[] input = {3, 4, 5, 6, 1, 2};
        assertEquals(4, steve.search(input));
    }

    @Test
    public void searchM() throws Exception {
        int[] input = {3, 4, 5, 1, 2};
        assertEquals(3, steve.search(input));
    }

    @Test
    public void searchN() throws Exception {
        int[] input = {3, 4, 1, 2};
        assertEquals(2, steve.search(input));
    }

    @Test
    public void searchO() throws Exception {
        int[] input = {3, 1, 2};
        assertEquals(1, steve.search(input));
    }

    @Test
    public void searchP() throws Exception {
        int[] input = {4, 1, 2, 3};
        assertEquals(1, steve.search(input));
    }

    @Test
    public void searchQ() throws Exception {
        int[] input = {4, 5, 1, 2, 3};
        assertEquals(2, steve.search(input));
    }

    @Test
    public void searchR() throws Exception {
        int[] input = {4, 5, 6, 1, 2, 3};
        assertEquals(3, steve.search(input));
    }

    @Test
    public void searchT() throws Exception {
        int[] input = {4, 5, 6, 6, 6, 1, 2, 3};
        assertEquals(5, steve.search(input));
    }

    @Test
    public void searchU() throws Exception {
        int[] input = {4, 5, 5, 5, 6, 6, 6, 1, 2, 3};
        assertEquals(7, steve.search(input));
    }

    @Test
    public void searchV() throws Exception {
        int[] input = {4, 4, 4, 5, 5, 5, 6, 6, 6, 1, 2, 3};
        assertEquals(9, steve.search(input));
    }

    @Test
    public void searchW() throws Exception {
        int[] input = {4, 4, 4, 5, 5, 5, 6, 6, 6, 1, 2, 2, 2, 3};
        assertEquals(9, steve.search(input));
    }

    @Test
    public void searchX() throws Exception {
        int[] input = {4, 4, 4, 5, 5, 5, 6, 6, 6, 1, 2, 2, 2, 3, 3, 3};
        assertEquals(9, steve.search(input));
    }

    @Test
    public void searchY() throws Exception {
        int[] input = {4, 4, 4, 5, 5, 5, 6, 6, 6, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        assertEquals(9, steve.search(input));
    }

    @Test
    public void searchZ() throws Exception {
        int[] input = {4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        assertEquals(11, steve.search(input));
    }
}