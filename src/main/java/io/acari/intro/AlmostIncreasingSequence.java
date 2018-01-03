package io.acari.intro;

public class AlmostIncreasingSequence {


  boolean almostIncreasingSequence(int[] input){
    if(input.length < 2){
      return true;
    }
    return almostIncreasingSequenceHelper(input, -1, 0, 0);
  }


  private boolean almostIncreasingSequenceHelper(int[] input, int skipIndex, int previousIndex, int deletions){
    int beforePreviousIndex = previousIndex - 1;
    beforePreviousIndex = beforePreviousIndex == skipIndex ? beforePreviousIndex - 1 : beforePreviousIndex;
    beforePreviousIndex = beforePreviousIndex < 0 ? 0 : beforePreviousIndex;

    int currentIndex = previousIndex + 1;
    currentIndex = currentIndex == skipIndex ? currentIndex + 1 : currentIndex;
    for(int i = currentIndex; i < input.length; i++){
      int previousValue = input[previousIndex];
      int currentValue = input[currentIndex];
      if(previousValue >= currentValue ||((input[beforePreviousIndex] >= previousValue &&
          beforePreviousIndex != previousIndex &&
          beforePreviousIndex != skipIndex))){
        if(++deletions > 1){
          return false;
        }
        return almostIncreasingSequenceHelper(input, previousIndex, currentIndex, deletions) ||
            almostIncreasingSequenceHelper(input, currentIndex, previousIndex, deletions);

      } else {
        //happy path
        previousIndex = i;
        currentIndex = i + 1;
      }
    }

    return true;
  }

}
