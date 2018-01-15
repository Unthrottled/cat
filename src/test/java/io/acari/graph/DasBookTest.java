package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class DasBookTest {
  private final DasBook dasBook = new DasBook();

  @Test
  public void isBookOne() {
    assertTrue(dasBook.isBook(new boolean[][]
           {{false, true, true, true},
            {true, false, true, true},
            {true, true, false, false},
            {true, true, false, false}}
    ));
  }

  @Test
  public void isBookTwo() {
    assertTrue(dasBook.isBook(new boolean[][]
        {{false, true},
            {true, false}}
    ));
  }

  @Test
  public void isBookThree() {
    assertFalse(dasBook.isBook(new boolean[][]
           {{false, false, true, true, true},
            {false, false, false, true, true},
            {true, false, false, true, true},
            {true, true, true, false, true},
            {true, true, true, true, false}}
    ));
  }

  @Test
  public void isBookFour() {
    assertTrue(dasBook.isBook(new boolean[][]
        {{false, true, false, false, false, false, true, false, false, false},
            {true, false, true, true, true, true, true, true, true, true},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {true, true, true, true, true, true, false, true, true, true},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false}}
    ));
  }

  @Test
  public void isBookFive() {
    assertFalse(dasBook.isBook(new boolean[][]
        {{false, false, false, true, true},
            {false, false, false, true, true},
            {false, false, false, true, true},
            {true, true, true, false, true},
            {true, true, true, true, true}}
    ));
  }

  @Test
  public void isBookFour_1() {
    assertTrue(dasBook.isBook(new boolean[][]
           {{false, true, false, false, false, false, true, false, false, false},
            {true,  false,true,  true,  true,  true,  true, true,  true,  true},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {true,  true, true,  true,  true,  true,  false,true,  true,  true},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false},
            {false, true, false, false, false, false, true, false, false, false}}
    ));
  }
}