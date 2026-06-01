package hot100.hashtable;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 1. TwoSum
 */
public class P1_TwoSum {
    public static void main(String[] args) {
        P1_TwoSum s = new P1_TwoSum();
        Assert.eq(s.twoSum(new int[]{2,7,11,15}, 9), new int[]{0,1});
        Assert.eq(s.twoSum(new int[]{3,2,4}, 6), new int[]{1,2});
        Assert.summary();
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int want = target - nums[i];
            if (map.containsKey(want)) {
                return new int[]{map.get(want), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }


}
