package io.acari.graph;

public class DasBook {

  /**
   * You decided to create an automatic image recognizer that
   * will determine the object in the image based on its contours.
   * The main recognition system is already implemented, and
   * now you need to start the teaching process.
   * <p>
   * Today you want to teach your program to recognize book patterns,
   * which means that you need to implement a function that, given
   * the adjacency matrix representing the contour,
   * will determine whether it's a book or not.
   * <p>
   * A book consists of a base and may have any number of pages.
   * <p>
   * The book's base consists of a single edge connecting two nodes,
   * and it is a common edge for all the pages. Besides that, every page
   * has only one node connected to both sides of the base.
   *
   * @param adj
   * @return
   */
  boolean isBook(boolean[][] adj) {
    return false;
  }
}
