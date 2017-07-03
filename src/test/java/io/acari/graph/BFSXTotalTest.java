package io.acari.graph;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

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
        List<String> expectedOutput = Lists.newArrayList(
                "    X\n" +
                "    X X X X\n" +
                "    X     X");

        assertEquals(expectedOutput, steve.findTree(input));
    }

    @Test
    public void findTreeShouldFindMultiTree() throws Exception {
        char[][] input = {
                {'X','X','X',},
                {'O','O','O',},
                {'X','X','X',}
        };
        List<String> expectedOutput = Lists.newArrayList("XXX", "XXX");

        assertEquals(expectedOutput, steve.findTree(input));
    }

}