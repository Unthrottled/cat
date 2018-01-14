package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class VagabondTest {
  private final Vagabond vagabond = new Vagabond();

  @Test
  public void livingOnTheRoadsOne() {
    assertArrayEquals(new boolean[][]
        {{false,true,true,false},
 {true,false,false,false},
 {true,false,false,false},
 {false,false,false,false}}
        ,
        vagabond.livingOnTheRoads(new boolean[][]
            {{false,true,true,false,false,false},
 {true,false,false,true,false,false},
 {true,false,false,false,false,false},
 {false,true,false,false,false,false},
 {false,false,false,false,false,true},
 {false,false,false,false,true,false}}
        )
    );
  }

  @Test
  public void livingOnTheRoadsSix() {
    assertArrayEquals(new boolean[][]
        {{false,true},
 {true,false}}
        ,
        vagabond.livingOnTheRoads(new boolean[][]
            {{false,false,true},
 {false,false,true},
 {true,true,false}}
        )
    );
  }

  @Test
  public void livingOnTheRoadsNine() {
    assertArrayEquals(new boolean[][]
        {{false,true,false,true,false,true},
 {true,false,true,false,false,true},
 {false,true,false,true,true,true},
 {true,false,true,false,true,false},
 {false,false,true,true,false,false},
 {true,true,true,false,false,false}}
        ,
        vagabond.livingOnTheRoads(new boolean[][]
            {{false,true,true,true,true,false,false,false,false}, 
 {true,false,true,false,false,true,false,false,true}, 
 {true,true,false,false,true,false,false,true,false}, 
 {true,false,false,false,true,true,true,true,false}, 
 {true,false,true,true,false,false,false,true,false}, 
 {false,true,false,true,false,false,true,true,true}, 
 {false,false,false,true,false,true,false,true,true}, 
 {false,false,true,true,true,true,true,false,false}, 
 {false,true,false,false,false,true,true,false,false}}
        )
    );
  }
}