/*
생각 정리
val와 같은 요소를 모두 제거한 후의 길이를 반환한다. 
nums는 val와 같은 요소가 모두 제거되고, 앞 부분 부터 k만큼 채워진 배열로 바꾼다. 
nums의 순서는 상관이 없다. 요소만 제거하면 된다. 
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length; 
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val) {
                nums[i] = 51;
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}