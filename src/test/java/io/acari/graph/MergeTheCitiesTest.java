package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class MergeTheCitiesTest {
  private final MergeTheCities mergeTheCities = new MergeTheCities();

  @Test
  public void mergingCitiesOne() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, true, true, false, true},
                {true, false, false, true, true},
                {true, false, false, false, false},
                {false, true, false, false, false},
                {true, true, false, false, false}}
        ,
        mergeTheCities.mergingCities(new boolean[][]
            {{false, true, true, false, false, false, true},
                {true, false, true, false, true, false, false},
                {true, true, false, true, false, false, true},
                {false, false, true, false, false, true, true},
                {false, true, false, false, false, false, false},
                {false, false, false, true, false, false, false},
                {true, false, true, true, false, false, false}}
        )
    );
  }

  @Test
  public void mergingCitiesTwo() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, false, false},
                {false, false, false},
                {false, false, false}}

        ,
        mergeTheCities.mergingCities(new boolean[][]
            {{false, false, false},
                {false, false, false},
                {false, false, false}}

        )
    );
  }

  @Test
  public void mergingCitiesSix() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, true},
                {true, false}}
        ,
        mergeTheCities.mergingCities(
            new boolean[][]
                {{false, true, true},
                    {true, false, true},
                    {true, true, false}}

        )
    );
  }

}