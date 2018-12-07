package String2Integer;

public class Solution {


    public int myAtoi(String str) {
        char[] s = str.toCharArray();
        int i = 0;
        int id = 1;
        int res = 0;
        while (i<s.length&&s[i] == ' ') i++;
        if (i >= s.length) {
            return 0;
        }
        if (s[i] == '-') {
            i++;
            id = -1;
        }else if (s[i] == '+') {
            i++;
            id = 1;
        }
        while (i < str.length() && s[i] >= '0' && s[i] <= '9') {
            int p = res * 10 + s[i] - '0';
            if (p / 10 != res)
                return id > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            i++;
            res = p;
        }
        return res * id;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("   -"));
    }
}
