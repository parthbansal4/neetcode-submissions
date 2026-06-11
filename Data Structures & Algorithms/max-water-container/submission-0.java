class Solution {
    public int maxArea(int[] heights) {
       int left=0, right = heights.length-1;
       int ans = 0;

       while(left<right){
         int length = Math.min(heights[left], heights[right]);
         int breadth = right-left;
        
         ans = Math.max(ans, length*breadth);
         if(heights[left]<=heights[right]){
            left++;
         }else{
            right--;
         }
       } 

       return ans;
    }
}
