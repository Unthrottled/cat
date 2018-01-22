package io.acari.intro;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    /**
     * Sudoku is a number-placement puzzle.
     * <p>
     * The objective is to fill a 9 × 9 grid with digits
     * so that each column, each row, and each of the nine
     * 3 × 3 sub-grids that compose the grid contains all of
     * the digits from 1 to 9.
     *
     * @param grid
     * @return
     */
    boolean sudoku(int[][] grid) {
        return validateVertical(grid) &&
                validateHorizontal(grid) &&
                validateGroups(grid);
    }

    private boolean validateGroups(int[][] grid) {
        for (int i = 0; i < grid.length; i += 3) {
            for (int j = 0; j < grid.length; j += 3) {
                if (isInvalidGroup(grid, i, j))
                    return false;
            }
        }

        return true;
    }

    private boolean isInvalidGroup(int[][] grid, int i, int j) {
        Set<Integer> set = new HashSet<>(9);
        int i1 = i + 3;
        int i2 = j + 3;
        for (int k = i; k < i1; k++) {
            for (int l = j; l < i2; l++) {
                if (isInvalid(set, grid[k][l]))
                    return true;
            }
        }
        return false;
    }

    private boolean validateVertical(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (inValidVertical(grid, i))
                return false;
        }
        return true;
    }

    private boolean validateHorizontal(int[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            if (inValidHorizontal(grid[i]))
                return false;
        }
        return true;
    }

    private boolean inValidHorizontal(int[] i) {
        Set<Integer> set = new HashSet<>(i.length);
        for (int i1 : i) {
            if (isInvalid(set, i1))
                return true;
        }
        return badSize(i, set);
    }

    private boolean inValidVertical(int[][] i, int col) {
        Set<Integer> set = new HashSet<>(i.length);
        for (int j = 0; j < i.length; j++) {
            int i1 = i[j][col];
            if (isInvalid(set, i1))
                return true;
        }
        return badSize(i[0], set);
    }

    private boolean badSize(int[] i, Set<Integer> set) {
        return set.size() < i.length;
    }

    private boolean isInvalid(Set<Integer> set, int i1) {
        return i1 < 1 || i1 > 9 || !set.add(i1);
    }
}
