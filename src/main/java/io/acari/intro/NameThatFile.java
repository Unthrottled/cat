package io.acari.intro;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

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
        processPostFixedFileName(fileNames, current, lastOpenIndex, lastClosingIndex);
      } else if(fileNames.containsKey(current)) {

      } else {
        //first time we have seen this!
        fileNames.put(current, newSetPlusOne());
      }
    }
    return names;
  }

  private void processPostFixedFileName(Map<String, SortedSet<Integer>> fileNames, String current, int lastOpenIndex, int lastClosingIndex) {
    int number = -1;
    boolean hasNumber = true;
    try {
      number = Integer.parseInt(current.substring(lastOpenIndex + 1, lastClosingIndex));
    } catch (RuntimeException e) {
      hasNumber = false;
    }
    if (hasNumber) {
      processNumberedPostfix(fileNames, current, lastOpenIndex, number);
    } else if (fileNames.containsKey(current)) {

    } else {
      //first time we have seen this!
      fileNames.put(current, newSetPlusOne());
    }
  }

  private void processNumberedPostfix(Map<String, SortedSet<Integer>> fileNames, String current, int lastOpenIndex, int number) {
    String minusPostFix = current.substring(0, lastOpenIndex);
    SortedSet<Integer> integers = fileNames.getOrDefault(minusPostFix, newSortedSet());
    if(!integers.add(number)){
      //The same! make a new one!
      fileNames.put(current, newSetPlusOne());
    } else {
      //unique value!
      fileNames.put(minusPostFix, integers);
    }
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
