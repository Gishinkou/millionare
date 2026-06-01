package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 437. PathSumIII
 */
public class P437_PathSumIII {

    public int pathSum(TreeNode root, int targetSum) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P437_PathSumIII s = new P437_PathSumIII();
        Assert.eq(s.pathSum(TreeNode.of(10,5,-3,3,2,null,11,3,-2,null,1), 8), 3);
        Assert.summary();
    }
}
