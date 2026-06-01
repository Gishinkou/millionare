package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 104. MaximumDepthOfBinaryTree
 */
public class P104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P104_MaximumDepthOfBinaryTree s = new P104_MaximumDepthOfBinaryTree();
        Assert.eq(s.maxDepth(TreeNode.of(3,9,20,null,null,15,7)), 3);
        Assert.summary();
    }
}
