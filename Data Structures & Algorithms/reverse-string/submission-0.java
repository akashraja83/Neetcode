class Solution {
    public void reverseString(char[] s) {
       int len = s.length;
       char[] ch = new char[len];
       for(int i = len-1 , j=0;i>=0;i--,j++){
        ch[j] = s[i];
       }
       for(int i=0;i<len;i++){
            s[i] = ch[i];
       }
    }
}