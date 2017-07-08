package minimumdepthofbinarytree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    int dep;

    public int run(TreeNode root) {
        dep = Integer.MAX_VALUE;
        if (root == null)
            return 0;
        helper(root, 1);
        return dep;
    }

    public void helper(TreeNode treeNode, int currdep) {
        if (treeNode.left == null && treeNode.right == null)
            if (currdep < dep)
                dep = currdep;
        if (treeNode.right != null)
            helper(treeNode.right, currdep + 1);
        if (treeNode.left != null)
            helper(treeNode.left, currdep + 1);
    }
}