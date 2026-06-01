package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 102. BinaryTreeLevelOrderTraversal
 */
public class P102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P102_BinaryTreeLevelOrderTraversal s = new P102_BinaryTreeLevelOrderTraversal();
        Assert.eq(s.levelOrder(TreeNode.of(3,9,20,null,null,15,7)).size(), 3);
        Assert.summary();
    }
}
