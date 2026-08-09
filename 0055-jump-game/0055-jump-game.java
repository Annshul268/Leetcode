class Solution {
    public boolean canJump(int[] nums) {
        int canReachidx = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > canReachidx) return false;

            canReachidx = Math.max(canReachidx, i + nums[i]);  // the max idx we can reach from any idx will be curr idx and its value or previous canReachidx
        }

        return true;
    }
}