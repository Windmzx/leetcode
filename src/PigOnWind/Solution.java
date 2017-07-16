package PigOnWind;

/**
 * Created by mzx on 2017/7/16.
 */
public class Solution {
    public int calculateMax(int[] prices) {
        int firstbuy = Integer.MIN_VALUE;
        int firstsell = 0;

        int secondnbuy = Integer.MIN_VALUE;
        int secondsell = 0;

        for (int i : prices) {
            firstbuy = Math.max(firstbuy, -i);
            firstsell = Math.max(firstsell, firstbuy + i);

            secondnbuy = Math.max(secondnbuy, firstsell - i);
            secondsell = Math.max(secondsell, secondnbuy + i);
        }

        return secondsell;
    }
}
