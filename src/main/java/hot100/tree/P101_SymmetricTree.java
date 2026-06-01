package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 101. SymmetricTree
 */
public class P101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P101_SymmetricTree s = new P101_SymmetricTree();
        Assert.eq(s.isSymmetric(TreeNode.of(1,2,2,3,4,4,3)), true);
        Assert.summary();
    }
}
