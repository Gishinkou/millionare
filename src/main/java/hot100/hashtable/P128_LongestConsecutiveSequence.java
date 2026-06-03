package hot100.hashtable;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 128. LongestConsecutiveSequence
 */
public class P128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int x : set) {
            if (set.contains(x + 1)) {
                continue;
            }
            int cur = 1;
            while (set.contains(x - 1)) {
                cur += 1;
                x = x - 1;
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }

    public static void main(String[] args) {
        P128_LongestConsecutiveSequence s = new P128_LongestConsecutiveSequence();
        Assert.eq(s.longestConsecutive(new int[]{100,4,200,1,3,2}), 4);
        Assert.eq(s.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}), 9);
        Assert.summary();
    }
}
