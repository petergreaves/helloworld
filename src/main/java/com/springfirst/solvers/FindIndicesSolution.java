package com.springfirst.solvers;

import java.util.Arrays;

/**
 *
 * given an array,finds the two indices in the array that add up to the target.
 * if there are more than one, the last is returned.
 *
 * the result is sorted asc.
 *
 * if no sum exists, {0,0} is returned
 */
public class FindIndicesSolution {

    public int[] solve(int[] nums, int target) {

        int[] result = new int[2];

        int indexA = 0;


        for (; indexA < nums.length; indexA++) {

            int indexB = 0;
            for (; indexB < nums.length; indexB++) {
                if (nums[indexA] + nums[indexB] == target) {
                    result[0]=indexA;
                    result[1]=indexB;
                }
            }
        }
        // convenience
        Arrays.sort(result);
        return result;

    }
}
