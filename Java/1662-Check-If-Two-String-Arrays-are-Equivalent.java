class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1 = new StringBuilder("");
        
        for(String temp : word1)
        sb1.append(temp);
        
        StringBuilder sb2 = new StringBuilder("");
        
        for(String temp : word2)
        sb2.append(temp);
        
        if (sb1.toString().equals(sb2.toString())){
            return true;
        }
        
        else {
            return false;
        }
    }
}
