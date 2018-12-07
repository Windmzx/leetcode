package PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int com = 0;
        int sou = x;
        while (x != 0) {
            com = com * 10 + x % 10;
            x /= 10;
        }
        if (sou == com)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(11));
    }
}
