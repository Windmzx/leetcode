package StringtoInteger;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("-91283472332"));
    }

    public int myAtoi(String str) {
        if (str.length() < 1)
            return 0;
        int nog = 1;
        int value = 0;
        char[] chars = str.toCharArray();
        int i = 0;
        while (i < str.length() && chars[i] == ' ') {
            i++;
        }
        if (i < str.length() && chars[i] == '-') {
            nog = -1;
            i++;
        } else if (i < str.length() && chars[i] == '+') {
            i++;
        }
        int oldvalue = 0;
        for (; i < str.length(); i++) {
            if (chars[i] < '0' || chars[i] > '9')
                break;
            else {

                oldvalue = value;
                value = value * 10 + chars[i] - '0';
                if (value / 10 != oldvalue) {
                    if (nog < 0)
                        return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
            }


        }

        return value * nog;
    }

}
