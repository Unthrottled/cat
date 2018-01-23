package io.acari.intro;

public class SumItUp {

    /**
     * CodeMaster has just returned from shopping.
     * <p>
     * He scanned the check of the items he bought and gave
     * the resulting string to Ratiorg to figure out the
     * total number of purchased items.
     * <p>
     * Since Ratiorg is a bot he is definitely going to automate it,
     * so he needs a program that sums up all the numbers
     * which appear in the given input.
     * <p>
     * Help Ratiorg by writing a
     * function that returns the sum of numbers that
     * appear in the given inputString.
     *
     * @param inputString
     * @return
     */
    int sumUpNumbers(String inputString) {
        int sum = 0;
        boolean onNumber = false;
        int startIndex = 0;
        int length = inputString.length();
        for (int i = 0; i < length; i++) {
            char c = inputString.charAt(i);
            if (Character.isDigit(c)) {
                if (!onNumber) {
                    startIndex = i;
                    onNumber = true;
                }
            } else {
                if (onNumber) {
                    sum += Integer.parseInt(inputString.substring(startIndex, i));
                }
                startIndex = i + 1;
                onNumber = false;
            }
        }
        if (onNumber) sum += Integer.parseInt(inputString.substring(startIndex, length));

        return sum;
    }

}
