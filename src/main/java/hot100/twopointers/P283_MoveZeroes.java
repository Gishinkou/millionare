package hot100.twopointers;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 283. MoveZeroes
 */
public class P283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        // TODO
        return;
    }
    int[] runMove(int[] arr) { moveZeroes(arr); return arr; }

    public static void main(String[] args) {
        P283_MoveZeroes s = new P283_MoveZeroes();
        Assert.eq(s.runMove(new int[]{0,1,0,3,12}), new int[]{1,3,12,0,0});
        Assert.summary();
    }
}
