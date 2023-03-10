package com.subinoyroy.hackerrank.problem002;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class ResultTest extends TestCase {

    @Test
    public void testOne(){
        assertEquals(4, Result.jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0)));
    }

    @Test
    public void testTwo(){
        assertEquals(3, Result.jumpingOnClouds(Arrays.asList(0,0,0,1,0,0)));
    }


}