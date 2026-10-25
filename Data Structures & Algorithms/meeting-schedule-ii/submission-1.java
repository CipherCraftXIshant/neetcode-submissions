/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size() == 0) return 0;
        if(intervals.size() == 1) return 1;
        int[][] items = new int[intervals.size()][2];
        int i=0;
        for(Interval x : intervals){
            items[i][0] = x.start;
            items[i][1] = x.end;
            i++;
        }
        Arrays.sort(items , (a,b) -> a[0]-b[0]);
        int prev = items[0][1];
        int count = 0;
        for(int j=1;j<intervals.size();j++){
            if(items[j][0] < prev) count++ ;
            else prev = items[j][1];
        }
        return count;
    }
}
