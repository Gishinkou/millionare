package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 53. MaximumSubarray
 */
public class P53_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int ans = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            ans = Math.max(ans, pre);
        }
        return ans;
    }

    public static void main(String[] args) {
        P53_MaximumSubarray s = new P53_MaximumSubarray();
        Assert.eq(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        Assert.summary();
    }
}
