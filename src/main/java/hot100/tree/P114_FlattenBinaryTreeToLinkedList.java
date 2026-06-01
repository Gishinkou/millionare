package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 114. FlattenBinaryTreeToLinkedList
 */
public class P114_FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        // TODO
        return;
    }
    boolean runFlatten(TreeNode root) { flatten(root); /* 简化:仅检测左子全空 */ TreeNode c = root; while (c != null) { if (c.left != null) return false; c = c.right; } return true; }

    public static void main(String[] args) {
        P114_FlattenBinaryTreeToLinkedList s = new P114_FlattenBinaryTreeToLinkedList();
        Assert.eq(s.runFlatten(TreeNode.of(1,2,5,3,4,null,6)), true);
        Assert.summary();
    }
}
