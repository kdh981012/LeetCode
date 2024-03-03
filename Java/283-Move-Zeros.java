class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        
        for (int i = list.size(); i < nums.length; i ++) {
            nums[i] = 0;
        }
    }
}
