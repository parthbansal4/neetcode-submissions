class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peekLast()]){
                int prevIndex= stack.removeLast();
                ans[prevIndex]= i-prevIndex;
            }
            stack.addLast(i);
        }
        return ans;
    }
}
