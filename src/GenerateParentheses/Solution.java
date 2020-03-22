package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> re = new ArrayList();

    public List<String> generateParenthesis(int n) {
        char[] temp = new char[n * 2];
        gen(temp, 0, n, n);
        return re;
    }

    public void gen(char[] temp, int index, int left, int right) {
        if (left == 0 && right == 0) {

            re.add(String.copyValueOf(temp));
            return;
        }
        if (left >= 1) {
            temp[index] = '(';
            gen(temp, index + 1, left - 1, right);
        }
        if (right > left) {
            temp[index] = ')';
            gen(temp, index + 1, left, right - 1);
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(7));
    }
}
