package io.acari.graph;

import java.util.ArrayList;
import java.util.List;

public class TheKingIsBroke {

  /**
   * Once upon a time, in a kingdom far, far away, there
   * lived a king Byteasar IV. As Interkingdomial financial
   * crisis was roaring through the neighborhood, Byteasar was
   * struggling with keeping the economy out of recession.
   * Unfortunately there was not much he could do. After long
   * and deep thinking, the king came to the only solution: one
   * of his cities should be demolished, since keeping
   * communication between all the cities is way too expensive.
   * <p>
   * It is not yet known if Byteasar chose the city to destroy
   * after a careful planning or picked one at random. As a
   * person with PhD in history and Nobel prize in Computer Science,
   * you can solve this mystery. Archaeologists have recently
   * found a manuscript with the information about the roads
   * between the cities, that is now stored in the roadRegister
   * matrix. You want to try and remove each city one by one and
   * compare the road registers obtained this way. Thus you'll be
   * able to compare the obtained roads and determine whether the
   * one picked by Byteasar was the best by some criteria.
   * <p>
   * Given the roadRegister, return an array of all the road
   * registers obtained after removing each of the city one by one.
   *
   * @param roadRegister
   * @return
   */
  boolean[][][] financialCrisis(boolean[][] roadRegister) {
    int length = roadRegister.length;
    List<boolean[][]> list = new ArrayList<>(roadRegister.length);
    for (int j = 0; j < length; j++) {
      boolean[][] booleans = removeCity(j, roadRegister);
      list.add(booleans);
    }

    boolean[][][] roadMaps = new boolean[list.size()][][];
    for (int j = 0; j < list.size(); j++) {
      roadMaps[j] = list.get(j);
    }

    return roadMaps;
  }

  private boolean[][] removeCity(int cityToRemove, boolean[][] roadRegister) {
    int length = roadRegister.length;
    int i1 = length - 1;
    boolean[][] newMap = new boolean[i1][i1];
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (i == cityToRemove || j == cityToRemove)
          continue;
        int indexI = getIndexI(cityToRemove, j);
        int indexJ = getIndexI(cityToRemove, i);
        newMap[indexI][indexJ] = roadRegister[i][j];
      }
    }

    return newMap;
  }

  private int getIndexI(int cityToRemove, int j) {
    int indexI;
    if (j > cityToRemove)
      indexI = j - 1;
    else
      indexI = j;
    return indexI;
  }

}
