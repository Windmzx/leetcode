package path_sum_ii;


import java.util.ArrayList;

/**
 * Created by mzx on 2017/7/8.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        helper(root, sum, res, tmp);
        return res;

    }

    public void helper(TreeNode root, int sum, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp) {
        if (root == null)
            return;
        tmp.add(root.val);
        if (root.left == null && root.right == null && sum - root.val == 0)
            res.add(new ArrayList<>(tmp));
        helper(root.left, sum - root.val, res, tmp);
        helper(root.right, sum - root.val, res, tmp);
        //必须回退
        tmp.remove(tmp.size() - 1);
    }
}
