class Solution {
    public void reverseString(char[] s) {
        
       char[] result = new char[s.length];
        
        for (int i = 0; i < s.length; i++) {
            result[i] = s[i];
        }
        
        for (int i = 0; i < s.length; i++) {
        s[i] = result[s.length-1-i];
        }

    }
}
