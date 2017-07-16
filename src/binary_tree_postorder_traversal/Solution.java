package binary_tree_postorder_traversal;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * Created by mzx on 2017/7/9.
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root, ArrayList<Integer> res) {
        if (root==null)
            return;
        helper(root.left, res);
        helper(root.right, res);
        res.add(root.val);
    }
}
