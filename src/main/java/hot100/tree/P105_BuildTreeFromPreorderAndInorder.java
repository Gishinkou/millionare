package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 105. BuildTreeFromPreorderAndInorder
 */
public class P105_BuildTreeFromPreorderAndInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P105_BuildTreeFromPreorderAndInorder s = new P105_BuildTreeFromPreorderAndInorder();
        Assert.eq(s.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}) != null, true);
        Assert.summary();
    }
}
