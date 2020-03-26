package JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int maxlen=nums[0];
        for(int i=1;i<nums.length;i++){
            if (i<=maxlen){
                maxlen=Math.max(maxlen,nums[i]+i);
            }
        }
        return maxlen>= nums.length-1;
    }
}
