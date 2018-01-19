package io.acari.prac;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class ArtThouFeelingItNowTest {
  private final ArtThouFeelingItNow artThouFeelingItNow = new ArtThouFeelingItNow();

  @Test
  public void areFollowingPatternsOne() {
    assertTrue(artThouFeelingItNow.areFollowingPatterns(new String[]
            {"cat",
                "dog",
                "dog"}
        , new String[]
            {"a",
                "b",
                "b"}
    ));
  }

  @Test
  public void areFollowingPatternsTwo() {
    assertFalse(artThouFeelingItNow.areFollowingPatterns(new String[]
            {"cat",
                "dog",
                "doggy"}
        , new String[]
            {"a",
                "b",
                "b"}
    ));
  }
}