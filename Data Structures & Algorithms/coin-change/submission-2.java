class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = solve(coins,amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int solve(int[] coins, int amount, int[] dp){
        if(amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return 0;
        int mini = Integer.MAX_VALUE;
        if(dp[amount] != -1) return dp[amount];

        for(int coin : coins){
            int ans = solve(coins,amount-coin,dp);

            if(ans != Integer.MAX_VALUE){
                int tAns = ans + 1;
                mini = Math.min(mini,tAns);
            }
        }
        return dp[amount] = mini;

    }
}
