class Solution {
    public boolean isPalindrome(int x) {
        String str = "" + x;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
