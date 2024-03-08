class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        map.put(nums[0], 1);

        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) { 
                map.replace(nums[i], map.get(nums[i])+1);
            } else  {
                map.put(nums[i], 1);
            }
        }

        int maxValue = (Collections.max(map.values()));
        
        for (Map.Entry <Integer, Integer> entry : map.entrySet()) { 
            if (entry.getValue() == maxValue) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
