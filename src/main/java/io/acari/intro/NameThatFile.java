package io.acari.intro;

import java.util.*;

public class NameThatFile {

  /**
   * You are given an array of desired filenames in the order
   * of their creation.
   * <p>
   * Since two files cannot have equal names, the
   * one which comes later will have an addition to its name in
   * a form of (k), where k is the smallest positive integer such
   * that the obtained name is not used yet.
   * <p>
   * Return an array of names that will be given to the files.
   *
   * @param names
   * @return
   */
  String[] fileNaming(String[] names) {
    int length = names.length;
    Map<String, SortedSet<Integer>> fileNames = new HashMap<>(length);
    for (int i = 0; i < length; i++) {
      String current = names[i];
      int lastOpenIndex = current.lastIndexOf('(');
      int lastClosingIndex = current.lastIndexOf(')');
      boolean validPostfix = lastOpenIndex > -1 && lastClosingIndex - lastOpenIndex > 0;
      if (validPostfix) {
        int number = -1;
        boolean hasNumber = true;
        try {
          number = Integer.parseInt(current.substring(lastOpenIndex + 1, lastClosingIndex));
        } catch (RuntimeException e) {
          hasNumber = false;
        }

        if (hasNumber && number > 0) {
          String minusPostFix = current.substring(0, lastOpenIndex);
          SortedSet<Integer> integers = fileNames.getOrDefault(minusPostFix, newSortedSet());
          if (!integers.add(number)) {
            //The same! make a new one!
            SortedSet<Integer> v = newSetPlusOne();
            fileNames.put(current, v);
            postFixThatShit(names, fileNames, i, current);
          } else {
            //unique value!
            fileNames.put(minusPostFix, integers);
          }
        } else if (fileNames.containsKey(current)) {

        } else {
          //first time we have seen this!
          fileNames.put(current, newSetPlusOne());
        }
      } else if (fileNames.containsKey(current)) {
        postFixThatShit(names, fileNames, i, current);
      } else {
        //first time we have seen this!
        fileNames.put(current, newSetPlusOne());
      }
    }
    return names;
  }

  private void postFixThatShit(String[] names, Map<String, SortedSet<Integer>> fileNames, int i, String current) {
    SortedSet<Integer> integers = fileNames.get(current);
    int nextNumberToPostFix = getNextNumber(integers);
    integers.add(nextNumberToPostFix);
    appendPostFix(names, i, current, nextNumberToPostFix);
  }

  private void appendPostFix(String[] names, int i, String current, int nextNumberToPostFix) {
    names[i] = current + "(" + nextNumberToPostFix + ")";
  }

  private int getNextNumber(SortedSet<Integer> integers) {
    Iterator<Integer> iterator = integers.iterator();
    for (int i = 0; i < integers.size(); i++) {
      Integer next = iterator.next();
      if(i != next){
        //there's a discrepancy in the range!
        return i + 1;
      }
    }
    return integers.last() + 1;
  }

  private SortedSet<Integer> newSortedSet() {
    return new TreeSet<>();
  }

  private SortedSet<Integer> newSetPlusOne() {
    SortedSet<Integer> integers = newSortedSet();
    integers.add(0);
    return integers;
  }


}
