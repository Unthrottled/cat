package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class NameThatFileTest {
  private final NameThatFile nameThatFile = new NameThatFile();

  @Test
  public void fileNamingOne() throws Exception {
    assertArrayEquals(new String[]{"doc",
        "doc(1)",
        "image",
        "doc(1)(1)",
        "doc(2)"},
        nameThatFile.fileNaming(new String[]{"doc",
            "doc",
            "image",
            "doc(1)",
            "doc"})
    );
  }

  @Test
  public void fileNamingTwo() throws Exception {
    assertArrayEquals(new String[]{"a(1)",
            "a(6)",
            "a",
            "a(2)",
            "a(3)",
            "a(4)",
            "a(5)",
            "a(7)",
            "a(8)",
            "a(9)",
            "a(10)",
            "a(11)"},
        nameThatFile.fileNaming(new String[]{"a(1)",
            "a(6)",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a"})
    );
  }

  @Test
  public void fileNamingThree() throws Exception {
    assertArrayEquals(new String[]{"dd",
        "dd(1)",
        "dd(2)",
        "dd(3)",
        "dd(1)(1)",
        "dd(1)(2)",
        "dd(1)(1)(1)",
        "dd(4)",
        "dd(1)(3)"},
        nameThatFile.fileNaming(new String[]{"dd",
            "dd(1)",
            "dd(2)",
            "dd",
            "dd(1)",
            "dd(1)(2)",
            "dd(1)(1)",
            "dd",
            "dd(1)"})
    );
  }

}