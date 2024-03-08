class Solution {
    public int searchInsert(int[] nums, int target) {
        
        ArrayList <Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.add(target);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            if (target == list.get(i)) {
                return i;
            }
        }
        
        return 0;
        
    }
}
