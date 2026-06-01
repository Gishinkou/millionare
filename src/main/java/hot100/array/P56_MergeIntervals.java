package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 56. MergeIntervals
 */
public class P56_MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // TODO
        return new int[0][0];
    }

    public static void main(String[] args) {
        P56_MergeIntervals s = new P56_MergeIntervals();
        Assert.eq(s.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}), new int[][]{{1,6},{8,10},{15,18}});
        Assert.summary();
    }
}
