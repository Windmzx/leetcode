package binary_tree_preorder_traversal;

/**
 * Created by mzx on 2017/7/9.
 */

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root, ArrayList<Integer> res) {
        if (root==null)
            return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
}