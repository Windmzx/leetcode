package longest_substring_without_repeating_characters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int map[] = new int[26];
        int now = 0;
        int curl = 0;
        while (now != s.length()) {
            map[s.charAt(now)-'a'] = 1;
            curl = 1;
            for (int i = now + 1; i < s.length(); i++) {
                if (map[s.charAt(i) - 'a'] == 0) {
                    map[s.charAt(i)-'a'] = 1;
                    curl += 1;
                    maxlength = curl > maxlength ? curl : maxlength;
                } else {
                    now = i + 1;
                    curl = 0;
                    reset(map);
                    i = now + 1;
                }
            }
        }
        return maxlength;
    }

    void reset(int[] map) {
        for (int i = 0; i < map.length; i++) {
            map[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }

}
