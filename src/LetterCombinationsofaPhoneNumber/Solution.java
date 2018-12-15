package LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        List<String> res2 = new ArrayList<>();
        if (digits.length() < 1) {
            return res;
        }
        String[] dict = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        char[] nums = digits.toCharArray();
        res.add("");
        for (char num : nums) {
            char[] temp = dict[num - '0'].toCharArray();
            for (String re : res) {
                for (char c : temp) {
                    res2.add(re + c);
                }
            }
            res.clear();
            res.addAll(res2);
            res2.clear();
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
