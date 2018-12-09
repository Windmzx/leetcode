package ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int x1 = height[i];
                int x2 = height[j];
                int hg = Math.min(x1, x2);
                int temp = hg * (j - i);
                if (temp > res) {
                    res = temp;
                }

            }

        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution s = new Solution();
        System.out.println(s.maxArea(height));
    }

}
