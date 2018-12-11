public class Integer2Roman {
    public String intToRoman(int num) {
        String res = "";
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",};
        int cur = 0;
        for (int i = 0; i < val.length; i++) {
            while (num >= val[i]) {
                num -= val[i];
                res += roman[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer2Roman s = new Integer2Roman();
        String ss = s.intToRoman(123);
        System.out.println(ss);
    }
}
