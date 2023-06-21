/*
생각 정리
num2의 길이인 n 만큼 반복해야 함 -> m은 0이더라도 n은 0보다 큰 경우에도 수행해야 하기 때문이다. 
n만큼 반복하며
num1의 앞에서 부터/뒤에서 부터 값을 비교
increasing order로 정렬되어 있기 때문에 앞에서부터 비교하는 것이 비교 횟수를 줄일 것. 
num2의 값보다 큰 숫자를 찾으면, 해당 숫자 위치에 num2의 숫자를 넣고 나머지는 하나씩 뒤로 옮긴다. 

but, 하나씩 뒤로 옮기는 것의 비용이 매우 클 수 있다.
하나씩 옮기는 것의 비용을 줄이기 위한 대안은? 
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0; i<n; i++){
            while(true){
                if(j+n-i == m+n) {
                    for(int k=i; k<n; k++){
                        nums1[j] = nums2[k];
                        j++;
                    }
                    i=n;
                    break;
                }
                if(nums1[j] > nums2[i]){
                    // j = 1, k = 3, 2
                    for(int k=m-1+i; k>=j; k--){
                        nums1[k+1] = nums1[k];
                    }
                    // nums1 = {1, 4, 5, 6, 0, 0}
                    nums1[j] = nums2[i];
                    // nums1 = {1, 4, 5, 6, 0, 0}
                    j++;
                    break;
                }
                j++; 
            }
        }
    }
}