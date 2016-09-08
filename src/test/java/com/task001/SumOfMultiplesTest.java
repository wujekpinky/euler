package com.task001;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SumOfMultiplesTest {

    @Test
    @Parameters({"10, 23",
            "1000, 233168"})
    public void shouldSumMultiplesOf3Or5(int below, int expected) {
        assertEquals(expected, SumOfMultiples.solve(below));
    }
}
