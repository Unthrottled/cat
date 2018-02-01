package io.acari.core;

public class LineEmUpBois {

  /**
   * To prepare his students for an upcoming game,
   * the sports coach decides to try some new training
   * drills. To begin with, he lines them up and starts
   * with the following warm-up exercise: when the
   * coach says 'L', he instructs the students to turn
   * to the left. Alternatively, when he says 'R', they
   * should turn to the right. Finally, when the coach
   * says 'A', the students should turn around.
   * <p>
   * Unfortunately some students (not all of them, but
   * at least one) can't tell left from right, meaning they
   * always turn right when they hear 'L' and left when
   * they hear 'R'. The coach wants to know how many times
   * the students end up facing the same direction.
   * <p>
   * Given the list of commands the coach has given, count
   * the number of such commands after which the students
   * will be facing the same direction.
   *
   * @param commands
   * @return
   */
  int lineUp(String commands) {
    if (commands.length() < 2)
      return 0;

    int iCantDirections = 0;

    return iCantDirections;
  }

}
