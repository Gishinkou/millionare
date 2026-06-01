package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 94. BinaryTreeInorderTraversal
 */
public class P94_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P94_BinaryTreeInorderTraversal s = new P94_BinaryTreeInorderTraversal();
        Assert.eq(s.inorderTraversal(TreeNode.of(1,null,2,3)).toString(), "[1, 3, 2]");
        Assert.summary();
    }
}
