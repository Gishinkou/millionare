package hot100.greedy;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 45. JumpGameII
 */
public class P45_JumpGameII {

    public int jump(int[] nums) {
        int n = nums.length;
        int canReach = 0;
        int maxReach = 0;
        int jump = 0;
        for (int i = 0; i < n; i++) {
            if (canReach < i) {
                jump += 1;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        P45_JumpGameII s = new P45_JumpGameII();
        Assert.eq(s.jump(new int[]{2,3,1,1,4}), 2);
        Assert.summary();
    }
}
