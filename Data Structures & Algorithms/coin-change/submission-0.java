class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        if(n == 1 && coins[0] > amount) return 0;
        int sum = 0;

        int ans = 0;
        for(int i=0;i<n;i++){
            sum += coins[i];
            if(sum >= amount) ans ++;
        }
        return ans == 0 ? -1 : ans; 
    }
}
