package io.acari.core;

public class MaryIsInLove {

  /**
   * Once Mary heard a famous song, and a line from it stuck in her head.
   * That line was "Will you still love me when I'm no longer young and
   * beautiful?". Mary believes that a person is loved if and only if he/she
   * is both young and beautiful, but this is quite a depressing thought,
   * so she wants to put her belief to the test.
   * <p>
   * Knowing whether a person is young, beautiful and loved, find out if they
   * contradict Mary's belief.
   * <p>
   * A person contradicts Mary's belief if one of the following statements is true:
   * <p>
   * they are young and beautiful but not loved;
   * they are loved but not young or not beautiful.
   *
   * @param young
   * @param beautiful
   * @param loved
   * @return
   */
  boolean willYou(boolean young, boolean beautiful, boolean loved) {
    return (young && beautiful && !loved) || (loved && !(young && beautiful));
  }

}
