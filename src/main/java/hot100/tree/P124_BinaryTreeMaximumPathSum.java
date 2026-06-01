package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 124. BinaryTreeMaximumPathSum
 */
public class P124_BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P124_BinaryTreeMaximumPathSum s = new P124_BinaryTreeMaximumPathSum();
        Assert.eq(s.maxPathSum(TreeNode.of(1,2,3)), 6);
        Assert.summary();
    }
}
