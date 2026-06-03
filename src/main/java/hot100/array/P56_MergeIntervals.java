package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 56. MergeIntervals
 */
public class P56_MergeIntervals {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            if (ans.size() > 0 && ans.get(ans.size() - 1)[1]  >= intervals[i][0]) {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        P56_MergeIntervals s = new P56_MergeIntervals();
        Assert.eq(s.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}), new int[][]{{1,6},{8,10},{15,18}});
        Assert.summary();
    }
}
