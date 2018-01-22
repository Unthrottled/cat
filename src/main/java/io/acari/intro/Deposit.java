package io.acari.intro;

public class Deposit {

    int depositProfit(int deposit, int rate, int threshold) {
        int years = 0;
        double newDeposit = deposit;
        while (Double.compare(newDeposit, (double) threshold) < 0) {
            years++;
            newDeposit += newDeposit * (rate / 100d);
        }
        return years;
    }

}
