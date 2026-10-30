class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                String sa = s.substring(i,j+1);
                if(palindrome(sa)){
                    count  = sa.length();
                    map.put(count,sa);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int x : map.keySet()){
            if(max<x) max = x;
        }
        return map.get(max);
    }
    public boolean palindrome(String s){
        int i = 0 , j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}