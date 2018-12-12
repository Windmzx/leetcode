package threesum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
//                    String s = "i=" + i + "  j=" + j + "  k=" + k;
//                    System.out.println(s);
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        int temp = nums[j];
                        while (j <= k && nums[j] == temp)
                            j++;
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] > 0) {
                        int temp = nums[k];
                        //移动右侧指针 且不重复
                        while (j <= k && nums[k] == temp)
                            k--;
                    }
                    if (nums[i] + nums[j] + nums[k] < 0) {
                        int temp = nums[j];
                        //移动左侧指针
                        while (j <= k && nums[j] == temp)
                            j++;
                    }

                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {-1, 0, 1, 2, -1, -4};
        int nums2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(s.threeSum(nums));

    }

}
