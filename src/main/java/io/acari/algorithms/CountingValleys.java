package io.acari.algorithms;

public class CountingValleys {

  public long find(String steve) {
    long valleys = 0;
    long currentHeight = 0;
    for (char jerry : steve.toCharArray()) {
      if (jerry == 'U') {
        if (currentHeight++ == -1) {
          valleys++;
        }
      } else if (jerry == 'D') {
        currentHeight--;
      }
    }

    return valleys;
  }
}
