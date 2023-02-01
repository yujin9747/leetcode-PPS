class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0; i<numbers.length-1; i++){
            //if(numbers[i] < 0)
            for(int j=numbers.length-1; j>=i+1; j--){
                if((numbers[i] + numbers[j]) == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}