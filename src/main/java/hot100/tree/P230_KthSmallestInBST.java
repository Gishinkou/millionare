package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 230. KthSmallestInBST
 */
public class P230_KthSmallestInBST {

    public int kthSmallest(TreeNode root, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P230_KthSmallestInBST s = new P230_KthSmallestInBST();
        Assert.eq(s.kthSmallest(TreeNode.of(3,1,4,null,2), 1), 1);
        Assert.summary();
    }
}
