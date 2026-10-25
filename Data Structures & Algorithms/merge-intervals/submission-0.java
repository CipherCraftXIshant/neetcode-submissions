class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[][] res = new int[n][2];
        int r =0;
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        int i = 0;
        while(i<n){
            int start = intervals[i][0];
            int end = intervals[i][1];

            while(i+1<n && end >= intervals[i+1][0]){
                end = Math.max(end,intervals[i+1][1]);
                i++;
            }
            res[r++] = new int [] {start,end};
            i++;
        }
        return Arrays.copyOf(res, r);
    }
}
