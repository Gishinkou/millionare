package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 98. ValidateBinarySearchTree
 */
public class P98_ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P98_ValidateBinarySearchTree s = new P98_ValidateBinarySearchTree();
        Assert.eq(s.isValidBST(TreeNode.of(2,1,3)), true);
        Assert.eq(s.isValidBST(TreeNode.of(5,1,4,null,null,3,6)), false);
        Assert.summary();
    }
}
