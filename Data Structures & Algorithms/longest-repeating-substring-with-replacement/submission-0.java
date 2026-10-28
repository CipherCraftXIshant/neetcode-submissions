class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i = 0 ,j=0, maxLen = 0, maxFreq = 0;
        int[] freq = new int[27];

        while(j<n){
            char ch = s.charAt(j);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[ch - 'A']);
            if(j-i+1 - maxFreq <= k){
                maxLen = Math.max(maxLen,j-i+1);
                j++;
            }else{
                freq[s.charAt(i) - 'A']--;
                i++;
                j++;
            }
        }
        return maxLen;
    }
}
