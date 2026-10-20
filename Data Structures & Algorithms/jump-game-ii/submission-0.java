class Solution {
    public int jump(int[] nums) {
        int curReach = 0;
        int maxReach = 0;
        int jump = 0;

        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach,i+nums[i]);
            if(i == curReach){
                curReach = maxReach;
                jump++;
            }
        }
        return jump;
    }
}
