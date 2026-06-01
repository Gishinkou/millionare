package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 226. InvertBinaryTree
 */
public class P226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        // TODO
        return root;
    }

    public static void main(String[] args) {
        P226_InvertBinaryTree s = new P226_InvertBinaryTree();
        Assert.eq(TreeNode.toString(s.invertTree(TreeNode.of(4,2,7,1,3,6,9))), "[4,7,2,9,6,3,1]");
        Assert.summary();
    }
}
