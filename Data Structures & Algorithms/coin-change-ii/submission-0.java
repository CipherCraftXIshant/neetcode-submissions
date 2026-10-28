class Solution {
    public int change(int amount, int[] coins) {
        int[] comb = new int[amount+1];
        comb[0] = 1;
        for(int coin : coins){
            for(int i=coin;i<=amount;i++){
                comb[i] += comb[i-coin];
            }
        }
        return comb[amount];
    }
}
