package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 53. MaximumSubarray
 */
public class P53_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P53_MaximumSubarray s = new P53_MaximumSubarray();
        Assert.eq(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        Assert.summary();
    }
}
