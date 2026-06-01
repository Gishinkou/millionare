package hot100.tech;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 31. NextPermutation
 */
public class P31_NextPermutation {

    public void nextPermutation(int[] nums) {
        // TODO
        return;
    }
    int[] runNextPerm(int[] arr) { nextPermutation(arr); return arr; }

    public static void main(String[] args) {
        P31_NextPermutation s = new P31_NextPermutation();
        Assert.eq(s.runNextPerm(new int[]{1,2,3}), new int[]{1,3,2});
        Assert.eq(s.runNextPerm(new int[]{3,2,1}), new int[]{1,2,3});
        Assert.summary();
    }
}
