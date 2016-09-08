package com.task001;

public class SumOfMultiples {
    public static int solve(int below) {
        int result = 0;
        for (int i = 0; i < below; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
