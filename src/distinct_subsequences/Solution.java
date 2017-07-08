package distinct_subsequences;

/**
 * Created by mzx on 2017/7/8.
 */

/**
 * 给定字符串S和字符串T，计算S中不同子序列的数目。字符串的子序列是由原始字符串形成的新字符串，
 * 通过删除一些（可以不是）字符而不干扰 剩余字符的相对位置。 （即“ACE”是“ABCDE”的次序，而“AEC”不是）。
 * 这里是一个例子：S =“rabbbit”，T =“rabbit”Return3。
 */
public class Solution {
    public int numDistinct(String S, String T) {
        int dp[][] = new int[S.length() + 1][T.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < S.length() + 1; i++) {
            for (int j = 1; j < T.length() + 1; j++) {
                if (S.charAt(i-1) == T.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }

        return dp[S.length() ][T.length() ];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numDistinct("ba", "a"));
    }
}