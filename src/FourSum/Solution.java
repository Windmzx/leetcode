package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null)
            return null;
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4)
            return result;
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 3; index++) {
            if (index == 0 || nums[index] != nums[index - 1]) {
                threesum(nums, index, target - nums[index], result);
            }

        }
        return result;
    }


    private void threesum(int[] nums, int head, int target, List<List<Integer>> res) {

        for (int i = head + 1; i < nums.length - 2; i++) {
            if (i == head+1 ||  nums[i] != nums[i - 1]) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
//                    String s = "i=" + i + "  j=" + j + "  k=" + k;
//                    System.out.println(s);
                    if (nums[i] + nums[j] + nums[k] == target) {
                        res.add(Arrays.asList(nums[head], nums[i], nums[j], nums[k]));
                        int temp = nums[j];
                        while (j <= k && nums[j] == temp)
                            j++;
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] > target) {
                        int temp = nums[k];
                        //移动右侧指针 且不重复
                        while (j <= k && nums[k] == temp)
                            k--;
                    }
                    if (nums[i] + nums[j] + nums[k] < target) {
                        int temp = nums[j];
                        //移动左侧指针
                        while (j <= k && nums[j] == temp)
                            j++;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 0, 0, 0};
        System.out.println(s.fourSum(nums, 0));
    }
}
