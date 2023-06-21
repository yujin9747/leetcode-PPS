/*
생각 정리
val와 같은 요소를 모두 제거한 후의 길이를 반환한다. 
nums는 val와 같은 요소가 모두 제거되고, 앞 부분 부터 k만큼 채워진 배열로 바꾼다. 
nums의 순서는 상관이 없다. 요소만 제거하면 된다. 

int length = nums.length; 
1. nums의 길이만큼 반복한다. i = 0; i < n; i++
    a. nums[i]와 val를 비교한다
        1) 같다면 
            다른 요소가 나올 때까지 찾아간다. 
            k = i; k<length; k++
                nums[k]와 val을 비교한다
                1) 같다면 k++
                2) 다르다면 
                   k부터 그 이하의 모든 요소를 i위치부터 차례대로 넣는다. 
                   다 넣었으면 남은 공간을 -1로 채운다(nums[i] >= 0)
        2) 다르다면 i++
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