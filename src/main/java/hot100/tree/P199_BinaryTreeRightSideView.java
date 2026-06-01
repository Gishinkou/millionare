package hot100.tree;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 199. BinaryTreeRightSideView
 */
public class P199_BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P199_BinaryTreeRightSideView s = new P199_BinaryTreeRightSideView();
        Assert.eq(s.rightSideView(TreeNode.of(1,2,3,null,5,null,4)).toString(), "[1, 3, 4]");
        Assert.summary();
    }
}
