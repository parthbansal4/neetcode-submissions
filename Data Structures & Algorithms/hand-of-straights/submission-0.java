class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map= new HashMap<>();

        Arrays.sort(hand);
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }

        for(int i=0;i<hand.length;i++){
            if(map.containsKey(hand[i])){
                map.put(hand[i],map.get(hand[i])-1);

                if(map.get(hand[i])==0){
                    map.remove(hand[i]);
                }
                int val = hand[i];
                int size=groupSize-1;
                while(size!=0){
                    val++;
                    if(!map.containsKey(val)){
                        return false;
                    }else{
                        map.put(val,map.get(val)-1);
                        if(map.get(val)==0){
                            map.remove(val);
                        }
                    }
                    size--;
                }
                if(size!=0){
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;

    }
}
