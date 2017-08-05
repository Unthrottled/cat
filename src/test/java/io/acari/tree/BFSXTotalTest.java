package io.acari.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class BFSXTotalTest {
    private final BFSXTotal steve = new BFSXTotal();

    @Test
    public void findTreeShouldFindSingleTree() throws Exception {
        char[][] input = {
                {'O', 'O', 'O', 'X', 'O', 'O', 'O',},
                {'O', 'X', 'X', 'X', 'X', 'X', 'O',},
                {'O', 'X', 'O', 'O', 'O', 'X', 'O',}
        };
        int expectedOutput = 1;

        assertEquals(expectedOutput, steve.findTree(input));
    }

    @Test
    public void findTreeShouldFindMultiTree() throws Exception {
        char[][] input = {
                {'X', 'X', 'X',},
                {'O', 'O', 'O',},
                {'X', 'X', 'X',}
        };
        int expectedOutput = 2;

        assertEquals(expectedOutput, steve.findTree(input));
    }

    @Test
    public void findTreeShouldFindMultiTreePartTwo() throws Exception {
        char[][] input = {
                {'X', 'X', 'O',},
                {'O', 'O', 'X',},
                {'O', 'X', 'O',},
                {'O', 'O', 'O',},
                {'X', 'O', 'X',},
                {'X', 'O', 'X',},
                {'O', 'X', 'O',},
                {'X', 'X', 'O',},
                {'X', 'X', 'X',},
                {'O', 'O', 'O',},
        };
        int expectedOutput = 6;

        assertEquals(expectedOutput, steve.findTree(input));
    }

    @Test
    public void findTreeShouldFindRightThingPartTwo() throws Exception {
        char[][] input = {
                {'O', 'O', 'O', 'O', 'X', 'X', 'O',},
                {'O', 'X', 'O', 'X', 'O', 'O', 'X',},
                {'X', 'X', 'X', 'X', 'O', 'X', 'O',},
                {'O', 'X', 'X', 'X', 'O', 'O', 'O',}
        };
        int expectedOutput = 4;

        assertEquals(expectedOutput, steve.findTree(input));
    }

}