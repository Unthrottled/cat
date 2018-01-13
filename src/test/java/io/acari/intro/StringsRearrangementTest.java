package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class StringsRearrangementTest {
  private StringsRearrangement stringsRearrangement = new StringsRearrangement();

  @Test
  public void stringsRearrangementOne() throws Exception {
    assertFalse(stringsRearrangement.stringsRearrangement(new String[]{"aba",
        "bbb",
        "bab"}));
  }

  @Test
  public void stringsRearrangementTwo() throws Exception {
    assertTrue(stringsRearrangement.stringsRearrangement(new String[]{"ab",
        "bb",
        "aa"}));
  }

  @Test
  public void stringsRearrangementThree() throws Exception {
    assertFalse(stringsRearrangement.stringsRearrangement(new String[]{"q", "q"}));
  }

  @Test
  public void stringsRearrangementFour() throws Exception {
    assertTrue(stringsRearrangement.stringsRearrangement(new String[]{"zzzzab",
        "zzzzbb",
        "zzzzaa"}));
  }

  @Test
  public void stringsRearrangementFive() throws Exception {
    assertFalse(stringsRearrangement.stringsRearrangement(new String[]{"ab",
        "ad",
        "ef",
        "eg"}));
  }

  @Test
  public void stringsRearrangementSix() throws Exception {
    assertTrue(stringsRearrangement.stringsRearrangement(new String[]{"abc",
        "bef",
        "bcc",
        "bec",
        "bbc",
        "bdc"}));
  }

  @Test
  public void stringsRearrangementSeven() throws Exception {
    assertFalse(stringsRearrangement.stringsRearrangement(new String[]{"abc",
        "abx",
        "axx",
        "abc"}));
  }

  @Test
  public void stringsRearrangementEight() throws Exception {
    assertTrue(stringsRearrangement.stringsRearrangement(new String[]{"abc",
        "abx",
        "axx",
        "abx",
        "abc"}));
  }

}