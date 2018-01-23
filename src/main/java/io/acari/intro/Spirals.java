package io.acari.intro;

public class Spirals {

    /**
     * Construct a square matrix with a size N × N
     * containing integers from 1 to N * N in a spiral
     * order, starting from top-left and in clockwise
     * direction.
     *
     * @param n
     * @return
     */
    int[][] spiralNumbers(int n) {
        int[][] returnValue = new int[n][n];
        returnValue[0][0] = 1;
        fillRight(returnValue, 1, 0);
        return returnValue;
    }

    private void fillRight(int[][] returnValue, int startingCol, int fixedRow) {
        if (returnValue[fixedRow][startingCol] == 0) {
            int stoppingCol = startingCol;
            for (int col = startingCol; col < returnValue.length; col++) {
                int i2 = returnValue[fixedRow][col];
                if (i2 == 0) {
                    stoppingCol = col;
                    returnValue[fixedRow][col] = returnValue[fixedRow][col - 1] + 1;
                } else {
                    break;
                }
            }
            fillDown(returnValue, stoppingCol, fixedRow + 1);
        }
    }

    private void fillDown(int[][] returnValue, int fixedCol, int startingRow) {
        if (returnValue[startingRow][fixedCol] == 0) {
            int stoppingRow = startingRow;
            for (int rowIndex = startingRow; rowIndex < returnValue.length; rowIndex++) {
                int i2 = returnValue[rowIndex][fixedCol];
                if (i2 == 0) {
                    stoppingRow = rowIndex;
                    returnValue[rowIndex][fixedCol] = returnValue[rowIndex - 1][fixedCol] + 1;
                } else {
                    break;
                }
            }
            fillLeft(returnValue, fixedCol - 1, stoppingRow);
        }
    }

    private void fillLeft(int[][] returnValue, int startingCol, int row) {
        if (returnValue[row][startingCol] == 0) {
            int stoppingColumn = startingCol;
            for (int col = startingCol; col >= 0; col--) {
                int i2 = returnValue[row][col];
                if (i2 == 0) {
                    stoppingColumn = col;
                    returnValue[row][col] = returnValue[row][col + 1] + 1;
                } else {
                    break;
                }
            }
            fillUp(returnValue, stoppingColumn, row - 1);
        }
    }

    private void fillUp(int[][] returnValue, int fixedCol, int startingRow) {
        if (returnValue[startingRow][fixedCol] == 0) {
            int stoppingRow = startingRow;
            for (int rowIndex = startingRow; rowIndex > 0; rowIndex--) {
                int i2 = returnValue[rowIndex][fixedCol];
                if (i2 == 0) {
                    stoppingRow = rowIndex;
                    returnValue[rowIndex][fixedCol] = returnValue[rowIndex + 1][fixedCol] + 1;
                } else {
                    break;
                }
            }
            fillRight(returnValue, fixedCol + 1, stoppingRow);
        }
    }
}
