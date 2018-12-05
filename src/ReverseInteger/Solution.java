package ReverseInteger;

public class Solution {
    public int reverse(int x) {

        int res = 0;
        while (x != 0) {
            int t = res * 10 + x % 10;
            if (t / 10 != res)
                return 0;
            x /= 10;
            res = t;

        }
        return res;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(Integer.valueOf("-2147483412")));
    }
}
