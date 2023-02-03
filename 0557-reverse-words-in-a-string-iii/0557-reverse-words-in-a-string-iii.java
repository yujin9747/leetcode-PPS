class Solution {
    public String reverseWords(String s) {
        String result = "";
        
        String[] tokens = s.split(" ");
        
        for(int i=0; i<tokens.length; i++){
            for(int j=tokens[i].length()-1; j>=0; j--){
                result += tokens[i].charAt(j);
            }
            if(i != tokens.length - 1) result += " ";
        }
        return result;
    }
}