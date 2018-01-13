package io.acari.intro;

public class SpookyGhosts {

  /**
   * After they became famous, the CodeBots all decided to move to a new building and live together.
   * The building is represented by a rectangular matrix of rooms.
   * Each cell in the matrix contains an integer that represents the price of the room.
   * Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are afraid of them.
   * That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots to live in.
   *
   * @param building
   * @return
   */
  int matrixElementsSum(int[][] building) {
    int sum = 0;
    for (int i = 0; i < building.length; i++) {
      for (int j = 0; j < building[i].length; j++) {
        int roomCost = building[i][j];
        if (isSuitableForLiving(building, i, j, roomCost)) {
          sum += roomCost;
        } else {
          //no good is haunted!
          building[i][j] = 0;
        }
      }
    }
    return sum;
  }

  private boolean isSuitableForLiving(int[][] building, int i, int j, int roomCost) {
    return !(isHaunted(roomCost) || isRoomAboveHaunted(building, i - 1, j));
  }

  private boolean isRoomAboveHaunted(int[][] building, int row, int col) {
    return row > -1 && col < building[row].length && isHaunted(building[row][col]);
  }

  private boolean isHaunted(int roomCost) {
    return roomCost == 0;
  }


}
