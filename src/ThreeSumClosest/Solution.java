package ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mindiff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                String s = "i=" + i + "  j=" + left + "  k=" + right;
                System.out.println(s);
                int sum = nums[i] + nums[left] + nums[right];
                int newdiff = Math.abs(sum - target);
                if (newdiff < mindiff) {
                    mindiff = newdiff;
                    res = sum;
                }
                if (sum > target)
                    right--;
                else
                    left++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {1, 1, 1, 0};
        int res = s.threeSumClosest(nums, 100);
        System.out.println(res);

    }
}
