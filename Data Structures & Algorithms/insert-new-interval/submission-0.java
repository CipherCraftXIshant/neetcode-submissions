class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> items = new ArrayList<>();
        int i = 0;
        while(i<n && intervals[i][1] < newInterval[0]){
            items.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        items.add(newInterval);

        while(i<n){
            items.add(intervals[i]);
            i++;
        }
        int[][] arr = new int[items.size()][2];
        int a = 0;
        for(int[] x : items){
            arr[a++] = x;
        }
        return arr;
    }
}
