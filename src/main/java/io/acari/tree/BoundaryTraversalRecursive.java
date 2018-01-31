package io.acari.tree;

import io.acari.tree.pojo.Node;

public class BoundaryTraversalRecursive {

  public void printBoundary(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      Node left = root.left;
      printLeft(left);
      printLeaves(left);
      Node right = root.right;
      printLeaves(right);
      printRight(right);
    }
  }

  public void printLeft(Node root) {
    if (root != null) {
      if (root.left != null) {
        System.out.print(root.data + " ");
        printLeft(root.left);
      } else if (root.right != null) {
        System.out.print(root.data + " ");
        printLeft(root.right);
      }

    }
  }

  public void printLeaves(Node root) {
    if (root != null) {
      if (root.left == null && root.right == null) {
        System.out.print(root.data + " ");
      }
      printLeaves(root.left);
      printLeaves(root.right);
    }
  }

  public void printRight(Node root) {
    if (root != null) {
      if (root.right != null) {
        printRight(root.right);
        System.out.print(root.data + " ");
      } else if (root.left != null) {
        printRight(root.left);
        System.out.print(root.data + " ");
      }
    }
  }
}
