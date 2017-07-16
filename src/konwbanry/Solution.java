package konwbanry;

/**
 * Created by mzx on 2017/7/16.
 */
public class Solution {
    public int countBitDiff(int m, int n) {
        int sum=0;
        while (m != 0 || n != 0) {
           if ((m&1)!=(n&1)){
               sum++;
           }
           m=m>>1;
           n=n>>1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.countBitDiff(1999, 2299));
    }
}
