package io.acari.algorithms;

public class DrawingBook {

  public long find(long pageCount, long pageNumber) {
    if (pageNumber == 1 || pageNumber >= pageCount) {
      return 0;
    } else if (pageCount - pageNumber <= 2) {
      return 1;
    } else {
      long diffFromOne = pageNumber / 2;
      long diffFromEnd = (pageCount - pageNumber) / 2;
      return Math.min(diffFromOne, diffFromEnd);
    }
  }
}
