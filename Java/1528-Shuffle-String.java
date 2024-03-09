class Solution {
    public String restoreString(String s, int[] indices) {
    
    Map<Integer, Character> map = new HashMap<>();
    for (int i = 0; i < indices.length; i++) {
        map.put(indices[i], s.charAt(i));
    }
    
    String ans = "";
        for(int i = 0; i < indices.length; i++){
            ans += map.get(i);
        }
        
        return ans;
        
    }
}
