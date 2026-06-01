package hot100.graph;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 207. CourseSchedule
 */
public class P207_CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P207_CourseSchedule s = new P207_CourseSchedule();
        Assert.eq(s.canFinish(2, new int[][]{{1,0}}), true);
        Assert.eq(s.canFinish(2, new int[][]{{1,0},{0,1}}), false);
        Assert.summary();
    }
}
