package io.acari.prac;

import java.util.*;

public class BFS {


  int[] traverseTree(Tree<Integer> t) {
    List<Integer> nodesInOrder = new ArrayList<>();
    if(t != null){
      Set<Tree<Integer>> visited = new HashSet<>();
      Queue<Tree<Integer>> queue = new LinkedList<>();
      queue.offer(t);
      while (!queue.isEmpty()){
        Tree<Integer> current = queue.poll();
        nodesInOrder.add(current.value);
        visited.add(current);
        if(current.left != null && !visited.contains(current.left)){
          queue.offer(current.left);
        }
        if(current.right != null && !visited.contains(current.right)){
          queue.offer(current.right);
        }
      }
    }

    int[] returnGuy = new int[nodesInOrder.size()];
    for (int i = 0; i < nodesInOrder.size(); i++) {
      returnGuy[i] = nodesInOrder.get(i);
    }
    return returnGuy;
  }

  class Tree<T> {
    T value;
    Tree<T> left;
    Tree<T> right;
    Tree(T x) {
      value = x;
    }
  }
}
