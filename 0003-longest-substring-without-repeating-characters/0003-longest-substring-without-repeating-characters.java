class Solution {
    public int lengthOfLongestSubstring(String s) {
        String curr = "";
        int max=0;
        
        for(int i=0; i<s.length(); i++){
            if(!curr.contains(s.charAt(i) + "")){
                curr += s.charAt(i) + "";
                
                // 마지막 문자인 경우, max인지 확인 후 종료
                if(i == s.length()-1 && curr.length() > max) max = curr.length();   
            }
            else {
                // 중복 이전까지의 길이가 max보다 큰지 확인
                if(curr.length() > max) max = curr.length();
                
                // 중복 문자 다음부터 새로운 문자를 만든다
                int duplicatedPosition = curr.indexOf(s.charAt(i) + "");
                curr = curr.substring(duplicatedPosition + 1, curr.length());
                curr += s.charAt(i) + "";
            }
        }
        return max;
    }
}