package hot100.substring;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 560. SubarraySumEqualsK
 */
public class P560_SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P560_SubarraySumEqualsK s = new P560_SubarraySumEqualsK();
        Assert.eq(s.subarraySum(new int[]{1,1,1}, 2), 2);
        Assert.eq(s.subarraySum(new int[]{1,2,3}, 3), 2);
        Assert.summary();
    }
}
