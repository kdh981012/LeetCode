class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        }
        
        else {
            return haystack.indexOf(needle);
        }
    }
}
