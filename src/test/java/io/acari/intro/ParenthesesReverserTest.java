package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class ParenthesesReverserTest {
  private ParenthesesReverser parenthesesReverser = new ParenthesesReverser();

  @Test
  public void reverseParenthesesOne() throws Exception {
    assertEquals("acbde", parenthesesReverser.reverseParentheses("a(bc)de"));
  }

  @Test
  public void reverseParenthesesTwo() throws Exception {
    assertEquals("apmnolkjihgfedcbq", parenthesesReverser.reverseParentheses("a(bcdefghijkl(mno)p)q"));
  }

  @Test
  public void reverseParenthesesThree() throws Exception {
    assertEquals("cosfighted", parenthesesReverser.reverseParentheses("co(de(fight)s)"));
  }

  @Test
  public void reverseParenthesesFour() throws Exception {
    assertEquals("CodeegnlleahC", parenthesesReverser.reverseParentheses("Code(Cha(lle)nge)"));
  }

  @Test
  public void reverseParenthesesFive() throws Exception {
    assertEquals("Where are the parentheses?", parenthesesReverser.reverseParentheses("Where are the parentheses?"));
  }

  @Test
  public void reverseParenthesesSix() throws Exception {
    assertEquals("abcabcabcabc", parenthesesReverser.reverseParentheses("abc(cba)ab(bac)c"));
  }

  @Test
  public void reverseParenthesesSeven() throws Exception {
    assertEquals("The god quick nworb xof jumps over the lazy", parenthesesReverser.reverseParentheses("The ((quick (brown) (fox) jumps over the lazy) dog)"));
  }

}