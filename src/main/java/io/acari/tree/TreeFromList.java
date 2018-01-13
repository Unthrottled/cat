package io.acari.tree;

import io.acari.tree.pojo.Node;
import io.acari.tree.pojo.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeFromList {

  public static Tree convert(Node head, Tree node) {
    if (head != null) {
      Tree root = new Tree(head.data);
      Node currentNode = head;
      int index = 0;
      Queue<Tree> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()) {
        Tree currentRoot = queue.poll();
        int leftIndex = (2 * index + 1) - index;
        int rightIndex = (2 * index + 2) - index;
        Node leftNode = getNode(currentNode, leftIndex);
        if (leftNode != null) {
          Tree leftTree = new Tree(leftNode.data);
          queue.offer(leftTree);
          currentRoot.left = leftTree;
        }

        Node rightNode = getNode(currentNode, rightIndex);
        if (rightNode != null) {
          Tree rightTree = new Tree(rightNode.data);
          queue.offer(rightTree);
          currentRoot.right = rightTree;
        }

        currentNode = currentNode.next;
        index++;
      }

      return root;
    }

    return node;
  }

  private static Node getNode(Node currentNode, int leftIndex) {
    while (leftIndex-- > 0 && currentNode != null) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }
}

