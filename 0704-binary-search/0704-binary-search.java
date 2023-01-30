class Solution {
    int target;
    int[] nums;
    public int search(int[] nums, int target) {
        this.target = target;
        this.nums = nums;
        return recursiveSearch(0, nums.length);
    }

    private int recursiveSearch(int start, int end){
        if(start >= end) return -1;
        int mid = (start + end)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return recursiveSearch(mid+1, end);
        else return recursiveSearch(start, mid);
    }
}