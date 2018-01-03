package io.acari.intro;

public class AlmostIncreasingSequence {


  boolean almostIncreasingSequence(int[] input){
    if(input.length < 2){
      return true;
    }
    return almostIncreasingSequenceHelper(input, -1, 0, 0);
  }


  private boolean almostIncreasingSequenceHelper(int[] input, int skipIndex, int previousIndex, int deletions){
    int currentIndex = previousIndex + 1;
    currentIndex = currentIndex == skipIndex ? currentIndex + 1 : currentIndex;
    for(int i = currentIndex; i < input.length; i++){
      int previous = input[previousIndex];
      int current = input[currentIndex];
      if(previous >= current){
        if(++deletions > 1){
          return false;
        }
        return almostIncreasingSequenceHelper(input, previous, current, deletions) ||
            almostIncreasingSequenceHelper(input, current, previous, deletions);

      } else {
        //happy path
        previousIndex = i;
        currentIndex = i + 1;
      }
    }

    return true;
  }

}
