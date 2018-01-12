package io.acari.graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class ChangePlacesTest {
  private final ChangePlaces changePlaces = new ChangePlaces();

  @Test
  public void greatRenamingOne() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, false, false, true},
                {false, false, true, true},
                {false, true, false, true},
                {true, true, true, false}},
        changePlaces.greatRenaming(new boolean[][]
            {{false, true, true, false},
                {true, false, true, false},
                {true, true, false, true},
                {false, false, true, false}}
        )
    );
  }

  @Test
  public void greatRenamingTwo() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, false},
                {false, false}},
        changePlaces.greatRenaming(new boolean[][]
            {{false, false},
                {false, false}}
        )
    );
  }

  @Test
  public void greatRenamingThree() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, true, true},
                {true, false, true},
                {true, true, false}},
        changePlaces.greatRenaming(new boolean[][]
            {{false, true, true},
                {true, false, true},
                {true, true, false}}
        )
    );
  }

  @Test
  public void greatRenamingFour() throws Exception {
    assertArrayEquals(new boolean[][]
            {{false, true, false},
                {true, false, true},
                {false, true, false}},
        changePlaces.greatRenaming(new boolean[][]
            {{false, true, true},
                {true, false, false},
                {true, false, false}}
        )
    );
  }

}