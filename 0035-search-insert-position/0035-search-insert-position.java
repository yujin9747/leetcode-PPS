class Solution {
    int target;
    int nums[];
    public int searchInsert(int[] nums, int target) {
        this.target = target;
        this.nums = nums;
        return recursive(0, nums.length);
    }
    
    private int recursive(int low, int high){
        if((high - low) > 1){
           int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return recursive(mid+1, high);
            }
            else {
                return recursive(low, mid);
            } 
        }
        else{ 
            if((high - low) == 1)  { // 남은 배열의 길이가 1인 경우.
                if(nums[low] < target) return low+1;    // target이 더 큰 경우, 오른쪽에 insert
                else return low;    // target이 같거나, 더 작은 경우에는 low 위치
            }
            else{   // 남은 배열의 길이가 0인 경우.
                return high;
            }
        }
    }
}