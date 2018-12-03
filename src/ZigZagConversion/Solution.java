package ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1)
            return s;
        String res = new String();
        int size = numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += size) {
                res += String.valueOf(s.charAt(j));
                int temp = j + size - 2 * i;
                if (i != 0 && i != numRows - 1 && temp < s.length()) {

                    res += String.valueOf(s.charAt(temp));
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert("PAYPALISHIRING", 3));
    }
}
