package LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<=1)
            return s;
        int max = 0;
        int len = s.length();
        int left=0;
        int right = 0;
        //i 不能超过 j
        boolean dp[][] = new boolean[len][len];
        for (int j = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i <= 2) || dp[i + 1][j - 1]);
                if (dp[i][j]) {
                    if (j-i+1>max){
                        left=i;
                        right = j;
                        max = j - i + 1;
                    }
                }
            }
        }
        return s.substring(left, right+1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(""));
    }
}
