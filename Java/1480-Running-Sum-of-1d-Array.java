class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result = nums;
        
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i] + nums[i-1];
        }
        return result;
    }
}
