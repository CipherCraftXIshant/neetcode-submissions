class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];
        int a = 0;

        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(!q.isEmpty() && q.peekFirst() <= i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                arr[a++] = nums[q.peekFirst()];
            }
        }
        return arr;
    }
}
