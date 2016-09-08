package com.task002;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FibonnaciTest {

    @Test
    @Parameters({"100, 44",
            "4000000, 4613732"})
    public void shouldSumEvenOfFib(int limit, int result) {
        assertEquals(result, Fibonnaci.solve(limit));
    }
}