public class binarySearch {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int low = 0;
        int mid =0;
        int high = nums.length-1;
        while(low<high){
            if(nums[low] == target) return low;
            if(nums[low]>target) return -1;
            if(nums[high]<target) return -1;
            mid = (low+high)/2;
            if(nums[mid]==target) high=mid;
            if(nums[mid]<target) low=mid+1;
            if(nums[mid]>target) high=mid-1;
        }
        if(nums[high] == target){
            return high;
        }
        return -1;
    }
}
