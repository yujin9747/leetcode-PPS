import java.util.Arrays;
import java.util.Collections;
class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i=0; i<nums.length; i++) temp[i] = nums[i];
        if(k != nums.length){
            while(k > nums.length) k -= nums.length;
            for(int i=0; i<k; i++) nums[i] = temp[nums.length - k + i];
            for(int i=k; i<nums.length; i++) nums[i] = temp[i-k];  
        }
        
        
    }
}