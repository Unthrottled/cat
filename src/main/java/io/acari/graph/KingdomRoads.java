package io.acari.graph;

public class KingdomRoads {

  /**
   *
   * Once upon a time, in a kingdom far, far away,
   * there lived a king Byteasar I. As a kind and wise
   * ruler, he did everything in his (unlimited) power to
   * make life of his subjects comfortable and pleasant.
   *
   * One cold evening a messenger arrived to the king's castle
   * with the latest news: all kings in the Kingdoms Union
   * started to enforce traffic laws! In order not to
   * lose his membership in the Union, king Byteasar had to
   * do the same in his kingdom. But what would the citizens
   * think of it?
   *
   * The king decided to start introducing the changes with
   * something more or less simple: change all the roads in
   * the kingdom from two-directional to one-directional.
   * He personally prepared the roadRegister of the new roads,
   * and now he needs to make sure that the road system is
   * convenient and there will be no traffic jams, i.e.
   * each city has the same number of incoming and outgoing roads.
   * As the Hand of the King, you're the one who should check it.
   *
   * @param roadRegister
   * @return
   */
  boolean newRoadSystem(boolean[][] roadRegister) {
    for (int row = 0; row < roadRegister[0].length; row++) {
        if(wrongAmountOfRoads(row, roadRegister)){
          return false;
        }
    }
    return true;
  }

  private boolean wrongAmountOfRoads(int row, boolean[][] roadRegister) {
    return getIncoming(row, roadRegister) != getOutGoing(row, roadRegister);
  }

  private int getIncoming(int city, boolean[][] roadRegister) {
    int sum = 0;
    for (boolean[] aRoadRegister : roadRegister) {
      sum = aRoadRegister[city] ? sum + 1 : sum;
    }
    return sum;
  }

  private int getOutGoing(int city, boolean[][] roadRegister) {
    int sum = 0;
    for (int i = 0; i < roadRegister.length; i++) {
      sum = roadRegister[city][i] ? sum + 1 : sum;
    }
    return sum;
  }
}
