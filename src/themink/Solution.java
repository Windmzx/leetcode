package themink;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int p[] = {2, 3, 4, 5, 5};
        Solution s = new Solution();
        System.out.println(s.getLeastNumbers(p, 2));
    }
}
