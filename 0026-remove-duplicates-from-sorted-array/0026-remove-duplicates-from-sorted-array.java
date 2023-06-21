/*
nums[i]의 범위를 벗어나는 숫자 101을 이용해서 중복 요소를 제거한다. 
101로 대체 된 중복 요소가 모두 뒤로 가도록 오름 차순 정렬한다. 
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 101;
        int k = nums.length; 
        for(int i=0; i<nums.length; i++){
            if(nums[i] == prev){
                nums[i] = 101;
                k--;
            }
            else{
                prev = nums[i];
            }
        }
        Arrays.sort(nums);
        return k;
    }
}