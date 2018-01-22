package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class SudokuValidatorTest {
    private final SudokuValidator sudokuValidator = new SudokuValidator();

    @Test
    public void sudokuOne() throws Exception {
        assertTrue(sudokuValidator.sudoku(new int[][]
                {{1, 3, 2, 5, 4, 6, 9, 8, 7},
                        {4, 6, 5, 8, 7, 9, 3, 2, 1},
                        {7, 9, 8, 2, 1, 3, 6, 5, 4},
                        {9, 2, 1, 4, 3, 5, 8, 7, 6},
                        {3, 5, 4, 7, 6, 8, 2, 1, 9},
                        {6, 8, 7, 1, 9, 2, 5, 4, 3},
                        {5, 7, 6, 9, 8, 1, 4, 3, 2},
                        {2, 4, 3, 6, 5, 7, 1, 9, 8},
                        {8, 1, 9, 3, 2, 4, 7, 6, 5}}
        ));
    }

    @Test
    public void sudokuTwo() throws Exception {
        assertFalse(sudokuValidator.sudoku(new int[][]
                {{1, 3, 2, 5, 4, 6, 9, 2, 7},
                        {4, 6, 5, 8, 7, 9, 3, 8, 1},
                        {7, 9, 8, 2, 1, 3, 6, 5, 4},
                        {9, 2, 1, 4, 3, 5, 8, 7, 6},
                        {3, 5, 4, 7, 6, 8, 2, 1, 9},
                        {6, 8, 7, 1, 9, 2, 5, 4, 3},
                        {5, 7, 6, 9, 8, 1, 4, 3, 2},
                        {2, 4, 3, 6, 5, 7, 1, 9, 8},
                        {8, 1, 9, 3, 2, 4, 7, 6, 5}}
        ));
    }

    @Test
    public void sudokuThree() throws Exception {
        assertFalse(sudokuValidator.sudoku(new int[][]
                {{1, 3, 4, 2, 5, 6, 9, 8, 7},
                        {4, 6, 8, 5, 7, 9, 3, 2, 1},
                        {7, 9, 2, 8, 1, 3, 6, 5, 4},
                        {9, 2, 3, 1, 4, 5, 8, 7, 6},
                        {3, 5, 7, 4, 6, 8, 2, 1, 9},
                        {6, 8, 1, 7, 9, 2, 5, 4, 3},
                        {5, 7, 6, 9, 8, 1, 4, 3, 2},
                        {2, 4, 5, 6, 3, 7, 1, 9, 8},
                        {8, 1, 9, 3, 2, 4, 7, 6, 5}}
        ));
    }

}