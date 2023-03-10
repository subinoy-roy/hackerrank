package com.subnoyroy.hackerrank.problem0001;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultTest {
    @Test
    public void testOne() {
        assertEquals(1, Result.countingValleys(8,"UDDDUDUU"));
    }

    @Test
    public void testTwo() {
        assertEquals(2, Result.countingValleys(12,"DDUUDDUDUUUD"));
    }
}