package com.task002;

public class Fibonnaci {
    public static int solve(int limit){
        int prev = 1;
        int actual = 1;
        int result = 0;

        // 1 2 3 5 8 13 21
        while (actual < limit){
            System.out.print(actual + " ");

            if (actual % 2 == 0){
                result += actual;
            }

            int temp = prev;
            prev = actual;
            actual += temp;
        }

        return result;
    }
}
