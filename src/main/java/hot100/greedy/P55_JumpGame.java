package hot100.greedy;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 55. JumpGame
 */
public class P55_JumpGame {

    public boolean canJump(int[] nums) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P55_JumpGame s = new P55_JumpGame();
        Assert.eq(s.canJump(new int[]{2,3,1,1,4}), true);
        Assert.eq(s.canJump(new int[]{3,2,1,0,4}), false);
        Assert.summary();
    }
}
