package hot100.dp;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 416. PartitionEqualSubsetSum
 */
public class P416_PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P416_PartitionEqualSubsetSum s = new P416_PartitionEqualSubsetSum();
        Assert.eq(s.canPartition(new int[]{1,5,11,5}), true);
        Assert.eq(s.canPartition(new int[]{1,2,3,5}), false);
        Assert.summary();
    }
}
