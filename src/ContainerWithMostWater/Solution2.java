package ContainerWithMostWater;

public class Solution2 {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int x1 = height[i];
            int x2 = height[j];
            int hg = Math.min(x1, x2);
            int temp = hg * (j - i);
            if (temp > res) {
                res = temp;
            }
            if (height[i] > height[j]) {
                j--;
            }else {
                i++;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int a = solution2.maxArea(height);
        System.out.println(a);
    }

}
