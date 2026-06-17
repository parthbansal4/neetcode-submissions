class Solution {

    public int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int search(int[] nums, int target) {
        int pivotIndex = findPivot(nums);
        int start = 0;
        int end=nums.length-1;
        if(target > nums[end]){
            end=pivotIndex-1;

            while(start<=end){
                int mid = (start+end)/2;

                if(target==nums[mid]){
                    return mid;
                }else if(target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }else{
            start=pivotIndex;
            while(start<=end){
                int mid = (start+end)/2;

                if(target==nums[mid]){
                    return mid;
                }else if(target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }            
        }
        return -1;
    }
}
