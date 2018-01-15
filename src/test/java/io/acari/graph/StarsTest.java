package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class StarsTest {
  private final Stars stars = new Stars();

  @Test
  public void countStarsOne() {
    assertEquals(2,
        stars.countStars(new boolean[][]
            {{false, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false}}
        )
    );
  }

  @Test
  public void countStarsTwo() {
    assertEquals(2,
        stars.countStars(new boolean[][]
            {{false, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, true}}
        )
    );
  }

  @Test
  public void countStarsThree() {
    assertEquals(0,
        stars.countStars(new boolean[][]
            {{false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}}
        )
    );
  }

  @Test
  public void countStarsFour() {
    assertEquals(1,
        stars.countStars(new boolean[][]
            {{false, true, true, true, true, true, true, true},
                {true, false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false, false}}
        )
    );
  }

  @Test
  public void countStarsSix() {
    assertEquals(4,
        stars.countStars(new boolean[][]
            {{false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,false,true,true,true,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,false,false,false,false,true,true,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,false,false,false,true,true,false,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true}, 
 {false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,true}, 
 {false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,false,true,false}, 
 {false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,true}, 
 {false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,false,true,false}}
        )
    );
  }

  @Test
  public void countStarsFive() {
    assertEquals(3,
        stars.countStars(new boolean[][]
            {{false,false,false,false,false,true,false,true,false}, 
 {false,false,false,false,false,false,false,false,true}, 
 {false,false,false,true,false,false,true,false,false}, 
 {false,false,true,false,false,false,false,false,false}, 
 {false,false,false,false,false,false,false,false,true}, 
 {true,false,false,false,false,false,false,false,false}, 
 {false,false,true,false,false,false,false,false,false}, 
 {true,false,false,false,false,false,false,false,false}, 
 {false,true,false,false,true,false,false,false,false}}
        )
    );
  }
}