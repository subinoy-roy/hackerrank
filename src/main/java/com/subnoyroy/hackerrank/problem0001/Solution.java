package com.subnoyroy.hackerrank.problem0001;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps, for every step
 * it was noted if it was an uphill or a downhill step. Hikes always start and end at sea level, and each step up
 * or down represents a unit change in altitude. We define the following terms:
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending
 * with a step-down to sea level. A valley is a sequence of consecutive steps below sea level, starting with a
 * step-down from sea level and ending with a step-up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 */
class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {

        AtomicInteger pos = new AtomicInteger(0);
        AtomicInteger valleyCount = new AtomicInteger(0);
        AtomicBoolean isValley = new AtomicBoolean(false);

        if (path.length() != steps) {
            throw new RuntimeException("Invalid Data Passed. The Length od the path should match with steps.");
        }

        Arrays.stream(path.split("")).forEach(s -> {
            pos.set("U".equals(s) ? pos.intValue() + 1 : pos.intValue() - 1);
            if (pos.intValue() < 0 & !isValley.get()) {
                isValley.set(true);
                valleyCount.incrementAndGet();
            } else if (pos.intValue() == 0 && isValley.get()) {
                isValley.set(false);
            }
        });

        return valleyCount.get();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int steps = Integer.parseInt(args[0]);
        String path = args[1];

        int result = Result.countingValleys(steps, path);

        System.out.println("Number of valleys travelled: " + result);

    }
}