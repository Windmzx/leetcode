package String2Integer;

public class Solution {


    public int myAtoi(String str) {
        boolean isvavild = false;//true if number if discover
        int res = 0;
        int id = 1;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if ((temp == '-' || temp == ' ' || temp == '+') && !isvavild || (temp - '0' >= 0 && temp - '0' <= 9)) {
                if (temp == ' ' || temp == '+')
                    continue;
                else if (temp == '-') {
                    id = -1;
                } else if (!(temp - '0' >= 0 && temp - '0' <= 9)) {
                    return res;
                } else {
                    isvavild = true;
                    int p = res * 10 + temp - '0';
                    if (p / 10 != res) {
                        return id > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    res = p;
                }
            } else if (!isvavild) {
                return 0;
            } else
                break;

        }
        if (isvavild)
            return res * id;
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("+1"));
    }
}
