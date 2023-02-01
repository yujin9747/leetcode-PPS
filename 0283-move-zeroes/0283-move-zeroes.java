class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;   // 0이 아닌 숫자가 들어갈 위치
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[position] = nums[i];
                position++;
            }
        }
        for(int i=position; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}