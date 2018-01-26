package io.acari.core;

public class DennisTheTennis {

  /**
   * In tennis, a set is finished when one of the players wins 6 games and the other one
   * wins less than 5, or, if both players win at least 5 games, until one of
   * the players wins 7 games.
   * <p>
   * Determine if it is possible for a tennis set to be
   * finished with the score score1 : score2.
   *
   * @param score1
   * @param score2
   * @return
   */
  boolean tennisSet(int score1, int score2) {
    if(score1 == 7){
      return correctSeven(score2);
    } else if (score2 == 7){
      return correctSeven(score1);
    } else if (score1 == 6) {
      return correctSix(score2);
    } else{
      return score2 == 6 && correctSix(score1);
    }
  }

  private boolean correctSix(int score2) {
    return score2 > -1 && score2 < 5;
  }

  private boolean correctSeven(int score2) {
    return score2 < 7 && score2 > 4;
  }

}
