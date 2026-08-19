class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxlen = 0;
        int[] hash = new int[128];
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            l = Math.max(l,hash[ch]);
            hash[ch] = r+1;
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
