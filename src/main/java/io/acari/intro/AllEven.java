package io.acari.intro;

public class AllEven {

    boolean evenDigitsOnly(int n) {
        do {
            int digit = n % 10;
            if (isEven(digit))
                return false;
            n /= 10;
        } while (n > 0);
        return true;
    }

    private boolean isEven(int digit) {
        return digit % 2 != 0;
    }
}
