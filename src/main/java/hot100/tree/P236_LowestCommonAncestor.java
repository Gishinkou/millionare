package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 236. LowestCommonAncestor
 */
public class P236_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P236_LowestCommonAncestor s = new P236_LowestCommonAncestor();
        TreeNode root = TreeNode.of(3,5,1,6,2,0,8,null,null,7,4);
        TreeNode p = root.left;            // 5
        TreeNode q = root.left.right.right; // 4
        TreeNode lca = s.lowestCommonAncestor(root, p, q);
        Assert.eq("lca(5,4)=5", lca == null ? null : lca.val, 5);
        Assert.summary();
    }
}
