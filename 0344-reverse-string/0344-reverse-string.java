class Solution {
    public void reverseString(char[] s) {
        char temp;
        int j = s.length - 1;
        for(int i=0; i<s.length / 2; i++){
            temp = s[i];
            s[i] = s[j-i];
            s[j-i] = temp;
        }
    }
}