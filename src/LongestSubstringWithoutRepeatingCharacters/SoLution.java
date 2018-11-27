package LongestSubstringWithoutRepeatingCharacters;

public class SoLution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int lo = map[s.charAt(i)];
            if (map[s.charAt(i)] == -1) {
                if (i - left > res-1) {
                    res = i - left + 1;
                }
                map[s.charAt(i)] = i;
            } else if (lo < left) {
                if (i - left > res-1) {
                    res = i - left + 1;
                }
                map[s.charAt(i)] = i;
            } else {
                left = lo + 1;
                map[s.charAt(i)] = i;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        SoLution soLution = new SoLution();
        System.out.println(soLution.lengthOfLongestSubstring(""));
    }
}
