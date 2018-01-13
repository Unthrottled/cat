package io.acari.intro;

import java.util.Deque;
import java.util.LinkedList;

public class ParenthesesReverser {


  /**
   * You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets.
   * It is guaranteed that the parentheses in s form a regular bracket sequence.
   * <p>
   * Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair.
   * The results string should not contain any parentheses.
   *
   * @param s
   * @return
   */
  String reverseParentheses(String s) {
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(c == '('){
        int closingParenIndex = findCloseParen(s.substring(i + 1)) + 1 + i;
        String fixxed = reverseParentheses(s.substring(i+1, closingParenIndex));
        s = s.substring(0, i) + new StringBuilder().append(fixxed).reverse().toString() + s.substring(closingParenIndex + 1);
      }
    }
    return s;
  }

  private int findCloseParen(String substring) {
    Deque<Character> stack = new LinkedList<>();
    for (int i = 0; i < substring.length(); i++) {
      char c = substring.charAt(i);
      if(c == '('){
        stack.offer(c);
      } else if (c == ')'){
        if(stack.isEmpty()){
          return i;
        } else {
          stack.pop();
        }
      }
    }

    return -1;
  }
}
