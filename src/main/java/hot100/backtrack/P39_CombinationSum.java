package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 39. CombinationSum
 */
public class P39_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P39_CombinationSum s = new P39_CombinationSum();
        Assert.eq(s.combinationSum(new int[]{2,3,6,7}, 7).size(), 2);
        Assert.summary();
    }
}
