class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int s:stones){
            maxHeap.add(s);
        }

        while(!maxHeap.isEmpty()){
            if(maxHeap.size()==1){
                return maxHeap.poll();
            }

            int y=maxHeap.poll();
            int x=maxHeap.poll();

            if(y-x==0){
                continue;
            }else{
                maxHeap.add(y-x);
            }
        }

        return 0;
    }
}
