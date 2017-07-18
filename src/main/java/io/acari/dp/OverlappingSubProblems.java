package io.acari.dp;

public class OverlappingSubProblems {

    public int fib(int n) {
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String... args){
        OverlappingSubProblems steve = new OverlappingSubProblems();
        System.out.println(steve.fib(13));
    }
}
