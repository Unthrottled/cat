package io.acari.dp;

public class SpecialMatrix {

    public long find(Integer[][] matrix){
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }

            System.out.println();
        }

        return -1;
    }
}
