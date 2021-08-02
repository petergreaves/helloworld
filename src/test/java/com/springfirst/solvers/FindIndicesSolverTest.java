package com.springfirst.solvers;

import org.junit.Test;
import org.junit.Assert;


public class FindIndicesSolverTest {

    @Test
    public void mainSuccessTest(){

        FindIndicesSolution s = new FindIndicesSolution();
        int[] result = s.solve(new int[] {2,7,11,15}, 22);
        Assert.assertTrue(result[0]==1 && result[1]==3);
    }

    @Test
    public void noResultTest(){

        FindIndicesSolution s = new FindIndicesSolution();
        int[] result = s.solve(new int[] {2,7,11,15}, 20);
        Assert.assertTrue(result[0]==0 && result[1]==0);
    }
}
