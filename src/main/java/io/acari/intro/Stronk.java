package io.acari.intro;

public class Stronk {

  /**
   * Call two arms equally strong if the heaviest weights they each are able to lift are equal.
   * <p>
   * Call two people equally strong if their strongest arms are equally strong
   * (the strongest arm can be both the right and the left), and so are their weakest arms.
   * <p>
   * Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
   *
   * @param yourLeft
   * @param yourRight
   * @param friendsLeft
   * @param friendsRight
   * @return
   */
  boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return heaviestEqual(yourLeft, yourRight, friendsLeft, friendsRight) &&
        sameStronkness(yourLeft, yourRight, friendsLeft, friendsRight);
  }

  private boolean heaviestEqual(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return (yourLeft + yourRight) == (friendsLeft + friendsRight);
  }

  private boolean sameStronkness(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return strongestSame(yourLeft, yourRight, friendsLeft, friendsRight) &&
        weakestSame(yourLeft, yourRight, friendsLeft, friendsRight);
  }

  private boolean weakestSame(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight);
  }

  private boolean strongestSame(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight);
  }
}
