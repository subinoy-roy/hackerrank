package com.subinoyroy.hackerrank.problem002;

import java.util.Arrays;
import java.util.List;

/**
 * There is a new mobile game that starts with consecutively numbered clouds. Some clouds are thunderheads and
 * others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the
 * current cloud plus or The player must avoid the thunderheads. Determine the minimum number of jumps it will take
 * to jump from the starting position to the last cloud. It is always possible to win the game. For each game, you will
 * get an array of clouds numbered 0 or 1. 0s are safe but 1s must be avoided.
 * Find minimum number of hops required to reach the last cloud given an array of clouds.
 *
 */
class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int loc = 0;
        int hop = 0;
        while (loc < c.size()) {
            if (loc < c.size() - 2) {
                if (c.get(loc + 2) == 0) {
                    loc = loc + 2;
                    hop++;
                } else if (c.get(loc + 1) == 0) {
                    loc = loc + 1;
                    hop++;
                }
            } else if (loc < c.size() -1 && c.get(loc + 1) == 0) {
                loc = loc + 1;
                hop++;
            } else {
                loc = loc + 1;
            }
        }

        return hop;
    }

}

public class Solution {
    public static void main(String[] args) {
        int result = Result.jumpingOnClouds(Arrays.asList(0,0,0,1,0,0));
        System.out.println("Number of minimum hops: "+result);
    }
}

