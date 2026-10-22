class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize !=0) return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : hand){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x : hand){
            if(map.get(x) == 0) continue;
            for(int i=0;i<groupSize;i++){
                int card = x + i;

                if(map.getOrDefault(card,0) == 0) return false;
                map.put(card,map.get(card)-1);
            }
        }
        return true;
    }
}
