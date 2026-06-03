package hot100.greedy;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 55. JumpGame
 */
public class P55_JumpGame {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int canReach = 0;
        for (int i = 0; i < n; i++) {
            if (canReach < i) {
                return false;
            }
            canReach = Math.max(canReach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        P55_JumpGame s = new P55_JumpGame();
        Assert.eq(s.canJump(new int[]{2,3,1,1,4}), true);
        Assert.eq(s.canJump(new int[]{3,2,1,0,4}), false);
        Assert.summary();
    }
}
