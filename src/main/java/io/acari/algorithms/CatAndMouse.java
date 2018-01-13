package io.acari.algorithms;

public class CatAndMouse {

  public String find(int catA, int catB, int mouseC) {
    int catADiff = Math.abs(mouseC - catA);
    int catBDiff = Math.abs(mouseC - catB);
    switch (Integer.compare(catADiff, catBDiff)) {
      case 1:
        return "Cat B";
      case -1:
        return "Cat A";
      default:
        return "Mouse C";
    }
  }
}
