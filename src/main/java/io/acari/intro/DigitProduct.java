package io.acari.intro;

public class DigitProduct {

    /**
     * @param product
     * @return
     */
    int digitsProduct(int product) {
        if (product == 0)
            return 10;
        else if (product == 1)
            return 1;
        else
            return derive(product);
    }

    private int derive(int product) {
        int integers = 0;
        int i = 0;
        while (product > 1) {
            int number = -1;
            for (int j = 9; j > -1; --j) {
                double k = product / (double) j;
                if (Double.compare(k, Math.floor(k)) == 0) {
                    number = j;
                    break;
                }
            }
            if (number < 2 && i > 0) {
                return -1;
            }
            integers += (Math.pow(10, i)) * number;
            product /= number;
            i++;
        }
        return integers;
    }
}
