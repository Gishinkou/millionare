package hot100.common;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val; this.left = left; this.right = right;
    }

    /** 按 mybatis 层序构造,null 表示空节点。例: of(3,9,20,null,null,15,7) */
    public static TreeNode of(Integer... vals) {
        if (vals.length == 0 || vals[0] == null) return null;
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < vals.length) {
            TreeNode cur = q.poll();
            if (i < vals.length && vals[i] != null) {
                cur.left = new TreeNode(vals[i]);
                q.offer(cur.left);
            }
            i++;
            if (i < vals.length && vals[i] != null) {
                cur.right = new TreeNode(vals[i]);
                q.offer(cur.right);
            }
            i++;
        }
        return root;
    }

    /** 层序输出,便于打印对比 */
    public static String toString(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        List<String> out = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) { out.add("null"); continue; }
            out.add(String.valueOf(n.val));
            q.offer(n.left);
            q.offer(n.right);
        }
        while (!out.isEmpty() && out.get(out.size() - 1).equals("null")) out.remove(out.size() - 1);
        sb.append(String.join(",", out));
        return sb.append("]").toString();
    }
}
