package subsets_ii;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mzx on 2017/6/30.
 * 链接：https://www.nowcoder.com/questionTerminal/66cf0498e9fd4730ab453dac978bf7e6
 * 来源：牛客网
 * Given a collection of integers that might contain duplicates,
 * S, return all possible subsets.
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * <p>
 * For example, If
 * S
 * =[1,2,2], a solution is:
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(num);
        res.add(new ArrayList<>(list));
        helper(res, list, 0, num);
        return res;
    }

    public void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int start, int num[]) {
        for (int i = start; i < num.length; i++) {
            if (i == start || num[i] != num[i - 1]) {
                list.add(num[i]);
                res.add(new ArrayList<>(list));
                helper(res, list, i + 1, num);
                list.remove(list.size() - 1);
            }

        }

    }
}