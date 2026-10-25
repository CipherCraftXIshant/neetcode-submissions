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
        int n = intervals.size();
        if(intervals.size() == 0) return 0;
        int[][] items = new int[n][2];
        int i=0;
        for(Interval x : intervals){
            items[i][0] = x.start;
            items[i][1] = x.end;
            i++;
        }
        Arrays.sort(items , (a,b) -> a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int j=0;j<n;j++){
            if(!pq.isEmpty() && items[j][0] >= pq.peek()) pq.poll();
            pq.add(items[j][1]);
        }
        return pq.size();
    }
}
