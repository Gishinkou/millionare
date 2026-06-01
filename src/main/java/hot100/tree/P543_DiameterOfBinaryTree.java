package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 543. DiameterOfBinaryTree
 */
public class P543_DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P543_DiameterOfBinaryTree s = new P543_DiameterOfBinaryTree();
        Assert.eq(s.diameterOfBinaryTree(TreeNode.of(1,2,3,4,5)), 3);
        Assert.summary();
    }
}
