package Roman2Integer;

public class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",};
        for (int i = 0; i < roman.length; i++) {
            while (s.startsWith(roman[i])) {
//                System.out.println(val[i]);
//                System.out.println(roman[i]);
                s = s.substring(roman[i].length());
//                System.out.println(s);
//                System.out.println();
                res += val[i];
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.romanToInt("LVIII");
        System.out.println(res);
    }

}
