package hot100.twopointers;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 15. ThreeSum
 */
public class P15_ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P15_ThreeSum s = new P15_ThreeSum();
        Assert.eq(s.threeSum(new int[]{-1,0,1,2,-1,-4}).size(), 2);
        Assert.summary();
    }
}
