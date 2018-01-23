package io.acari.intro;

public class ChangePlaces {

    /**
     * Given an array of integers,
     * replace all the occurrences of elemToReplace with substitutionElem.
     *
     * @param inputArray
     * @param elemToReplace
     * @param substitutionElem
     * @return
     */
    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }

}
